package com.xq.dz.dao.system;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.xq.dz.command.SysMysqlColumns;


/**
 * 创建更新表结构的Mapper
 * @author Arvin
 *
 */
public interface CreateMysqlTablesMapper {
	
	/**
	 * 根据数据库名创建数据库
	 * @param dbName 数据库名
	 */
	public void createDataBase(@Param("dbName") String dbName);
	
	/**
	 * 根据数据库名查询是否存在这样的数据库
	 * @param dbName 数据库名
	 */
	public int findDataBaseCountByDBName(@Param("dbName") String dbName);

	/**
	 * 根据结构注解解析出来的信息创建表
	 * @param tableMap 表结构的map
	 */
	public void createTable(@Param("tableMap") Map<String, List<Object>> tableMap);

	/**
	 * 根据表名查询表在库中是否存在，存在返回1，不存在返回0
	 * @param tableName 表名
	 * @param schemaName 库名
	 * @return 存在返回1，不存在返回0
	 */
	public int findTableCountByTableName(@Param("schemaName") String schemaName, @Param("tableName") String tableName);
	
	/**
	 * 根据表名查询库中该表的字段结构等信息
	 * @param tableName 表结构的map
	 * @return 表的字段结构等信息
	 */
	public List<SysMysqlColumns> findTableEnsembleByTableName(@Param("schemaName") String schemaName, @Param("tableName") String tableName);
	
	/**
	 * 增加字段
	 * @param tableMap 表结构的map
	 */
	public void addTableField(@Param("tableMap") Map<String, Object> tableMap);
	
	/**
	 * 删除字段
	 * @param tableMap 表结构的map
	 */
	public void removeTableField(@Param("tableMap") Map<String, Object> tableMap);
	
	/**
	 * 修改字段
	 * @param tableMap 表结构的map
	 */
	public void modifyTableField(@Param("tableMap") Map<String, Object> tableMap);
	
	/**
	 * 删除主键约束，附带修改其他字段属性功能
	 * @param tableMap 表结构的map
	 */
	public void dropKeyTableField(@Param("tableMap") Map<String, Object> tableMap);
	
	/**
	 * 删除唯一约束字段，不带修改其他字段属性的功能
	 * @param tableMap 表结构的map
	 */
	public void dropUniqueTableField(@Param("tableMap") Map<String, Object> tableMap);
	
	/**
	 * 根据表名删除表
	 * @param tableName 表结构的map
	 */
	public void dorpTableByName(@Param("tableName") String tableName);
}
