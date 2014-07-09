package org.emftext.refactoring.languages.java.smell.android;

import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.emftext.refactoring.languages.java.smell.android.FindCloseMatcher;
import org.emftext.refactoring.languages.java.smell.android.FindCloseableMatcher;
import org.emftext.refactoring.languages.java.smell.android.UnclosedCloseableMatcher;

/**
 * A pattern group formed of all patterns defined in UnclosedClosable.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare 
 * an EMF-IncQuery engine for matching all patterns originally defined in file UnclosedClosable.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.emftext.refactoring.languages.java.smell.android, the group contains the definition of the following patterns: <ul>
 * <li>UnclosedCloseable</li>
 * <li>findClose</li>
 * <li>findCloseable</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class UnclosedClosable extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static UnclosedClosable instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new UnclosedClosable();
    }
    return INSTANCE;
    
  }
  
  private static UnclosedClosable INSTANCE;
  
  private UnclosedClosable() throws IncQueryException {
    querySpecifications.add(UnclosedCloseableMatcher.querySpecification());
    querySpecifications.add(FindCloseMatcher.querySpecification());
    querySpecifications.add(FindCloseableMatcher.querySpecification());
    
  }
}
