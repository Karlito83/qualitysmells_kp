package org.emftext.refactoring.languages.java.smell.android;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.emftext.language.java.classifiers.Interface;

/**
 * Pattern-specific match representation of the org.emftext.refactoring.languages.java.smell.android.findCloseable pattern, 
 * to be used in conjunction with {@link FindCloseableMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see FindCloseableMatcher
 * @see FindCloseableProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class FindCloseableMatch extends BasePatternMatch {
  private Interface fDeviceINCall;
  
  private static List<String> parameterNames = makeImmutableList("deviceINCall");
  
  private FindCloseableMatch(final Interface pDeviceINCall) {
    this.fDeviceINCall = pDeviceINCall;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("deviceINCall".equals(parameterName)) return this.fDeviceINCall;
    return null;
    
  }
  
  public Interface getDeviceINCall() {
    return this.fDeviceINCall;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("deviceINCall".equals(parameterName) ) {
    	this.fDeviceINCall = (org.emftext.language.java.classifiers.Interface) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setDeviceINCall(final Interface pDeviceINCall) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDeviceINCall = pDeviceINCall;
    
  }
  
  @Override
  public String patternName() {
    return "org.emftext.refactoring.languages.java.smell.android.findCloseable";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return FindCloseableMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fDeviceINCall};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"deviceINCall\"=" + prettyPrintValue(fDeviceINCall));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fDeviceINCall == null) ? 0 : fDeviceINCall.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof FindCloseableMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    FindCloseableMatch other = (FindCloseableMatch) obj;
    if (fDeviceINCall == null) {if (other.fDeviceINCall != null) return false;}
    else if (!fDeviceINCall.equals(other.fDeviceINCall)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return FindCloseableMatcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends FindCloseableMatch {
    Mutable(final Interface pDeviceINCall) {
      super(pDeviceINCall);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends FindCloseableMatch {
    Immutable(final Interface pDeviceINCall) {
      super(pDeviceINCall);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
