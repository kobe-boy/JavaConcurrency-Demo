package com.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标记【线程不安全】的类或写法
 */
@Target(ElementType.TYPE)//作用的目标
@Retention(RetentionPolicy.SOURCE)//注解存在的范围
public @interface NotThreadSafe {
    String value() default "";
}
