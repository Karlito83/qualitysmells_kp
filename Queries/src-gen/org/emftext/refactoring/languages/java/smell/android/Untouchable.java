package org.emftext.refactoring.languages.java.smell.android;

import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.emftext.refactoring.languages.java.smell.android.UnTouchableMatcher;

/**
 * A pattern group formed of all patterns defined in untouchable.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare 
 * an EMF-IncQuery engine for matching all patterns originally defined in file untouchable.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.emftext.refactoring.languages.java.smell.android, the group contains the definition of the following patterns: <ul>
 * <li>UnTouchable</li>
 * <li>sizeFILL</li>
 * <li>sizeWRAP</li>
 * <li>sizeMATCH</li>
 * <li>size</li>
 * <li>isActivity</li>
 * <li>isClassOf</li>
 * <li>parentContainsSomething</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Untouchable extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Untouchable instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Untouchable();
    }
    return INSTANCE;
    
  }
  
  private static Untouchable INSTANCE;
  
  private Untouchable() throws IncQueryException {
    querySpecifications.add(UnTouchableMatcher.querySpecification());
    
  }
}
