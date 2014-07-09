package org.emftext.refactoring.languages.java.smell.android;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.classifiers.ConcreteClassifier;

/**
 * Pattern-specific match representation of the org.emftext.refactoring.languages.java.smell.android.ImplementsOrExtends pattern, 
 * to be used in conjunction with {@link ImplementsOrExtendsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ImplementsOrExtendsMatcher
 * @see ImplementsOrExtendsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ImplementsOrExtendsMatch extends BasePatternMatch {
  private ConcreteClassifier fA;
  
  private Classifier fB;
  
  private static List<String> parameterNames = makeImmutableList("a", "b");
  
  private ImplementsOrExtendsMatch(final ConcreteClassifier pA, final Classifier pB) {
    this.fA = pA;
    this.fB = pB;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("a".equals(parameterName)) return this.fA;
    if ("b".equals(parameterName)) return this.fB;
    return null;
    
  }
  
  public ConcreteClassifier getA() {
    return this.fA;
    
  }
  
  public Classifier getB() {
    return this.fB;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("a".equals(parameterName) ) {
    	this.fA = (org.emftext.language.java.classifiers.ConcreteClassifier) newValue;
    	return true;
    }
    if ("b".equals(parameterName) ) {
    	this.fB = (org.emftext.language.java.classifiers.Classifier) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setA(final ConcreteClassifier pA) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fA = pA;
    
  }
  
  public void setB(final Classifier pB) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fB = pB;
    
  }
  
  @Override
  public String patternName() {
    return "org.emftext.refactoring.languages.java.smell.android.ImplementsOrExtends";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return ImplementsOrExtendsMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fA, fB};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"a\"=" + prettyPrintValue(fA) + ", ");
    result.append("\"b\"=" + prettyPrintValue(fB));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fA == null) ? 0 : fA.hashCode()); 
    result = prime * result + ((fB == null) ? 0 : fB.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ImplementsOrExtendsMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    ImplementsOrExtendsMatch other = (ImplementsOrExtendsMatch) obj;
    if (fA == null) {if (other.fA != null) return false;}
    else if (!fA.equals(other.fA)) return false;
    if (fB == null) {if (other.fB != null) return false;}
    else if (!fB.equals(other.fB)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return ImplementsOrExtendsMatcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends ImplementsOrExtendsMatch {
    Mutable(final ConcreteClassifier pA, final Classifier pB) {
      super(pA, pB);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends ImplementsOrExtendsMatch {
    Immutable(final ConcreteClassifier pA, final Classifier pB) {
      super(pA, pB);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
