package org.emftext.refactoring.languages.java.smell.android.refactorings;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emftext.language.java.expressions.Expression;
import org.emftext.language.java.instantiations.NewConstructorCall;
import org.emftext.language.java.members.ClassMethod;
import org.emftext.language.java.members.MembersPackage;
import org.emftext.language.java.parameters.OrdinaryParameter;
import org.emftext.language.java.references.ElementReference;
import org.emftext.language.java.references.IdentifierReference;
import org.emftext.language.java.references.Reference;
import org.emftext.language.java.resource.java.IJavaOptions;
import org.emftext.language.java.statements.ExpressionStatement;
import org.emftext.language.java.statements.Statement;
import org.emftext.language.refactoring.refactoring_specification.RefactoringSpecification;
import org.emftext.language.refactoring.roles.Role;
import org.emftext.refactoring.ltk.IModelRefactoringWizardPage;
import org.emftext.refactoring.registry.rolemapping.AbstractRefactoringPostProcessor;
import org.emftext.refactoring.util.RoleUtil;

public class ShowUnTouchable extends AbstractRefactoringPostProcessor {

	@Override
	public IStatus process(Map<Role, List<EObject>> roleRuntimeInstanceMap, EObject refactoredModel, ResourceSet resourceSet, ChangeDescription change, RefactoringSpecification refSpec, List<IModelRefactoringWizardPage> customWizardPages, boolean isFakeRun, Map<EObject, EObject> copier, List<? extends EObject> initialSelection) {
		
		NewConstructorCall decimalCall = RoleUtil.getFirstObjectForRole("Selection", NewConstructorCall.class, roleRuntimeInstanceMap);
		EList arguments = decimalCall.getArguments();
		
		Object element = "48";
		
		for (i=1;i==10;i++)
		{
		arguments.set(i, element);
		}

		return Status.OK_STATUS;
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
