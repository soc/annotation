package id.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Marks a parameter or local variable as mutable.
 *
 * Assigning a value to a parameter or local variable is a warning,
 * except when the parameter is marked as {@code @immutable}, in which case it is an error.
 */
@Target({ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
@interface mutable {}
