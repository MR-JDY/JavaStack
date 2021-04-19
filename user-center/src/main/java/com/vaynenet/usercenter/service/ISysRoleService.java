package com.vaynenet.usercenter.service;

import com.vaynenet.core.model.PageResult;
import com.vaynenet.core.model.Result;
import com.vaynenet.core.model.SysRole;
import com.vaynenet.core.service.ISuperService;

import java.util.List;
import java.util.Map;

/**
 * @author vayne
 * <p>

 
 */
public interface ISysRoleService extends ISuperService<SysRole> {
	void saveRole(SysRole sysRole) throws Exception;

	void deleteRole(Long id);

	/**
	 * 角色列表
	 * @param params
	 * @return
	 */
	PageResult<SysRole> findRoles(Map<String, Object> params);

	/**
	 * 新增或更新角色
	 * @param sysRole
	 * @return Result
	 */
	Result saveOrUpdateRole(SysRole sysRole) throws Exception;

	/**
	 * 查询所有角色
	 * @return
	 */
	List<SysRole> findAll();
}
