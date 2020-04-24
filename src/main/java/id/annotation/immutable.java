package id.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Marks all parameters a package or module as immutable.
 *
 * Assigning a value to a parameter marked as {@code @immutable} is an error.
 */
@Target({ElementType.MODULE, ElementType.PACKAGE})
@interface immutable {}
