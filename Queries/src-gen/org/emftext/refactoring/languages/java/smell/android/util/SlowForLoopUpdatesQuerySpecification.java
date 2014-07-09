package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.emftext.refactoring.languages.java.smell.android.SlowForLoopUpdatesMatcher;

/**
 * A pattern-specific query specification that can instantiate SlowForLoopUpdatesMatcher in a type-safe way.
 * 
 * @see SlowForLoopUpdatesMatcher
 * @see SlowForLoopUpdatesMatch
 * 
 */
@SuppressWarnings("all")
public final class SlowForLoopUpdatesQuerySpecification extends BaseGeneratedQuerySpecification<SlowForLoopUpdatesMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SlowForLoopUpdatesQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected SlowForLoopUpdatesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SlowForLoopUpdatesMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "Queries";
    
  }
  
  @Override
  protected String patternName() {
    return "org.emftext.refactoring.languages.java.smell.android.slowForLoopUpdates";
    
  }
  
  private SlowForLoopUpdatesQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<SlowForLoopUpdatesQuerySpecification> {
    @Override
    public SlowForLoopUpdatesQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static SlowForLoopUpdatesQuerySpecification INSTANCE = make();
    
    public static SlowForLoopUpdatesQuerySpecification make() {
      try {
      	return new SlowForLoopUpdatesQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
