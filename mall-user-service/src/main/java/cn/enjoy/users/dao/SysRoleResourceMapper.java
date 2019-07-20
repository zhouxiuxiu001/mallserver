package cn.enjoy.users.dao;

import cn.enjoy.sys.model.SysRoleResource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysRoleResourceMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_role_resource
	 * @mbggenerated  Fri Jul 15 11:04:49 CST 2016
	 */
	int deleteByPrimaryKey(String id);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_role_resource
	 * @mbggenerated  Fri Jul 15 11:04:49 CST 2016
	 */
	int insert(SysRoleResource record);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_role_resource
	 * @mbggenerated  Fri Jul 15 11:04:49 CST 2016
	 */
	int insertSelective(SysRoleResource record);

	SysRoleResource selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(SysRoleResource record);

	int updateByPrimaryKey(SysRoleResource record);

	int deleteByRoleId(@Param("roleId") String roleId);

	int deleteByResourceId(@Param("resourceId") String resourceId);

	List<SysRoleResource> selectResouceByRoleId(@Param("roleId") String roleId);

	void deleteByRoleAndResource(@Param("roleId") String roleId, @Param("resource") String resourceId);


}