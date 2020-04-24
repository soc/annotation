package id.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.MODULE, ElementType.PACKAGE})
@interface immutable {}
