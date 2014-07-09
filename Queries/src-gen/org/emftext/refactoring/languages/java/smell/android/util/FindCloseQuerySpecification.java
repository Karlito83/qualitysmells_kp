package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.emftext.refactoring.languages.java.smell.android.FindCloseMatcher;

/**
 * A pattern-specific query specification that can instantiate FindCloseMatcher in a type-safe way.
 * 
 * @see FindCloseMatcher
 * @see FindCloseMatch
 * 
 */
@SuppressWarnings("all")
public final class FindCloseQuerySpecification extends BaseGeneratedQuerySpecification<FindCloseMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FindCloseQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected FindCloseMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return FindCloseMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "Queries";
    
  }
  
  @Override
  protected String patternName() {
    return "org.emftext.refactoring.languages.java.smell.android.findClose";
    
  }
  
  private FindCloseQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<FindCloseQuerySpecification> {
    @Override
    public FindCloseQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static FindCloseQuerySpecification INSTANCE = make();
    
    public static FindCloseQuerySpecification make() {
      try {
      	return new FindCloseQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
