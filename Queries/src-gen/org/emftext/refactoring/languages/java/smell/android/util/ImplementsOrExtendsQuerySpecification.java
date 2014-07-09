package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.emftext.refactoring.languages.java.smell.android.ImplementsOrExtendsMatcher;

/**
 * A pattern-specific query specification that can instantiate ImplementsOrExtendsMatcher in a type-safe way.
 * 
 * @see ImplementsOrExtendsMatcher
 * @see ImplementsOrExtendsMatch
 * 
 */
@SuppressWarnings("all")
public final class ImplementsOrExtendsQuerySpecification extends BaseGeneratedQuerySpecification<ImplementsOrExtendsMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ImplementsOrExtendsQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ImplementsOrExtendsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ImplementsOrExtendsMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "Queries";
    
  }
  
  @Override
  protected String patternName() {
    return "org.emftext.refactoring.languages.java.smell.android.ImplementsOrExtends";
    
  }
  
  private ImplementsOrExtendsQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<ImplementsOrExtendsQuerySpecification> {
    @Override
    public ImplementsOrExtendsQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static ImplementsOrExtendsQuerySpecification INSTANCE = make();
    
    public static ImplementsOrExtendsQuerySpecification make() {
      try {
      	return new ImplementsOrExtendsQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
