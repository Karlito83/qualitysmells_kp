package org.emftext.refactoring.languages.java.smell.android.refactorings;

import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emftext.language.java.expressions.Expression;
import org.emftext.language.java.references.ElementReference;
import org.emftext.language.java.references.IdentifierReference;
import org.emftext.language.java.references.Reference;
import org.emftext.language.java.statements.ExpressionStatement;
import org.emftext.language.refactoring.refactoring_specification.RefactoringSpecification;
import org.emftext.language.refactoring.roles.Role;
import org.emftext.refactoring.ltk.IModelRefactoringWizardPage;
import org.emftext.refactoring.registry.rolemapping.AbstractRefactoringPostProcessor;
import org.emftext.refactoring.util.RoleUtil;

public class ShowUnnecessaryPermission {
	
	public IStatus process(Map<Role, List<EObject>> roleRuntimeInstanceMap, EObject refactoredModel, ResourceSet resourceSet, ChangeDescription change, RefactoringSpecification refSpec, List<IModelRefactoringWizardPage> customWizardPages, boolean isFakeRun, Map<EObject, EObject> copier, List<? extends EObject> initialSelection) {
		
		IdentifierReference IdRef = RoleUtil.getFirstObjectForRole("Selection", IdentifierReference.class, roleRuntimeInstanceMap);
		
		
		Reference Target = IdRef.getNext();
		String IntentType = ((ElementReference) Target).getTarget().getName();
		
		if (IntentType == "ACTION_IMAGE_CAPTURE")
		{
			System.out.println("You really need the camera?");
		}
		else if (IntentType == "EXTRA_TEXT")
		{
			System.out.println("You really need the sms-function?");
		}
		else if (IntentType == "ACTION_PICK")
		{
			System.out.println("You really need the contacts?");
		}
		else
		{
			System.out.println("Please verify if you need all your permissions.");
		}
				
			
		
		return Status.OK_STATUS;
	}
	
}

