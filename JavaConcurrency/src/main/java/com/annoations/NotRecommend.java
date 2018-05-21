package com.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 【不推荐】的做法
 */
@Target(ElementType.TYPE)//作用的目标
@Retention(RetentionPolicy.SOURCE)//注解存在的范围
public @interface NotRecommend {
    String value() default "";
}
