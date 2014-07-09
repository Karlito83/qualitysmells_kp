package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.emftext.refactoring.languages.java.smell.android.FewCallsMatcher;

/**
 * A pattern-specific query specification that can instantiate FewCallsMatcher in a type-safe way.
 * 
 * @see FewCallsMatcher
 * @see FewCallsMatch
 * 
 */
@SuppressWarnings("all")
public final class FewCallsQuerySpecification extends BaseGeneratedQuerySpecification<FewCallsMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FewCallsQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected FewCallsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return FewCallsMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "Queries";
    
  }
  
  @Override
  protected String patternName() {
    return "org.emftext.refactoring.languages.java.smell.android.fewCalls";
    
  }
  
  private FewCallsQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<FewCallsQuerySpecification> {
    @Override
    public FewCallsQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static FewCallsQuerySpecification INSTANCE = make();
    
    public static FewCallsQuerySpecification make() {
      try {
      	return new FewCallsQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
