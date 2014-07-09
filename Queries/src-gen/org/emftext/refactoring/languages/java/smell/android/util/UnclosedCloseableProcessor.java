package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.references.MethodCall;
import org.emftext.refactoring.languages.java.smell.android.UnclosedCloseableMatch;

/**
 * A match processor tailored for the org.emftext.refactoring.languages.java.smell.android.UnclosedCloseable pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class UnclosedCloseableProcessor implements IMatchProcessor<UnclosedCloseableMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pDeviceIdCall the value of pattern parameter deviceIdCall in the currently processed match 
   * @param pDeviceINCall the value of pattern parameter deviceINCall in the currently processed match 
   * 
   */
  public abstract void process(final MethodCall pDeviceIdCall, final Interface pDeviceINCall);
  
  @Override
  public void process(final UnclosedCloseableMatch match) {
    process(match.getDeviceIdCall(), match.getDeviceINCall());
    
  }
}
