package org.emftext.refactoring.languages.java.smell.android;

import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.emftext.refactoring.languages.java.smell.android.UnnecessaryPermissionMatcher;

/**
 * A pattern group formed of all patterns defined in UnnecessaryPermission.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare 
 * an EMF-IncQuery engine for matching all patterns originally defined in file UnnecessaryPermission.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.emftext.refactoring.languages.java.smell.android, the group contains the definition of the following patterns: <ul>
 * <li>UnnecessaryPermission</li>
 * <li>useSMS</li>
 * <li>useRelativeLayout</li>
 * <li>Last</li>
 * <li>useCamera</li>
 * <li>useContact</li>
 * <li>isActivity</li>
 * <li>isClassOf</li>
 * <li>isField</li>
 * <li>parentContainsSomething</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class UnnecessaryPermission extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static UnnecessaryPermission instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new UnnecessaryPermission();
    }
    return INSTANCE;
    
  }
  
  private static UnnecessaryPermission INSTANCE;
  
  private UnnecessaryPermission() throws IncQueryException {
    querySpecifications.add(UnnecessaryPermissionMatcher.querySpecification());
    
  }
}
