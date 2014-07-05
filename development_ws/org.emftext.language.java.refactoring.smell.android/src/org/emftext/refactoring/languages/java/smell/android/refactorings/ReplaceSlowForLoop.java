package org.emftext.refactoring.languages.java.smell.android.refactorings;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emftext.commons.layout.LayoutInformation;
import org.emftext.language.java.annotations.AnnotationInstance;
import org.emftext.language.java.classifiers.AnonymousClass;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.expressions.AssignmentExpression;
import org.emftext.language.java.expressions.Expression;
import org.emftext.language.java.expressions.ExpressionsPackage;
import org.emftext.language.java.expressions.impl.ExpressionsFactoryImpl;
import org.emftext.language.java.references.Reference;
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
		
		/*AssignmentExpression e = parsePartialFragment(
				this.PART_TEST, 
				ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION, 
				AssignmentExpression.class).get(0);*/
		
		/*
		StatementsFactory sf = new StatementsFactoryImpl();
		
		LocalVariableStatement lvs = sf.createLocalVariableStatement();
		LocalVariable lv = new VariablesFactoryImpl().createLocalVariable();
		lv.setName("klaus");
		//lv.setInitialValue();
		lvs.setVariable(lv);
		//lv.setInitialValue(new DecimalIn);
		 */
	
		fi.addBeforeContainingStatement(createExtendedForLoop(fi.getStatement()));
		
		return Status.OK_STATUS;
		
		/*return super.process(roleBindings, refactoredModel, resourceSet, change,
				refSpec, customWizardPages, isFakeRun, copier);
				*/
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
