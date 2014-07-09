package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.emftext.refactoring.languages.java.smell.android.FewCallsMatch;

/**
 * A match processor tailored for the org.emftext.refactoring.languages.java.smell.android.fewCalls pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class FewCallsProcessor implements IMatchProcessor<FewCallsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * 
   */
  public abstract void process();
  
  @Override
  public void process(final FewCallsMatch match) {
    process();
    
  }
}
