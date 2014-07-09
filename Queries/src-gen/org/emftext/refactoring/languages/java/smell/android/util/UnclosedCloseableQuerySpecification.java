package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.emftext.refactoring.languages.java.smell.android.UnclosedCloseableMatcher;

/**
 * A pattern-specific query specification that can instantiate UnclosedCloseableMatcher in a type-safe way.
 * 
 * @see UnclosedCloseableMatcher
 * @see UnclosedCloseableMatch
 * 
 */
@SuppressWarnings("all")
public final class UnclosedCloseableQuerySpecification extends BaseGeneratedQuerySpecification<UnclosedCloseableMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static UnclosedCloseableQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected UnclosedCloseableMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return UnclosedCloseableMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "Queries";
    
  }
  
  @Override
  protected String patternName() {
    return "org.emftext.refactoring.languages.java.smell.android.UnclosedCloseable";
    
  }
  
  private UnclosedCloseableQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<UnclosedCloseableQuerySpecification> {
    @Override
    public UnclosedCloseableQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static UnclosedCloseableQuerySpecification INSTANCE = make();
    
    public static UnclosedCloseableQuerySpecification make() {
      try {
      	return new UnclosedCloseableQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
