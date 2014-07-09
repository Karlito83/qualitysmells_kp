package org.emftext.refactoring.languages.java.smell.android;

import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.emftext.refactoring.languages.java.smell.android.FewCallsMatcher;
import org.emftext.refactoring.languages.java.smell.android.FindViewByIdCallMatcher;
import org.emftext.refactoring.languages.java.smell.android.UncachedViewMatcher;

/**
 * A pattern group formed of all patterns defined in uncachedFindViewById.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare 
 * an EMF-IncQuery engine for matching all patterns originally defined in file uncachedFindViewById.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.emftext.refactoring.languages.java.smell.android, the group contains the definition of the following patterns: <ul>
 * <li>uncachedView</li>
 * <li>fewCalls</li>
 * <li>findViewByIdCall</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class UncachedFindViewById extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static UncachedFindViewById instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new UncachedFindViewById();
    }
    return INSTANCE;
    
  }
  
  private static UncachedFindViewById INSTANCE;
  
  private UncachedFindViewById() throws IncQueryException {
    querySpecifications.add(FewCallsMatcher.querySpecification());
    querySpecifications.add(UncachedViewMatcher.querySpecification());
    querySpecifications.add(FindViewByIdCallMatcher.querySpecification());
    
  }
}
