package org.emftext.refactoring.languages.java.smell.android;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.references.MethodCall;

/**
 * Pattern-specific match representation of the org.emftext.refactoring.languages.java.smell.android.UnclosedCloseable pattern, 
 * to be used in conjunction with {@link UnclosedCloseableMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see UnclosedCloseableMatcher
 * @see UnclosedCloseableProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class UnclosedCloseableMatch extends BasePatternMatch {
  private MethodCall fDeviceIdCall;
  
  private Interface fDeviceINCall;
  
  private static List<String> parameterNames = makeImmutableList("deviceIdCall", "deviceINCall");
  
  private UnclosedCloseableMatch(final MethodCall pDeviceIdCall, final Interface pDeviceINCall) {
    this.fDeviceIdCall = pDeviceIdCall;
    this.fDeviceINCall = pDeviceINCall;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("deviceIdCall".equals(parameterName)) return this.fDeviceIdCall;
    if ("deviceINCall".equals(parameterName)) return this.fDeviceINCall;
    return null;
    
  }
  
  public MethodCall getDeviceIdCall() {
    return this.fDeviceIdCall;
    
  }
  
  public Interface getDeviceINCall() {
    return this.fDeviceINCall;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("deviceIdCall".equals(parameterName) ) {
    	this.fDeviceIdCall = (org.emftext.language.java.references.MethodCall) newValue;
    	return true;
    }
    if ("deviceINCall".equals(parameterName) ) {
    	this.fDeviceINCall = (org.emftext.language.java.classifiers.Interface) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setDeviceIdCall(final MethodCall pDeviceIdCall) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDeviceIdCall = pDeviceIdCall;
    
  }
  
  public void setDeviceINCall(final Interface pDeviceINCall) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDeviceINCall = pDeviceINCall;
    
  }
  
  @Override
  public String patternName() {
    return "org.emftext.refactoring.languages.java.smell.android.UnclosedCloseable";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return UnclosedCloseableMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fDeviceIdCall, fDeviceINCall};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"deviceIdCall\"=" + prettyPrintValue(fDeviceIdCall) + ", ");
    result.append("\"deviceINCall\"=" + prettyPrintValue(fDeviceINCall));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fDeviceIdCall == null) ? 0 : fDeviceIdCall.hashCode()); 
    result = prime * result + ((fDeviceINCall == null) ? 0 : fDeviceINCall.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof UnclosedCloseableMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    UnclosedCloseableMatch other = (UnclosedCloseableMatch) obj;
    if (fDeviceIdCall == null) {if (other.fDeviceIdCall != null) return false;}
    else if (!fDeviceIdCall.equals(other.fDeviceIdCall)) return false;
    if (fDeviceINCall == null) {if (other.fDeviceINCall != null) return false;}
    else if (!fDeviceINCall.equals(other.fDeviceINCall)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return UnclosedCloseableMatcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends UnclosedCloseableMatch {
    Mutable(final MethodCall pDeviceIdCall, final Interface pDeviceINCall) {
      super(pDeviceIdCall, pDeviceINCall);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends UnclosedCloseableMatch {
    Immutable(final MethodCall pDeviceIdCall, final Interface pDeviceINCall) {
      super(pDeviceIdCall, pDeviceINCall);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
