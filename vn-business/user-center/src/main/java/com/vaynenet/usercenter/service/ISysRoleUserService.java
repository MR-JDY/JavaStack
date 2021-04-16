package com.vaynenet.usercenter.service;

import com.vaynenet.core.model.SysRole;
import com.vaynenet.core.service.ISuperService;
import com.vaynenet.usercenter.model.SysRoleUser;

import java.util.List;

/**
 * @author zlt
 */
public interface ISysRoleUserService extends ISuperService<SysRoleUser> {
	int deleteUserRole(Long userId, Long roleId);

	int saveUserRoles(Long userId, Long roleId);

	/**
	 * 根据用户id获取角色
	 *
	 * @param userId
	 * @return
	 */
	List<SysRole> findRolesByUserId(Long userId);

	/**
	 * 根据用户ids 获取
	 *
	 * @param userIds
	 * @return
	 */
	List<SysRole> findRolesByUserIds(List<Long> userIds);
}
