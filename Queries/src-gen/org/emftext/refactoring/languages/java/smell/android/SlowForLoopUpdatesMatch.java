package org.emftext.refactoring.languages.java.smell.android;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.emftext.language.java.statements.ForLoop;

/**
 * Pattern-specific match representation of the org.emftext.refactoring.languages.java.smell.android.slowForLoopUpdates pattern, 
 * to be used in conjunction with {@link SlowForLoopUpdatesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SlowForLoopUpdatesMatcher
 * @see SlowForLoopUpdatesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SlowForLoopUpdatesMatch extends BasePatternMatch {
  private ForLoop fA;
  
  private static List<String> parameterNames = makeImmutableList("a");
  
  private SlowForLoopUpdatesMatch(final ForLoop pA) {
    this.fA = pA;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("a".equals(parameterName)) return this.fA;
    return null;
    
  }
  
  public ForLoop getA() {
    return this.fA;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("a".equals(parameterName) ) {
    	this.fA = (org.emftext.language.java.statements.ForLoop) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setA(final ForLoop pA) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fA = pA;
    
  }
  
  @Override
  public String patternName() {
    return "org.emftext.refactoring.languages.java.smell.android.slowForLoopUpdates";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return SlowForLoopUpdatesMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fA};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"a\"=" + prettyPrintValue(fA));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fA == null) ? 0 : fA.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SlowForLoopUpdatesMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    SlowForLoopUpdatesMatch other = (SlowForLoopUpdatesMatch) obj;
    if (fA == null) {if (other.fA != null) return false;}
    else if (!fA.equals(other.fA)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return SlowForLoopUpdatesMatcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends SlowForLoopUpdatesMatch {
    Mutable(final ForLoop pA) {
      super(pA);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends SlowForLoopUpdatesMatch {
    Immutable(final ForLoop pA) {
      super(pA);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}