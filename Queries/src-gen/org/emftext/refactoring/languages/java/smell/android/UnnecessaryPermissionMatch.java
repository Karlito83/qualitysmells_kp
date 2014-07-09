package org.emftext.refactoring.languages.java.smell.android;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.emftext.language.java.members.Field;

/**
 * Pattern-specific match representation of the org.emftext.refactoring.languages.java.smell.android.UnnecessaryPermission pattern, 
 * to be used in conjunction with {@link UnnecessaryPermissionMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see UnnecessaryPermissionMatcher
 * @see UnnecessaryPermissionProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class UnnecessaryPermissionMatch extends BasePatternMatch {
  private Field fField2;
  
  private static List<String> parameterNames = makeImmutableList("field2");
  
  private UnnecessaryPermissionMatch(final Field pField2) {
    this.fField2 = pField2;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("field2".equals(parameterName)) return this.fField2;
    return null;
    
  }
  
  public Field getField2() {
    return this.fField2;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("field2".equals(parameterName) ) {
    	this.fField2 = (org.emftext.language.java.members.Field) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setField2(final Field pField2) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fField2 = pField2;
    
  }
  
  @Override
  public String patternName() {
    return "org.emftext.refactoring.languages.java.smell.android.UnnecessaryPermission";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return UnnecessaryPermissionMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fField2};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"field2\"=" + prettyPrintValue(fField2));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fField2 == null) ? 0 : fField2.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof UnnecessaryPermissionMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    UnnecessaryPermissionMatch other = (UnnecessaryPermissionMatch) obj;
    if (fField2 == null) {if (other.fField2 != null) return false;}
    else if (!fField2.equals(other.fField2)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return UnnecessaryPermissionMatcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends UnnecessaryPermissionMatch {
    Mutable(final Field pField2) {
      super(pField2);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends UnnecessaryPermissionMatch {
    Immutable(final Field pField2) {
      super(pField2);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
