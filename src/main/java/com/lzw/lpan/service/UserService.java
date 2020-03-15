package com.lzw.lpan.service;

import com.lzw.lpan.model.User;

import java.util.List;

/**
 * @author LZW
 * @date 2020/1/24 17:12
 */
public interface UserService {
    List<User> list();

    User findById(Long id);

    User findByName(String username);

    List<User> findByRole(Integer roleId);

    Integer deleteById(Long id);

    Integer insert(User user);
}
