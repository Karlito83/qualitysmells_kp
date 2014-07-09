package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.emftext.language.java.references.MethodCall;
import org.emftext.refactoring.languages.java.smell.android.UncachedViewMatch;

/**
 * A match processor tailored for the org.emftext.refactoring.languages.java.smell.android.uncachedView pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class UncachedViewProcessor implements IMatchProcessor<UncachedViewMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pA the value of pattern parameter a in the currently processed match 
   * 
   */
  public abstract void process(final MethodCall pA);
  
  @Override
  public void process(final UncachedViewMatch match) {
    process(match.getA());
    
  }
}
