package id.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Marks an individual type, a field or a parameter as nullable.
 *
 * Assigning {@code null} to a field of a type not marked as {@code @nullable} is a warning,
 * except when the type itself has been marked with {@code @nonnull}, in which case it is an error.
 *
 * Passing {@code null} as a method argument of a type not marked as {@code @nullable} is a warning,
 * except when the type itself has been marked with {@code @nonnull}, in which case it is an error.
 */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.PARAMETER})
@interface nullable {}
