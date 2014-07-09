package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.emftext.refactoring.languages.java.smell.android.FindCloseableMatcher;

/**
 * A pattern-specific query specification that can instantiate FindCloseableMatcher in a type-safe way.
 * 
 * @see FindCloseableMatcher
 * @see FindCloseableMatch
 * 
 */
@SuppressWarnings("all")
public final class FindCloseableQuerySpecification extends BaseGeneratedQuerySpecification<FindCloseableMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FindCloseableQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected FindCloseableMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return FindCloseableMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "Queries";
    
  }
  
  @Override
  protected String patternName() {
    return "org.emftext.refactoring.languages.java.smell.android.findCloseable";
    
  }
  
  private FindCloseableQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<FindCloseableQuerySpecification> {
    @Override
    public FindCloseableQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static FindCloseableQuerySpecification INSTANCE = make();
    
    public static FindCloseableQuerySpecification make() {
      try {
      	return new FindCloseableQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
