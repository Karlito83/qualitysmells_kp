package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.emftext.language.java.expressions.RelationExpression;
import org.emftext.refactoring.languages.java.smell.android.SlowForLoopConditionMatch;

/**
 * A match processor tailored for the org.emftext.refactoring.languages.java.smell.android.slowForLoopCondition pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SlowForLoopConditionProcessor implements IMatchProcessor<SlowForLoopConditionMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pA the value of pattern parameter a in the currently processed match 
   * 
   */
  public abstract void process(final RelationExpression pA);
  
  @Override
  public void process(final SlowForLoopConditionMatch match) {
    process(match.getA());
    
  }
}
