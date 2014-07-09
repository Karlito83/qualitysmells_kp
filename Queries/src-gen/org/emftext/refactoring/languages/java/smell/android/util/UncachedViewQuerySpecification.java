package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.emftext.refactoring.languages.java.smell.android.UncachedViewMatcher;

/**
 * A pattern-specific query specification that can instantiate UncachedViewMatcher in a type-safe way.
 * 
 * @see UncachedViewMatcher
 * @see UncachedViewMatch
 * 
 */
@SuppressWarnings("all")
public final class UncachedViewQuerySpecification extends BaseGeneratedQuerySpecification<UncachedViewMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static UncachedViewQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected UncachedViewMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return UncachedViewMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "Queries";
    
  }
  
  @Override
  protected String patternName() {
    return "org.emftext.refactoring.languages.java.smell.android.uncachedView";
    
  }
  
  private UncachedViewQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<UncachedViewQuerySpecification> {
    @Override
    public UncachedViewQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static UncachedViewQuerySpecification INSTANCE = make();
    
    public static UncachedViewQuerySpecification make() {
      try {
      	return new UncachedViewQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
