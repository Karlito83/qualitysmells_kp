package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.variables.Variable;
import org.emftext.refactoring.languages.java.smell.android.IterableVariableMatch;

/**
 * A match processor tailored for the org.emftext.refactoring.languages.java.smell.android.iterableVariable pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class IterableVariableProcessor implements IMatchProcessor<IterableVariableMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pA the value of pattern parameter a in the currently processed match 
   * @param pB the value of pattern parameter b in the currently processed match 
   * 
   */
  public abstract void process(final Variable pA, final Classifier pB);
  
  @Override
  public void process(final IterableVariableMatch match) {
    process(match.getA(), match.getB());
    
  }
}
