package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.emftext.refactoring.languages.java.smell.android.FindViewByIdCallMatcher;

/**
 * A pattern-specific query specification that can instantiate FindViewByIdCallMatcher in a type-safe way.
 * 
 * @see FindViewByIdCallMatcher
 * @see FindViewByIdCallMatch
 * 
 */
@SuppressWarnings("all")
public final class FindViewByIdCallQuerySpecification extends BaseGeneratedQuerySpecification<FindViewByIdCallMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FindViewByIdCallQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected FindViewByIdCallMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return FindViewByIdCallMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "Queries";
    
  }
  
  @Override
  protected String patternName() {
    return "org.emftext.refactoring.languages.java.smell.android.findViewByIdCall";
    
  }
  
  private FindViewByIdCallQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<FindViewByIdCallQuerySpecification> {
    @Override
    public FindViewByIdCallQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static FindViewByIdCallQuerySpecification INSTANCE = make();
    
    public static FindViewByIdCallQuerySpecification make() {
      try {
      	return new FindViewByIdCallQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
