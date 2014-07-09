package org.emftext.refactoring.languages.java.smell.android;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.emftext.language.java.statements.ForLoop;

/**
 * Pattern-specific match representation of the org.emftext.refactoring.languages.java.smell.android.slowForLoopInit pattern, 
 * to be used in conjunction with {@link SlowForLoopInitMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SlowForLoopInitMatcher
 * @see SlowForLoopInitProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SlowForLoopInitMatch extends BasePatternMatch {
  private ForLoop fA;
  
  private BigInteger fR;
  
  private static List<String> parameterNames = makeImmutableList("a", "r");
  
  private SlowForLoopInitMatch(final ForLoop pA, final BigInteger pR) {
    this.fA = pA;
    this.fR = pR;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("a".equals(parameterName)) return this.fA;
    if ("r".equals(parameterName)) return this.fR;
    return null;
    
  }
  
  public ForLoop getA() {
    return this.fA;
    
  }
  
  public BigInteger getR() {
    return this.fR;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("a".equals(parameterName) ) {
    	this.fA = (org.emftext.language.java.statements.ForLoop) newValue;
    	return true;
    }
    if ("r".equals(parameterName) ) {
    	this.fR = (java.math.BigInteger) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setA(final ForLoop pA) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fA = pA;
    
  }
  
  public void setR(final BigInteger pR) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fR = pR;
    
  }
  
  @Override
  public String patternName() {
    return "org.emftext.refactoring.languages.java.smell.android.slowForLoopInit";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return SlowForLoopInitMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fA, fR};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"a\"=" + prettyPrintValue(fA) + ", ");
    result.append("\"r\"=" + prettyPrintValue(fR));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fA == null) ? 0 : fA.hashCode()); 
    result = prime * result + ((fR == null) ? 0 : fR.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SlowForLoopInitMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    SlowForLoopInitMatch other = (SlowForLoopInitMatch) obj;
    if (fA == null) {if (other.fA != null) return false;}
    else if (!fA.equals(other.fA)) return false;
    if (fR == null) {if (other.fR != null) return false;}
    else if (!fR.equals(other.fR)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return SlowForLoopInitMatcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends SlowForLoopInitMatch {
    Mutable(final ForLoop pA, final BigInteger pR) {
      super(pA, pR);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends SlowForLoopInitMatch {
    Immutable(final ForLoop pA, final BigInteger pR) {
      super(pA, pR);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
