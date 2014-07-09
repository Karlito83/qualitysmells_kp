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
import org.emftext.language.java.references.IdentifierReference;
import org.emftext.refactoring.languages.java.smell.android.UnTouchableMatch;
import org.emftext.refactoring.languages.java.smell.android.util.UnTouchableQuerySpecification;

/**
 * Generated pattern matcher API of the org.emftext.refactoring.languages.java.smell.android.UnTouchable pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)}, 
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link UnTouchableMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * //import "http://www.emftext.org/commons/layout"
 * 
 * pattern UnTouchable(showLPExpression:IdentifierReference){
 * 	Class.^extends(actualClass, superClassRef);
 * 	NamespaceClassifierReference.classifierReferences(superClassRef, classifierReference);
 * 	ClassifierReference.target(classifierReference, superClass);
 * 	find isActivity(superClass);
 * 	
 * 	find sizeFILL(showLPExpression, LPExpression, useRelativeLayout);
 * 	find sizeWRAP(showLPExpression, LPExpression, useRelativeLayout);
 * 	find sizeMATCH(showLPExpression, LPExpression, useRelativeLayout);
 * 	
 * 	
 * 	//Class.members(actualClass, method);
 * 	//find useRelativeLayout(expression);
 * 	//find parentContainsSomething+(method, expression);
 * }
 * </pre></code>
 * 
 * @see UnTouchableMatch
 * @see UnTouchableProcessor
 * @see UnTouchableQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class UnTouchableMatcher extends BaseMatcher<UnTouchableMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<UnTouchableMatcher> querySpecification() throws IncQueryException {
    return UnTouchableQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static UnTouchableMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    UnTouchableMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new UnTouchableMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    } 	
    return matcher;
  }
  
  private final static int POSITION_SHOWLPEXPRESSION = 0;
  
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
  public UnTouchableMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public UnTouchableMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pShowLPExpression the fixed value of pattern parameter showLPExpression, or null if not bound.
   * @return matches represented as a UnTouchableMatch object.
   * 
   */
  public Collection<UnTouchableMatch> getAllMatches(final IdentifierReference pShowLPExpression) {
    return rawGetAllMatches(new Object[]{pShowLPExpression});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pShowLPExpression the fixed value of pattern parameter showLPExpression, or null if not bound.
   * @return a match represented as a UnTouchableMatch object, or null if no match is found.
   * 
   */
  public UnTouchableMatch getOneArbitraryMatch(final IdentifierReference pShowLPExpression) {
    return rawGetOneArbitraryMatch(new Object[]{pShowLPExpression});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pShowLPExpression the fixed value of pattern parameter showLPExpression, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final IdentifierReference pShowLPExpression) {
    return rawHasMatch(new Object[]{pShowLPExpression});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pShowLPExpression the fixed value of pattern parameter showLPExpression, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final IdentifierReference pShowLPExpression) {
    return rawCountMatches(new Object[]{pShowLPExpression});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pShowLPExpression the fixed value of pattern parameter showLPExpression, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final IdentifierReference pShowLPExpression, final IMatchProcessor<? super UnTouchableMatch> processor) {
    rawForEachMatch(new Object[]{pShowLPExpression}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pShowLPExpression the fixed value of pattern parameter showLPExpression, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final IdentifierReference pShowLPExpression, final IMatchProcessor<? super UnTouchableMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pShowLPExpression}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pShowLPExpression the fixed value of pattern parameter showLPExpression, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<UnTouchableMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final IdentifierReference pShowLPExpression) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pShowLPExpression});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pShowLPExpression the fixed value of pattern parameter showLPExpression, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public UnTouchableMatch newMatch(final IdentifierReference pShowLPExpression) {
    return new UnTouchableMatch.Immutable(pShowLPExpression);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for showLPExpression.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<IdentifierReference> rawAccumulateAllValuesOfshowLPExpression(final Object[] parameters) {
    Set<IdentifierReference> results = new HashSet<IdentifierReference>();
    rawAccumulateAllValues(POSITION_SHOWLPEXPRESSION, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for showLPExpression.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<IdentifierReference> getAllValuesOfshowLPExpression() {
    return rawAccumulateAllValuesOfshowLPExpression(emptyArray());
  }
  
  @Override
  protected UnTouchableMatch tupleToMatch(final Tuple t) {
    try {
    	return new UnTouchableMatch.Immutable((org.emftext.language.java.references.IdentifierReference) t.get(POSITION_SHOWLPEXPRESSION));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected UnTouchableMatch arrayToMatch(final Object[] match) {
    try {
    	return new UnTouchableMatch.Immutable((org.emftext.language.java.references.IdentifierReference) match[POSITION_SHOWLPEXPRESSION]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected UnTouchableMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new UnTouchableMatch.Mutable((org.emftext.language.java.references.IdentifierReference) match[POSITION_SHOWLPEXPRESSION]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
}
