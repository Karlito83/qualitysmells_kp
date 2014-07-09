package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.emftext.language.java.statements.ForLoop;
import org.emftext.refactoring.languages.java.smell.android.SlowForLoopMatch;

/**
 * A match processor tailored for the org.emftext.refactoring.languages.java.smell.android.slowForLoop pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SlowForLoopProcessor implements IMatchProcessor<SlowForLoopMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pA the value of pattern parameter a in the currently processed match 
   * 
   */
  public abstract void process(final ForLoop pA);
  
  @Override
  public void process(final SlowForLoopMatch match) {
    process(match.getA());
    
  }
}
