package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.emftext.refactoring.languages.java.smell.android.SlowForLoopInitMatcher;

/**
 * A pattern-specific query specification that can instantiate SlowForLoopInitMatcher in a type-safe way.
 * 
 * @see SlowForLoopInitMatcher
 * @see SlowForLoopInitMatch
 * 
 */
@SuppressWarnings("all")
public final class SlowForLoopInitQuerySpecification extends BaseGeneratedQuerySpecification<SlowForLoopInitMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SlowForLoopInitQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected SlowForLoopInitMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SlowForLoopInitMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "Queries";
    
  }
  
  @Override
  protected String patternName() {
    return "org.emftext.refactoring.languages.java.smell.android.slowForLoopInit";
    
  }
  
  private SlowForLoopInitQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<SlowForLoopInitQuerySpecification> {
    @Override
    public SlowForLoopInitQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static SlowForLoopInitQuerySpecification INSTANCE = make();
    
    public static SlowForLoopInitQuerySpecification make() {
      try {
      	return new SlowForLoopInitQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
