package org.emftext.refactoring.languages.java.smell.android;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;
import org.emftext.refactoring.languages.java.smell.android.FewCallsMatch;
import org.emftext.refactoring.languages.java.smell.android.util.FewCallsQuerySpecification;

/**
 * Generated pattern matcher API of the org.emftext.refactoring.languages.java.smell.android.fewCalls pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)}, 
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link FewCallsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * //Due to gt and lt relations do not exist (yet) in IncQuery
 * //Check that there are at least 5 occurances is done by negating
 * //this check.
 * pattern fewCalls(){
 * 	//find findViewByIdCall(a);
 * 	0 == count find findViewByIdCall(_a);
 * } or {
 * 	//find findViewByIdCall(a);
 * 	1 == count find findViewByIdCall(_a);
 * } or {
 * 	//find findViewByIdCall(a);
 * 	2 == count find findViewByIdCall(_a);
 * } or {
 * 	//find findViewByIdCall(a);
 * 	3 == count find findViewByIdCall(_a);
 * } or {
 * 	//find findViewByIdCall(a);
 * 	4 == count find findViewByIdCall(_a);
 * }
 * </pre></code>
 * 
 * @see FewCallsMatch
 * @see FewCallsProcessor
 * @see FewCallsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class FewCallsMatcher extends BaseMatcher<FewCallsMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<FewCallsMatcher> querySpecification() throws IncQueryException {
    return FewCallsQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static FewCallsMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    FewCallsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new FewCallsMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    } 	
    return matcher;
  }
  
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
  public FewCallsMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public FewCallsMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Indicates whether the (parameterless) pattern matches or not. 
   * @return true if the pattern has a valid match.
   * 
   */
  public boolean hasMatch() {
    return rawHasMatch(new Object[]{});
  }
  
  @Override
  protected FewCallsMatch tupleToMatch(final Tuple t) {
    try {
    	return new FewCallsMatch.Immutable();	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected FewCallsMatch arrayToMatch(final Object[] match) {
    try {
    	return new FewCallsMatch.Immutable();
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected FewCallsMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new FewCallsMatch.Mutable();
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
}
