package org.emftext.refactoring.languages.java.smell.android.refactorings;

import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emftext.language.java.statements.ForLoopInitializer;
import org.emftext.language.java.statements.impl.ForLoopImpl;
import org.emftext.language.refactoring.refactoring_specification.RefactoringSpecification;
import org.emftext.language.refactoring.roles.Role;
import org.emftext.refactoring.ltk.IModelRefactoringWizardPage;
import org.emftext.refactoring.registry.rolemapping.AbstractRefactoringPostProcessor;
import org.emftext.refactoring.util.RoleUtil;

public class ReplaceSlowForLoop extends
	AbstractRefactoringPostProcessor {
	
	@Override
	public IStatus process(Map<Role, List<EObject>> roleBindings,
			EObject refactoredModel, ResourceSet resourceSet,
			ChangeDescription change, RefactoringSpecification refSpec,
			List<IModelRefactoringWizardPage> customWizardPages,
			boolean isFakeRun, Map<EObject, EObject> copier) {
		
		ForLoopImpl fi = RoleUtil.getFirstObjectForRole(
				"Selection", ForLoopImpl.class, roleBindings);
		
		fi.basicGetStatement();
		
		return Status.OK_STATUS;
		
		/*return super.process(roleBindings, refactoredModel, resourceSet, change,
				refSpec, customWizardPages, isFakeRun, copier);
				*/
	}
}
