package com.vaynenet.usercenter.service.impl;

import com.vaynenet.core.model.SysMenu;
import com.vaynenet.core.service.impl.SuperServiceImpl;
import com.vaynenet.usercenter.mapper.SysRoleMenuMapper;
import com.vaynenet.usercenter.model.SysRoleMenu;
import com.vaynenet.usercenter.service.ISysRoleMenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

/**
 * @author zlt
 */
@Slf4j
@Service
public class SysRoleMenuServiceImpl extends SuperServiceImpl<SysRoleMenuMapper, SysRoleMenu> implements ISysRoleMenuService {
 	@Resource
	private SysRoleMenuMapper sysRoleMenuMapper;

	@Override
	public int save(Long roleId, Long menuId) {
		return sysRoleMenuMapper.save(roleId, menuId);
	}

	@Override
	public int delete(Long roleId, Long menuId) {
		return sysRoleMenuMapper.delete(roleId, menuId);
	}

	@Override
	public List<SysMenu> findMenusByRoleIds(Set<Long> roleIds, Integer type) {
		return sysRoleMenuMapper.findMenusByRoleIds(roleIds, type);
	}

	@Override
	public List<SysMenu> findMenusByRoleCodes(Set<String> roleCodes, Integer type) {
		return sysRoleMenuMapper.findMenusByRoleCodes(roleCodes, type);
	}
}
