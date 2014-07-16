package org.emftext.refactoring.languages.java.smell.android.refactorings;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emftext.language.java.classifiers.ClassifiersPackage;
import org.emftext.language.java.classifiers.util.ClassifiersAdapterFactory;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.references.MethodCall;
import org.emftext.language.java.resource.java.IJavaOptions;
import org.emftext.language.java.statements.StatementListContainer;
import org.emftext.language.java.statements.StatementsFactory;
import org.emftext.language.java.statements.impl.ForLoopImpl;
import org.emftext.language.java.statements.impl.StatementListContainerImpl;
import org.emftext.language.java.statements.impl.StatementsFactoryImpl;
import org.emftext.language.java.statements.util.StatementsAdapterFactory;
import org.emftext.language.refactoring.refactoring_specification.RefactoringSpecification;
import org.emftext.language.refactoring.roles.Role;
import org.emftext.refactoring.ltk.IModelRefactoringWizardPage;
import org.emftext.refactoring.registry.rolemapping.AbstractRefactoringPostProcessor;
import org.emftext.refactoring.util.RoleUtil;

public class CreateFindViewByIdCache extends AbstractRefactoringPostProcessor {

	private static final String NESTED_CACHE_CLASS = "\tprivate static class FindViewCache{\n\t\tprivate static SparseArray<View> cache =  new SparseArray<View>();\n\t\t\n\t\tpublic static View getCachedView(Activity activity, int viewID){\n\t\t\tView result = cache.get(viewID);\n\t\t\t\n\t\t\tif(result==null){\n\t\t\t\tresult = activity.findViewById(viewID);\n\t\t\t\tcache.put(viewID, result);\n\t\t\t}\n\t\t\t\n\t\t\treturn result;\n\t\t}\n\t}\n";

	@Override
	public IStatus process(Map<Role, List<EObject>> roleBindings,
			EObject refactoredModel, ResourceSet resourceSet,
			ChangeDescription change, RefactoringSpecification refSpec,
			List<IModelRefactoringWizardPage> customWizardPages,
			boolean isFakeRun, Map<EObject, EObject> copier) {
		
		MethodCall uncachedViewCall = RoleUtil.getFirstObjectForRole(
				"Selection", MethodCall.class, roleBindings);

		CompilationUnit cu = uncachedViewCall.getContainingCompilationUnit();
		System.out.println(cu.getName());
		System.out.println(cu.getClassifiers().size());
		System.out.println(cu.getClassifiers().get(0).getName());
		System.out.println(cu.getClassifiers().get(0).eClass().getName());
		
		org.emftext.language.java.classifiers.Class containingClass 
			= (org.emftext.language.java.classifiers.Class)cu.getClassifiers().get(0);
		
		
		
		org.emftext.language.java.classifiers.Class nestedCache = 
				parsePartialFragment(
						NESTED_CACHE_CLASS, 
						ClassifiersPackage.Literals.CLASS, 
						org.emftext.language.java.classifiers.Class.class).get(0);
		
		containingClass.getMembers().get(0).addBeforeContainingStatement(nestedCache);		
		
		
		//containingClass.addBeforeContainingStatement(nestedCache);
		//containingClass.getFields().get(0).addBeforeContainingStatement(nestedCache);
		
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
