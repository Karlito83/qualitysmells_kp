package org.emftext.refactoring.languages.java.smell.android;

import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.emftext.refactoring.languages.java.smell.android.ImplementorOfIterableMatcher;
import org.emftext.refactoring.languages.java.smell.android.ImplementsOrExtendsMatcher;
import org.emftext.refactoring.languages.java.smell.android.IterableVariableMatcher;
import org.emftext.refactoring.languages.java.smell.android.SlowForLoopConditionMatcher;
import org.emftext.refactoring.languages.java.smell.android.SlowForLoopInitMatcher;
import org.emftext.refactoring.languages.java.smell.android.SlowForLoopMatcher;
import org.emftext.refactoring.languages.java.smell.android.SlowForLoopUpdatesMatcher;

/**
 * A pattern group formed of all patterns defined in slowForLoop.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare 
 * an EMF-IncQuery engine for matching all patterns originally defined in file slowForLoop.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.emftext.refactoring.languages.java.smell.android, the group contains the definition of the following patterns: <ul>
 * <li>slowForLoop</li>
 * <li>slowForLoopInit</li>
 * <li>slowForLoopUpdates</li>
 * <li>slowForLoopCondition</li>
 * <li>iterableVariable</li>
 * <li>implementorOfIterable</li>
 * <li>ImplementsOrExtends</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class SlowForLoop extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static SlowForLoop instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new SlowForLoop();
    }
    return INSTANCE;
    
  }
  
  private static SlowForLoop INSTANCE;
  
  private SlowForLoop() throws IncQueryException {
    querySpecifications.add(ImplementsOrExtendsMatcher.querySpecification());
    querySpecifications.add(SlowForLoopUpdatesMatcher.querySpecification());
    querySpecifications.add(SlowForLoopConditionMatcher.querySpecification());
    querySpecifications.add(SlowForLoopInitMatcher.querySpecification());
    querySpecifications.add(IterableVariableMatcher.querySpecification());
    querySpecifications.add(SlowForLoopMatcher.querySpecification());
    querySpecifications.add(ImplementorOfIterableMatcher.querySpecification());
    
  }
}
