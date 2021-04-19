package com.vaynenet.user.service;

import com.vaynenet.core.model.SysMenu;
import com.vaynenet.core.service.ISuperService;
import com.vaynenet.user.model.SysRoleMenu;

import java.util.List;
import java.util.Set;

/**
 * @author vayne
 */
public interface ISysRoleMenuService extends ISuperService<SysRoleMenu> {
	int save(Long roleId, Long menuId);

	int delete(Long roleId, Long menuId);

	List<SysMenu> findMenusByRoleIds(Set<Long> roleIds, Integer type);

	List<SysMenu> findMenusByRoleCodes(Set<String> roleCodes, Integer type);
}
