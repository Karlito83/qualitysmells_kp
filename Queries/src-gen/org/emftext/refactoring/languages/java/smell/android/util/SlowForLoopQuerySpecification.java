package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.emftext.refactoring.languages.java.smell.android.SlowForLoopMatcher;

/**
 * A pattern-specific query specification that can instantiate SlowForLoopMatcher in a type-safe way.
 * 
 * @see SlowForLoopMatcher
 * @see SlowForLoopMatch
 * 
 */
@SuppressWarnings("all")
public final class SlowForLoopQuerySpecification extends BaseGeneratedQuerySpecification<SlowForLoopMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SlowForLoopQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected SlowForLoopMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SlowForLoopMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "Queries";
    
  }
  
  @Override
  protected String patternName() {
    return "org.emftext.refactoring.languages.java.smell.android.slowForLoop";
    
  }
  
  private SlowForLoopQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<SlowForLoopQuerySpecification> {
    @Override
    public SlowForLoopQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static SlowForLoopQuerySpecification INSTANCE = make();
    
    public static SlowForLoopQuerySpecification make() {
      try {
      	return new SlowForLoopQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
