package id.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Marks an individual type, all types in a package or all types in a module as non-null.
 *
 * Assigning {@code null} to an instance of a type marked as {@code @nonnull} is an error.
 *
 * Passing {@code null} as a method argument of a type marked as {@code @nonnull} is an error.
 */
@Target({ElementType.MODULE, ElementType.PACKAGE, ElementType.TYPE})
@interface notnull {}
