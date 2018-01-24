package com.xq.dz.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 创建表时的表名
 *
 * @author arvin
 * @version 2018-1-22 18:28:26
 */
@Target(ElementType.TYPE) // 表示注解加在接口、类、枚举等
@Retention(RetentionPolicy.RUNTIME) // 可以通过反射机制读取注解的信息
@Documented // 将此注解包含在javadoc中
@Inherited // 允许子类继承父类中的注解
public @interface Table {

	/**
	 * 表名
	 * 
	 * @return 表名
	 */
	public String name();

	/**
	 * 表个数，默认1个
	 * 
	 * @return 表个数， 默认1个
	 */
	public int tableSize() default 1;

	/**
	 * 库个数，默认1个
	 * 
	 * @return 库个数， 默认1个
	 */
	public int dbSize() default 1;
}
