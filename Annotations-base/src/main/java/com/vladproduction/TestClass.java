package com.vladproduction;

import java.lang.annotation.*;

/**
 * The example shows the TestClass annotation, which can be used to mark classes — @Target(ElementType.TYPE).
 * Information about marking with this annotation will remain in the Javadoc of the marked class @Documented,
 * and will also be available at runtime @Retention(RetentionPolicy.RUNTIME).
 * All descendants of the marked class will also be considered marked with it.
 * */
@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface TestClass {
}