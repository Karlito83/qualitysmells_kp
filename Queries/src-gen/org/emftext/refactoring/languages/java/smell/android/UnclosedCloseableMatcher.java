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
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.references.MethodCall;
import org.emftext.refactoring.languages.java.smell.android.UnclosedCloseableMatch;
import org.emftext.refactoring.languages.java.smell.android.util.UnclosedCloseableQuerySpecification;

/**
 * Generated pattern matcher API of the org.emftext.refactoring.languages.java.smell.android.UnclosedCloseable pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)}, 
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link UnclosedCloseableMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern UnclosedCloseable(deviceIdCall:MethodCall, deviceINCall:Interface) ={
 * 	find findClose(deviceIdCall);
 * 	find findCloseable(deviceINCall);
 * 	}
 * </pre></code>
 * 
 * @see UnclosedCloseableMatch
 * @see UnclosedCloseableProcessor
 * @see UnclosedCloseableQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class UnclosedCloseableMatcher extends BaseMatcher<UnclosedCloseableMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<UnclosedCloseableMatcher> querySpecification() throws IncQueryException {
    return UnclosedCloseableQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static UnclosedCloseableMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    UnclosedCloseableMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new UnclosedCloseableMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    } 	
    return matcher;
  }
  
  private final static int POSITION_DEVICEIDCALL = 0;
  
  private final static int POSITION_DEVICEINCALL = 1;
  
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
  public UnclosedCloseableMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public UnclosedCloseableMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDeviceIdCall the fixed value of pattern parameter deviceIdCall, or null if not bound.
   * @param pDeviceINCall the fixed value of pattern parameter deviceINCall, or null if not bound.
   * @return matches represented as a UnclosedCloseableMatch object.
   * 
   */
  public Collection<UnclosedCloseableMatch> getAllMatches(final MethodCall pDeviceIdCall, final Interface pDeviceINCall) {
    return rawGetAllMatches(new Object[]{pDeviceIdCall, pDeviceINCall});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDeviceIdCall the fixed value of pattern parameter deviceIdCall, or null if not bound.
   * @param pDeviceINCall the fixed value of pattern parameter deviceINCall, or null if not bound.
   * @return a match represented as a UnclosedCloseableMatch object, or null if no match is found.
   * 
   */
  public UnclosedCloseableMatch getOneArbitraryMatch(final MethodCall pDeviceIdCall, final Interface pDeviceINCall) {
    return rawGetOneArbitraryMatch(new Object[]{pDeviceIdCall, pDeviceINCall});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pDeviceIdCall the fixed value of pattern parameter deviceIdCall, or null if not bound.
   * @param pDeviceINCall the fixed value of pattern parameter deviceINCall, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final MethodCall pDeviceIdCall, final Interface pDeviceINCall) {
    return rawHasMatch(new Object[]{pDeviceIdCall, pDeviceINCall});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDeviceIdCall the fixed value of pattern parameter deviceIdCall, or null if not bound.
   * @param pDeviceINCall the fixed value of pattern parameter deviceINCall, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final MethodCall pDeviceIdCall, final Interface pDeviceINCall) {
    return rawCountMatches(new Object[]{pDeviceIdCall, pDeviceINCall});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pDeviceIdCall the fixed value of pattern parameter deviceIdCall, or null if not bound.
   * @param pDeviceINCall the fixed value of pattern parameter deviceINCall, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final MethodCall pDeviceIdCall, final Interface pDeviceINCall, final IMatchProcessor<? super UnclosedCloseableMatch> processor) {
    rawForEachMatch(new Object[]{pDeviceIdCall, pDeviceINCall}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDeviceIdCall the fixed value of pattern parameter deviceIdCall, or null if not bound.
   * @param pDeviceINCall the fixed value of pattern parameter deviceINCall, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final MethodCall pDeviceIdCall, final Interface pDeviceINCall, final IMatchProcessor<? super UnclosedCloseableMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pDeviceIdCall, pDeviceINCall}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pDeviceIdCall the fixed value of pattern parameter deviceIdCall, or null if not bound.
   * @param pDeviceINCall the fixed value of pattern parameter deviceINCall, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<UnclosedCloseableMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final MethodCall pDeviceIdCall, final Interface pDeviceINCall) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pDeviceIdCall, pDeviceINCall});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDeviceIdCall the fixed value of pattern parameter deviceIdCall, or null if not bound.
   * @param pDeviceINCall the fixed value of pattern parameter deviceINCall, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public UnclosedCloseableMatch newMatch(final MethodCall pDeviceIdCall, final Interface pDeviceINCall) {
    return new UnclosedCloseableMatch.Immutable(pDeviceIdCall, pDeviceINCall);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for deviceIdCall.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<MethodCall> rawAccumulateAllValuesOfdeviceIdCall(final Object[] parameters) {
    Set<MethodCall> results = new HashSet<MethodCall>();
    rawAccumulateAllValues(POSITION_DEVICEIDCALL, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for deviceIdCall.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MethodCall> getAllValuesOfdeviceIdCall() {
    return rawAccumulateAllValuesOfdeviceIdCall(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for deviceIdCall.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MethodCall> getAllValuesOfdeviceIdCall(final UnclosedCloseableMatch partialMatch) {
    return rawAccumulateAllValuesOfdeviceIdCall(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for deviceIdCall.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MethodCall> getAllValuesOfdeviceIdCall(final Interface pDeviceINCall) {
    return rawAccumulateAllValuesOfdeviceIdCall(new Object[]{null, pDeviceINCall});
  }
  
  /**
   * Retrieve the set of values that occur in matches for deviceINCall.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Interface> rawAccumulateAllValuesOfdeviceINCall(final Object[] parameters) {
    Set<Interface> results = new HashSet<Interface>();
    rawAccumulateAllValues(POSITION_DEVICEINCALL, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for deviceINCall.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Interface> getAllValuesOfdeviceINCall() {
    return rawAccumulateAllValuesOfdeviceINCall(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for deviceINCall.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Interface> getAllValuesOfdeviceINCall(final UnclosedCloseableMatch partialMatch) {
    return rawAccumulateAllValuesOfdeviceINCall(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for deviceINCall.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Interface> getAllValuesOfdeviceINCall(final MethodCall pDeviceIdCall) {
    return rawAccumulateAllValuesOfdeviceINCall(new Object[]{pDeviceIdCall, null});
  }
  
  @Override
  protected UnclosedCloseableMatch tupleToMatch(final Tuple t) {
    try {
    	return new UnclosedCloseableMatch.Immutable((org.emftext.language.java.references.MethodCall) t.get(POSITION_DEVICEIDCALL), (org.emftext.language.java.classifiers.Interface) t.get(POSITION_DEVICEINCALL));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected UnclosedCloseableMatch arrayToMatch(final Object[] match) {
    try {
    	return new UnclosedCloseableMatch.Immutable((org.emftext.language.java.references.MethodCall) match[POSITION_DEVICEIDCALL], (org.emftext.language.java.classifiers.Interface) match[POSITION_DEVICEINCALL]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected UnclosedCloseableMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new UnclosedCloseableMatch.Mutable((org.emftext.language.java.references.MethodCall) match[POSITION_DEVICEIDCALL], (org.emftext.language.java.classifiers.Interface) match[POSITION_DEVICEINCALL]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
}
