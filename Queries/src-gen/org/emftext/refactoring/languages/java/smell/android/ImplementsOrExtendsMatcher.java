package org.emftext.refactoring.languages.java.smell.android;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;
import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.refactoring.languages.java.smell.android.ImplementsOrExtendsMatch;
import org.emftext.refactoring.languages.java.smell.android.util.ImplementsOrExtendsQuerySpecification;

/**
 * Generated pattern matcher API of the org.emftext.refactoring.languages.java.smell.android.ImplementsOrExtends pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)}, 
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ImplementsOrExtendsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern ImplementsOrExtends(a,b){
 * 	Interface.^extends(a, classifierRef);
 * 	ClassifierReference.target(classifierRef, b);
 * 	//Interface(b);Variable.typeReference(a, typeReference);
 * } or {
 * 	Class.implements(a, classifierRef);
 * 	ClassifierReference.target(classifierRef, b);
 * }
 * </pre></code>
 * 
 * @see ImplementsOrExtendsMatch
 * @see ImplementsOrExtendsProcessor
 * @see ImplementsOrExtendsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ImplementsOrExtendsMatcher extends BaseMatcher<ImplementsOrExtendsMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<ImplementsOrExtendsMatcher> querySpecification() throws IncQueryException {
    return ImplementsOrExtendsQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ImplementsOrExtendsMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    ImplementsOrExtendsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new ImplementsOrExtendsMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    } 	
    return matcher;
  }
  
  private final static int POSITION_A = 0;
  
  private final static int POSITION_B = 1;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so 
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public ImplementsOrExtendsMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public ImplementsOrExtendsMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @return matches represented as a ImplementsOrExtendsMatch object.
   * 
   */
  public Collection<ImplementsOrExtendsMatch> getAllMatches(final ConcreteClassifier pA, final Classifier pB) {
    return rawGetAllMatches(new Object[]{pA, pB});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @return a match represented as a ImplementsOrExtendsMatch object, or null if no match is found.
   * 
   */
  public ImplementsOrExtendsMatch getOneArbitraryMatch(final ConcreteClassifier pA, final Classifier pB) {
    return rawGetOneArbitraryMatch(new Object[]{pA, pB});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final ConcreteClassifier pA, final Classifier pB) {
    return rawHasMatch(new Object[]{pA, pB});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final ConcreteClassifier pA, final Classifier pB) {
    return rawCountMatches(new Object[]{pA, pB});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final ConcreteClassifier pA, final Classifier pB, final IMatchProcessor<? super ImplementsOrExtendsMatch> processor) {
    rawForEachMatch(new Object[]{pA, pB}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final ConcreteClassifier pA, final Classifier pB, final IMatchProcessor<? super ImplementsOrExtendsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pA, pB}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<ImplementsOrExtendsMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final ConcreteClassifier pA, final Classifier pB) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pA, pB});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ImplementsOrExtendsMatch newMatch(final ConcreteClassifier pA, final Classifier pB) {
    return new ImplementsOrExtendsMatch.Immutable(pA, pB);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for a.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<ConcreteClassifier> rawAccumulateAllValuesOfa(final Object[] parameters) {
    Set<ConcreteClassifier> results = new HashSet<ConcreteClassifier>();
    rawAccumulateAllValues(POSITION_A, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for a.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ConcreteClassifier> getAllValuesOfa() {
    return rawAccumulateAllValuesOfa(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for a.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ConcreteClassifier> getAllValuesOfa(final ImplementsOrExtendsMatch partialMatch) {
    return rawAccumulateAllValuesOfa(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for a.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ConcreteClassifier> getAllValuesOfa(final Classifier pB) {
    return rawAccumulateAllValuesOfa(new Object[]{null, pB});
  }
  
  /**
   * Retrieve the set of values that occur in matches for b.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Classifier> rawAccumulateAllValuesOfb(final Object[] parameters) {
    Set<Classifier> results = new HashSet<Classifier>();
    rawAccumulateAllValues(POSITION_B, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for b.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Classifier> getAllValuesOfb() {
    return rawAccumulateAllValuesOfb(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for b.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Classifier> getAllValuesOfb(final ImplementsOrExtendsMatch partialMatch) {
    return rawAccumulateAllValuesOfb(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for b.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Classifier> getAllValuesOfb(final ConcreteClassifier pA) {
    return rawAccumulateAllValuesOfb(new Object[]{pA, null});
  }
  
  @Override
  protected ImplementsOrExtendsMatch tupleToMatch(final Tuple t) {
    try {
    	return new ImplementsOrExtendsMatch.Immutable((org.emftext.language.java.classifiers.ConcreteClassifier) t.get(POSITION_A), (org.emftext.language.java.classifiers.Classifier) t.get(POSITION_B));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected ImplementsOrExtendsMatch arrayToMatch(final Object[] match) {
    try {
    	return new ImplementsOrExtendsMatch.Immutable((org.emftext.language.java.classifiers.ConcreteClassifier) match[POSITION_A], (org.emftext.language.java.classifiers.Classifier) match[POSITION_B]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected ImplementsOrExtendsMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new ImplementsOrExtendsMatch.Mutable((org.emftext.language.java.classifiers.ConcreteClassifier) match[POSITION_A], (org.emftext.language.java.classifiers.Classifier) match[POSITION_B]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
}
