package org.emftext.refactoring.languages.java.smell.android.refactorings;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.BasicNotifierImpl.EAdapterList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.internal.operations.ExpansionRegionOperations;
import org.emftext.commons.layout.LayoutInformation;
import org.emftext.language.java.annotations.AnnotationAttribute;
import org.emftext.language.java.annotations.AnnotationInstance;
import org.emftext.language.java.classifiers.AnonymousClass;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.expressions.AdditiveExpression;
import org.emftext.language.java.expressions.AssignmentExpression;
import org.emftext.language.java.expressions.AssignmentExpressionChild;
import org.emftext.language.java.expressions.Expression;
import org.emftext.language.java.expressions.ExpressionList;
import org.emftext.language.java.expressions.ExpressionsPackage;
import org.emftext.language.java.expressions.RelationExpression;
import org.emftext.language.java.expressions.RelationExpressionChild;
import org.emftext.language.java.expressions.impl.ExpressionsFactoryImpl;
import org.emftext.language.java.members.Field;
import org.emftext.language.java.references.IdentifierReference;
import org.emftext.language.java.references.Reference;
import org.emftext.language.java.references.ReferenceableElement;
import org.emftext.language.java.references.impl.IdentifierReferenceImpl;
import org.emftext.language.java.resource.java.IJavaOptions;
import org.emftext.language.java.statements.ExpressionStatement;
import org.emftext.language.java.statements.ForEachLoop;
import org.emftext.language.java.statements.ForLoopInitializer;
import org.emftext.language.java.statements.LocalVariableStatement;
import org.emftext.language.java.statements.Statement;
import org.emftext.language.java.statements.StatementsFactory;
import org.emftext.language.java.statements.impl.ExpressionStatementImpl;
import org.emftext.language.java.statements.impl.ForEachLoopImpl;
import org.emftext.language.java.statements.impl.ForLoopImpl;
import org.emftext.language.java.statements.impl.StatementsFactoryImpl;
import org.emftext.language.java.types.ClassifierReference;
import org.emftext.language.java.types.Type;
import org.emftext.language.java.types.TypeReference;
import org.emftext.language.java.variables.LocalVariable;
import org.emftext.language.java.variables.Variable;
import org.emftext.language.java.variables.VariablesFactory;
import org.emftext.language.java.variables.impl.LocalVariableImpl;
import org.emftext.language.java.variables.impl.VariablesFactoryImpl;
import org.emftext.language.refactoring.refactoring_specification.RefactoringSpecification;
import org.emftext.language.refactoring.roles.Role;
import org.emftext.refactoring.ltk.IModelRefactoringWizardPage;
import org.emftext.refactoring.registry.rolemapping.AbstractRefactoringPostProcessor;
import org.emftext.refactoring.util.RoleUtil;

public class ReplaceSlowForLoop extends
	AbstractRefactoringPostProcessor {
	
	private final String PART_TEST = "int klaus = 5";
	
	@Override
	public IStatus process(Map<Role, List<EObject>> roleBindings,
			EObject refactoredModel, ResourceSet resourceSet,
			ChangeDescription change, RefactoringSpecification refSpec,
			List<IModelRefactoringWizardPage> customWizardPages,
			boolean isFakeRun, Map<EObject, EObject> copier) {
		
		ForLoopImpl fi = RoleUtil.getFirstObjectForRole(
				"Selection", ForLoopImpl.class, roleBindings);
	
		Variable indexVariable = getIndexVariable(fi.getInit());
		Variable iterableVariable = getIterableVariable(indexVariable, (RelationExpression)fi.getCondition());
		ForEachLoop extendedLoop = createExtendedForLoop(fi.getStatement());
	
		fi.addBeforeContainingStatement(extendedLoop);
		
		return Status.OK_STATUS;
		
		/*return super.process(roleBindings, refactoredModel, resourceSet, change,
				refSpec, customWizardPages, isFakeRun, copier);
				*/
	}
	
	private Variable getIterableVariable(Variable indexVariable, RelationExpression condition){
		Variable result = null;
		
		System.out.println(condition.getChildren().size());
		for(RelationExpressionChild relationExpressionChild : condition.getChildren()){
			
			if (relationExpressionChild instanceof IdentifierReference){
				IdentifierReference ref = (IdentifierReference)relationExpressionChild;
				ReferenceableElement target = ref.getTarget();
				if(target.eIsProxy()){
					EcoreUtil.resolveAll(condition);
					EcoreUtil.resolveAll(ref);
				}
				System.out.println(ref.getTarget().eClass().getName());
				System.out.println(ref.getTarget().getName());
				if (ref.getTarget() instanceof Variable) {
					System.out.println("yay!");
					
				}
				//test(ref);
				
			}
			if (relationExpressionChild instanceof AdditiveExpression){
				//relationExpressionChild
				throw new RuntimeException("AdditiveExpressions in the for loop "
						+ "condition are not yet supported.");
			}
		}
		
		return result;
	}
	
	private void test(IdentifierReference ref){
		System.out.println(ref.eClass().getEAllAttributes().size());
		System.out.println(ref.eClass().getEAllContainments().size());
		System.out.println(ref.eClass().getName());
		System.out.println(ref.getContainingConcreteClassifier());
		System.out.println("Test:" + ref.getTarget().eClass().getName());
		
		System.out.println(ref.getTarget().eClass().getEAllContainments().size());
		
		AnnotationAttribute att = (AnnotationAttribute) ref.getTarget();
		
		System.out.println(att.getDefaultValue());
		System.out.println(att.getName());
		System.out.println(att.getTypeReference());
		System.out.println(att.getTypeParameters().size());
		System.out.println(att.eClass().getName());
		
		LocalVariable dings = (LocalVariable)att;
		
		System.out.println(dings.getTypeReference());
		
		for (EReference r : ref.getTarget().eClass().getEAllContainments()){
			System.out.println(r.getName());
		}
		
		for (EReference r : ref.eClass().getEAllContainments()){
			System.out.println(r.getName());
		}
		System.out.println(ref.eClass().getEAttributes().size());
		
	}
	
	private LocalVariable getIndexVariable(ForLoopInitializer init) {
		LocalVariable result = null;
		
		if(init instanceof LocalVariable){
			result = (LocalVariable)init;
		}
		if(init instanceof AssignmentExpression){
			AssignmentExpression assignmentExpression = (AssignmentExpression)init;
			AssignmentExpressionChild child = assignmentExpression.getChild();
			System.out.println(child.getType());
			System.out.println(child.eClass().getName());
		}
		if(init instanceof ExpressionList){
			ExpressionList expressionList = (ExpressionList)init;
			
			AssignmentExpression assignmentExpression = 
					(AssignmentExpression)expressionList.getExpressions().get(0);
			System.out.println(assignmentExpression.getChild().eClass().getName());
			IdentifierReference ref = (IdentifierReference)assignmentExpression.getChild();
			System.out.println(ref.getTarget().getName());
			System.out.println(determineVariable(ref));
			System.out.println(determineVariable(ref.getTarget()));
		}
		
		
		return result;
	}
	
	private Variable determineVariable(EObject obj){
		Variable result = null;
		
		TreeIterator<EObject> iterator = obj.eAllContents();
		while (iterator.hasNext()) {
			EObject eObject = (EObject) iterator.next();
			if (eObject instanceof Variable) {
				return result;
			}
		}
		return result;
	}

	private ForEachLoop createExtendedForLoop(Statement statement){
		ForEachLoop result = null; 
		StatementsFactoryImpl statementsFactory = new StatementsFactoryImpl();
		
		
		result = statementsFactory.createForEachLoop();
		result.setStatement(statement);
		
		return result;
	}
	
	/**
	 * Parses the given <code>fragment</code> and returns the according model
	 * elements. The parameter <code>startRule</code> specifies the
	 * {@link EClass} which should be the starting rule.
	 * 
	 * @param fragment
	 * @param startRule
	 * @return
	 */
	public static <RuleType extends EObject> List<RuleType> parsePartialFragment(
			String fragment, EClass startRule, Class<RuleType> type) {
		URI uri = URI.createURI("temp.java");
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(uri);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(
				fragment.getBytes());
		Map<?, ?> typeOption = Collections.singletonMap(
				IJavaOptions.RESOURCE_CONTENT_TYPE, startRule);
		try {
			resource.load(inputStream, typeOption);
		} catch (IOException e) {
			e.printStackTrace();
		}
		List<RuleType> result = new ArrayList<RuleType>();
		for (EObject parseResult : resource.getContents()) {
			if (type.isInstance(parseResult)) {
				result.add(type.cast(parseResult));
			}
		}
		return result;
	}

}
