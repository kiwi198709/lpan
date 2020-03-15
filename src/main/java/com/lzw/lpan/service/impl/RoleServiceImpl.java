package com.lzw.lpan.service.impl;

import com.lzw.lpan.mapper.RoleMapper;
import com.lzw.lpan.model.Role;
import com.lzw.lpan.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author LZW
 * @date 2020/1/24 21:42
 */
@Service
@Transactional
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<Role> list() {
        return roleMapper.list();
    }

    @Override
    public Role findById(Integer id) {
        return roleMapper.findById(id);
    }

    @Override
    public Role findByName(String roleName) {
        return roleMapper.findByName(roleName);
    }

    @Override
    public Integer deleteById(Integer id) {
        return roleMapper.deleteById(id);
    }

    @Override
    public Integer insert(Role role) {
        return roleMapper.insert(role);
    }
}
