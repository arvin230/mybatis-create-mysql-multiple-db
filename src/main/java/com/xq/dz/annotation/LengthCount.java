package com.xq.dz.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 针对数据库类型加注解，用来标记该类型需要设置几个长度 例如： datetime/不需要设置 ,varchar(1)/需要1个,
 * double(5,2)/需要两个
 * <p>
 * 默认长度1，即1的时候不需要设置
 * </p>
 * 
 * @author arvin
 * @version 2018-1-22 18:23:58
 */
@Target(ElementType.FIELD) // 该注解用于方法声明
@Retention(RetentionPolicy.RUNTIME) // 可以通过反射机制读取注解的信息
@Documented // 将此注解包含在javadoc中
@Inherited // 允许子类继承父类中的注解
public @interface LengthCount {

	/**
	 * 默认是1，0表示不需要设置，1表示需要设置一个，2表示需要设置两个
	 * 
	 * @return 默认是1，0表示不需要设置，1表示需要设置一个，2表示需要设置两个
	 */
	public int lengthCount() default 1;
}
