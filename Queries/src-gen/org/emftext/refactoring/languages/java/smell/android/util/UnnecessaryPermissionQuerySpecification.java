package org.emftext.refactoring.languages.java.smell.android.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.emftext.refactoring.languages.java.smell.android.UnnecessaryPermissionMatcher;

/**
 * A pattern-specific query specification that can instantiate UnnecessaryPermissionMatcher in a type-safe way.
 * 
 * @see UnnecessaryPermissionMatcher
 * @see UnnecessaryPermissionMatch
 * 
 */
@SuppressWarnings("all")
public final class UnnecessaryPermissionQuerySpecification extends BaseGeneratedQuerySpecification<UnnecessaryPermissionMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static UnnecessaryPermissionQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected UnnecessaryPermissionMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return UnnecessaryPermissionMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "Queries";
    
  }
  
  @Override
  protected String patternName() {
    return "org.emftext.refactoring.languages.java.smell.android.UnnecessaryPermission";
    
  }
  
  private UnnecessaryPermissionQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<UnnecessaryPermissionQuerySpecification> {
    @Override
    public UnnecessaryPermissionQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static UnnecessaryPermissionQuerySpecification INSTANCE = make();
    
    public static UnnecessaryPermissionQuerySpecification make() {
      try {
      	return new UnnecessaryPermissionQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
