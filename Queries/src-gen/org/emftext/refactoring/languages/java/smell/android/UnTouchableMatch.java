package org.emftext.refactoring.languages.java.smell.android;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.emftext.language.java.references.IdentifierReference;

/**
 * Pattern-specific match representation of the org.emftext.refactoring.languages.java.smell.android.UnTouchable pattern, 
 * to be used in conjunction with {@link UnTouchableMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see UnTouchableMatcher
 * @see UnTouchableProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class UnTouchableMatch extends BasePatternMatch {
  private IdentifierReference fShowLPExpression;
  
  private static List<String> parameterNames = makeImmutableList("showLPExpression");
  
  private UnTouchableMatch(final IdentifierReference pShowLPExpression) {
    this.fShowLPExpression = pShowLPExpression;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("showLPExpression".equals(parameterName)) return this.fShowLPExpression;
    return null;
    
  }
  
  public IdentifierReference getShowLPExpression() {
    return this.fShowLPExpression;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("showLPExpression".equals(parameterName) ) {
    	this.fShowLPExpression = (org.emftext.language.java.references.IdentifierReference) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setShowLPExpression(final IdentifierReference pShowLPExpression) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fShowLPExpression = pShowLPExpression;
    
  }
  
  @Override
  public String patternName() {
    return "org.emftext.refactoring.languages.java.smell.android.UnTouchable";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return UnTouchableMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fShowLPExpression};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"showLPExpression\"=" + prettyPrintValue(fShowLPExpression));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fShowLPExpression == null) ? 0 : fShowLPExpression.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof UnTouchableMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    UnTouchableMatch other = (UnTouchableMatch) obj;
    if (fShowLPExpression == null) {if (other.fShowLPExpression != null) return false;}
    else if (!fShowLPExpression.equals(other.fShowLPExpression)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return UnTouchableMatcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends UnTouchableMatch {
    Mutable(final IdentifierReference pShowLPExpression) {
      super(pShowLPExpression);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends UnTouchableMatch {
    Immutable(final IdentifierReference pShowLPExpression) {
      super(pShowLPExpression);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
