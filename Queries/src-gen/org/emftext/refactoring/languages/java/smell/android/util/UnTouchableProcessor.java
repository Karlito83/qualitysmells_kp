package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.emftext.language.java.references.IdentifierReference;
import org.emftext.refactoring.languages.java.smell.android.UnTouchableMatch;

/**
 * A match processor tailored for the org.emftext.refactoring.languages.java.smell.android.UnTouchable pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class UnTouchableProcessor implements IMatchProcessor<UnTouchableMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pShowLPExpression the value of pattern parameter showLPExpression in the currently processed match 
   * 
   */
  public abstract void process(final IdentifierReference pShowLPExpression);
  
  @Override
  public void process(final UnTouchableMatch match) {
    process(match.getShowLPExpression());
    
  }
}
