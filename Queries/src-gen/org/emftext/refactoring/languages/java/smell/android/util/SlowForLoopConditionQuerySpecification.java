package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.emftext.refactoring.languages.java.smell.android.SlowForLoopConditionMatcher;

/**
 * A pattern-specific query specification that can instantiate SlowForLoopConditionMatcher in a type-safe way.
 * 
 * @see SlowForLoopConditionMatcher
 * @see SlowForLoopConditionMatch
 * 
 */
@SuppressWarnings("all")
public final class SlowForLoopConditionQuerySpecification extends BaseGeneratedQuerySpecification<SlowForLoopConditionMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SlowForLoopConditionQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected SlowForLoopConditionMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SlowForLoopConditionMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "Queries";
    
  }
  
  @Override
  protected String patternName() {
    return "org.emftext.refactoring.languages.java.smell.android.slowForLoopCondition";
    
  }
  
  private SlowForLoopConditionQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<SlowForLoopConditionQuerySpecification> {
    @Override
    public SlowForLoopConditionQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static SlowForLoopConditionQuerySpecification INSTANCE = make();
    
    public static SlowForLoopConditionQuerySpecification make() {
      try {
      	return new SlowForLoopConditionQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
