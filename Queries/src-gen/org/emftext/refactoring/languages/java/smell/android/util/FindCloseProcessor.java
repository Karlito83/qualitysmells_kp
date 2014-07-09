package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.emftext.language.java.references.MethodCall;
import org.emftext.refactoring.languages.java.smell.android.FindCloseMatch;

/**
 * A match processor tailored for the org.emftext.refactoring.languages.java.smell.android.findClose pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class FindCloseProcessor implements IMatchProcessor<FindCloseMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pDeviceIdCall the value of pattern parameter deviceIdCall in the currently processed match 
   * 
   */
  public abstract void process(final MethodCall pDeviceIdCall);
  
  @Override
  public void process(final FindCloseMatch match) {
    process(match.getDeviceIdCall());
    
  }
}
