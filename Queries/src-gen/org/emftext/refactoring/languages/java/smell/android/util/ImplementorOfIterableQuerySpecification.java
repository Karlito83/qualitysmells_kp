package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.emftext.refactoring.languages.java.smell.android.ImplementorOfIterableMatcher;

/**
 * A pattern-specific query specification that can instantiate ImplementorOfIterableMatcher in a type-safe way.
 * 
 * @see ImplementorOfIterableMatcher
 * @see ImplementorOfIterableMatch
 * 
 */
@SuppressWarnings("all")
public final class ImplementorOfIterableQuerySpecification extends BaseGeneratedQuerySpecification<ImplementorOfIterableMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ImplementorOfIterableQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ImplementorOfIterableMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ImplementorOfIterableMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "Queries";
    
  }
  
  @Override
  protected String patternName() {
    return "org.emftext.refactoring.languages.java.smell.android.implementorOfIterable";
    
  }
  
  private ImplementorOfIterableQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<ImplementorOfIterableQuerySpecification> {
    @Override
    public ImplementorOfIterableQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static ImplementorOfIterableQuerySpecification INSTANCE = make();
    
    public static ImplementorOfIterableQuerySpecification make() {
      try {
      	return new ImplementorOfIterableQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
