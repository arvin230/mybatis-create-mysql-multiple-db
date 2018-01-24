package com.xq.dz.command;

import lombok.Data;

/**
 * 用于存放创建表的字段信息
 *
 * @author arvin
 * @version 2018-1-22 18:35:25
 */
@Data
public class CreateTableParam {

	/** 字段名 */
	private String fieldName;

	/** 字段类型 */
	private String fieldType;

	/** 类型长度 */
	private int fieldLength;

	/** 类型小数长度 */
	private int fieldDecimalLength;

	/** 字段是否非空 */
	private boolean fieldIsNull;

	/** 字段是否是主键 */
	private boolean fieldIsKey;

	/** 主键是否自增 */
	private boolean fieldIsAutoIncrement;

	/** 字段默认值 */
	private String fieldDefaultValue;

	/** 该类型需要几个长度（例如，需要小数位数的，那么总长度和小数长度就是2个长度）一版只有0、1、2三个可选值，自动从配置的类型中获取的 */
	private int fileTypeLength;

	/** 值是否唯一 */
	private boolean fieldIsUnique;

	/** 字段的注释 */
	private String fieldComment;
	
	/** 唯一索引键 */
	private String uniqueKey;
	
	/** 主键 */
	private String primaryKey;

}
