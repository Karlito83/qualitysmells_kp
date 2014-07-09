package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.refactoring.languages.java.smell.android.FindCloseableMatch;

/**
 * A match processor tailored for the org.emftext.refactoring.languages.java.smell.android.findCloseable pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class FindCloseableProcessor implements IMatchProcessor<FindCloseableMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pDeviceINCall the value of pattern parameter deviceINCall in the currently processed match 
   * 
   */
  public abstract void process(final Interface pDeviceINCall);
  
  @Override
  public void process(final FindCloseableMatch match) {
    process(match.getDeviceINCall());
    
  }
}
