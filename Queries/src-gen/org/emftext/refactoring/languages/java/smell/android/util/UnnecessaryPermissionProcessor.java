package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.emftext.language.java.members.Field;
import org.emftext.refactoring.languages.java.smell.android.UnnecessaryPermissionMatch;

/**
 * A match processor tailored for the org.emftext.refactoring.languages.java.smell.android.UnnecessaryPermission pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class UnnecessaryPermissionProcessor implements IMatchProcessor<UnnecessaryPermissionMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pField2 the value of pattern parameter field2 in the currently processed match 
   * 
   */
  public abstract void process(final Field pField2);
  
  @Override
  public void process(final UnnecessaryPermissionMatch match) {
    process(match.getField2());
    
  }
}
