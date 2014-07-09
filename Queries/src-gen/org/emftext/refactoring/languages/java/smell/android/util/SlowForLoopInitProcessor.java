package org.emftext.refactoring.languages.java.smell.android.util;

import java.math.BigInteger;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.emftext.language.java.statements.ForLoop;
import org.emftext.refactoring.languages.java.smell.android.SlowForLoopInitMatch;

/**
 * A match processor tailored for the org.emftext.refactoring.languages.java.smell.android.slowForLoopInit pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SlowForLoopInitProcessor implements IMatchProcessor<SlowForLoopInitMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pA the value of pattern parameter a in the currently processed match 
   * @param pR the value of pattern parameter r in the currently processed match 
   * 
   */
  public abstract void process(final ForLoop pA, final BigInteger pR);
  
  @Override
  public void process(final SlowForLoopInitMatch match) {
    process(match.getA(), match.getR());
    
  }
}
