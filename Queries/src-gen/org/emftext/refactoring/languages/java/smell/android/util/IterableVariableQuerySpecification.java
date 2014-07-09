package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.emftext.refactoring.languages.java.smell.android.IterableVariableMatcher;

/**
 * A pattern-specific query specification that can instantiate IterableVariableMatcher in a type-safe way.
 * 
 * @see IterableVariableMatcher
 * @see IterableVariableMatch
 * 
 */
@SuppressWarnings("all")
public final class IterableVariableQuerySpecification extends BaseGeneratedQuerySpecification<IterableVariableMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IterableVariableQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected IterableVariableMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return IterableVariableMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "Queries";
    
  }
  
  @Override
  protected String patternName() {
    return "org.emftext.refactoring.languages.java.smell.android.iterableVariable";
    
  }
  
  private IterableVariableQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<IterableVariableQuerySpecification> {
    @Override
    public IterableVariableQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static IterableVariableQuerySpecification INSTANCE = make();
    
    public static IterableVariableQuerySpecification make() {
      try {
      	return new IterableVariableQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
