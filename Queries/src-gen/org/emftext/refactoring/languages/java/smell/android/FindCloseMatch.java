package org.emftext.refactoring.languages.java.smell.android;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.emftext.language.java.references.MethodCall;

/**
 * Pattern-specific match representation of the org.emftext.refactoring.languages.java.smell.android.findClose pattern, 
 * to be used in conjunction with {@link FindCloseMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see FindCloseMatcher
 * @see FindCloseProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class FindCloseMatch extends BasePatternMatch {
  private MethodCall fDeviceIdCall;
  
  private static List<String> parameterNames = makeImmutableList("deviceIdCall");
  
  private FindCloseMatch(final MethodCall pDeviceIdCall) {
    this.fDeviceIdCall = pDeviceIdCall;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("deviceIdCall".equals(parameterName)) return this.fDeviceIdCall;
    return null;
    
  }
  
  public MethodCall getDeviceIdCall() {
    return this.fDeviceIdCall;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("deviceIdCall".equals(parameterName) ) {
    	this.fDeviceIdCall = (org.emftext.language.java.references.MethodCall) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setDeviceIdCall(final MethodCall pDeviceIdCall) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDeviceIdCall = pDeviceIdCall;
    
  }
  
  @Override
  public String patternName() {
    return "org.emftext.refactoring.languages.java.smell.android.findClose";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return FindCloseMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fDeviceIdCall};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"deviceIdCall\"=" + prettyPrintValue(fDeviceIdCall));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fDeviceIdCall == null) ? 0 : fDeviceIdCall.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof FindCloseMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    FindCloseMatch other = (FindCloseMatch) obj;
    if (fDeviceIdCall == null) {if (other.fDeviceIdCall != null) return false;}
    else if (!fDeviceIdCall.equals(other.fDeviceIdCall)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return FindCloseMatcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends FindCloseMatch {
    Mutable(final MethodCall pDeviceIdCall) {
      super(pDeviceIdCall);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends FindCloseMatch {
    Immutable(final MethodCall pDeviceIdCall) {
      super(pDeviceIdCall);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
