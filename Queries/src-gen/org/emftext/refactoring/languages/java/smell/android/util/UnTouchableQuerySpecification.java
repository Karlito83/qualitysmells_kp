package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.emftext.refactoring.languages.java.smell.android.UnTouchableMatcher;

/**
 * A pattern-specific query specification that can instantiate UnTouchableMatcher in a type-safe way.
 * 
 * @see UnTouchableMatcher
 * @see UnTouchableMatch
 * 
 */
@SuppressWarnings("all")
public final class UnTouchableQuerySpecification extends BaseGeneratedQuerySpecification<UnTouchableMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static UnTouchableQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected UnTouchableMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return UnTouchableMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "Queries";
    
  }
  
  @Override
  protected String patternName() {
    return "org.emftext.refactoring.languages.java.smell.android.UnTouchable";
    
  }
  
  private UnTouchableQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<UnTouchableQuerySpecification> {
    @Override
    public UnTouchableQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static UnTouchableQuerySpecification INSTANCE = make();
    
    public static UnTouchableQuerySpecification make() {
      try {
      	return new UnTouchableQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
