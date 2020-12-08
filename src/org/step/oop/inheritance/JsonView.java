package org.step.oop.inheritance;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
public @interface JsonView {

    Class<? extends View> render() default View.class;
}
