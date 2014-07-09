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
import org.emftext.language.java.members.Field;
import org.emftext.refactoring.languages.java.smell.android.UnnecessaryPermissionMatch;
import org.emftext.refactoring.languages.java.smell.android.util.UnnecessaryPermissionQuerySpecification;

/**
 * Generated pattern matcher API of the org.emftext.refactoring.languages.java.smell.android.UnnecessaryPermission pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)}, 
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link UnnecessaryPermissionMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern UnnecessaryPermission(field2:Field){
 * 	Class.^extends(actualClass, superClassRef);
 * 	NamespaceClassifierReference.classifierReferences(superClassRef, classifierReference);
 * 	ClassifierReference.target(classifierReference, superClass);
 * 	find isActivity(superClass);
 * 	
 * 	find useCamera(field, field2);} or { find useContact(field, field2); }
 * 	or {find useSMS(field, field2);}
 * </pre></code>
 * 
 * @see UnnecessaryPermissionMatch
 * @see UnnecessaryPermissionProcessor
 * @see UnnecessaryPermissionQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class UnnecessaryPermissionMatcher extends BaseMatcher<UnnecessaryPermissionMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<UnnecessaryPermissionMatcher> querySpecification() throws IncQueryException {
    return UnnecessaryPermissionQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static UnnecessaryPermissionMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    UnnecessaryPermissionMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new UnnecessaryPermissionMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    } 	
    return matcher;
  }
  
  private final static int POSITION_FIELD2 = 0;
  
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
  public UnnecessaryPermissionMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public UnnecessaryPermissionMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pField2 the fixed value of pattern parameter field2, or null if not bound.
   * @return matches represented as a UnnecessaryPermissionMatch object.
   * 
   */
  public Collection<UnnecessaryPermissionMatch> getAllMatches(final Field pField2) {
    return rawGetAllMatches(new Object[]{pField2});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pField2 the fixed value of pattern parameter field2, or null if not bound.
   * @return a match represented as a UnnecessaryPermissionMatch object, or null if no match is found.
   * 
   */
  public UnnecessaryPermissionMatch getOneArbitraryMatch(final Field pField2) {
    return rawGetOneArbitraryMatch(new Object[]{pField2});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pField2 the fixed value of pattern parameter field2, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Field pField2) {
    return rawHasMatch(new Object[]{pField2});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pField2 the fixed value of pattern parameter field2, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Field pField2) {
    return rawCountMatches(new Object[]{pField2});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pField2 the fixed value of pattern parameter field2, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Field pField2, final IMatchProcessor<? super UnnecessaryPermissionMatch> processor) {
    rawForEachMatch(new Object[]{pField2}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pField2 the fixed value of pattern parameter field2, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Field pField2, final IMatchProcessor<? super UnnecessaryPermissionMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pField2}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pField2 the fixed value of pattern parameter field2, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<UnnecessaryPermissionMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Field pField2) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pField2});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pField2 the fixed value of pattern parameter field2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public UnnecessaryPermissionMatch newMatch(final Field pField2) {
    return new UnnecessaryPermissionMatch.Immutable(pField2);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for field2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Field> rawAccumulateAllValuesOffield2(final Object[] parameters) {
    Set<Field> results = new HashSet<Field>();
    rawAccumulateAllValues(POSITION_FIELD2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for field2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Field> getAllValuesOffield2() {
    return rawAccumulateAllValuesOffield2(emptyArray());
  }
  
  @Override
  protected UnnecessaryPermissionMatch tupleToMatch(final Tuple t) {
    try {
    	return new UnnecessaryPermissionMatch.Immutable((org.emftext.language.java.members.Field) t.get(POSITION_FIELD2));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected UnnecessaryPermissionMatch arrayToMatch(final Object[] match) {
    try {
    	return new UnnecessaryPermissionMatch.Immutable((org.emftext.language.java.members.Field) match[POSITION_FIELD2]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected UnnecessaryPermissionMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new UnnecessaryPermissionMatch.Mutable((org.emftext.language.java.members.Field) match[POSITION_FIELD2]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
}
