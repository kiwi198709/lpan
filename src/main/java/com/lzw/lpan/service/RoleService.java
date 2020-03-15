package com.lzw.lpan.service;

import com.lzw.lpan.model.Role;

import java.util.List;

/**
 * @author LZW
 * @date 2020/1/24 21:26
 */
public interface RoleService {
    List<Role> list();

    Role findById(Integer id);

    Role findByName(String roleName);

    Integer deleteById(Integer id);

    Integer insert(Role role);

}
