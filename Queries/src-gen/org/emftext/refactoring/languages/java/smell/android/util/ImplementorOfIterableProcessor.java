package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.refactoring.languages.java.smell.android.ImplementorOfIterableMatch;

/**
 * A match processor tailored for the org.emftext.refactoring.languages.java.smell.android.implementorOfIterable pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ImplementorOfIterableProcessor implements IMatchProcessor<ImplementorOfIterableMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pA the value of pattern parameter a in the currently processed match 
   * 
   */
  public abstract void process(final ConcreteClassifier pA);
  
  @Override
  public void process(final ImplementorOfIterableMatch match) {
    process(match.getA());
    
  }
}
