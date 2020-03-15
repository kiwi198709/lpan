package com.lzw.lpan.service.impl;

import com.lzw.lpan.mapper.UserMapper;
import com.lzw.lpan.model.User;
import com.lzw.lpan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LZW
 * @date 2020/1/24 17:17
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    public User findById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public User findByName(String username) {
        return userMapper.findByName(username);
    }

    @Override
    public List<User> findByRole(Integer roleId) {
        return userMapper.findByRole(roleId);
    }

    @Override
    public Integer deleteById(Long id) {
        return userMapper.deleteById(id);
    }

    @Override
    public Integer insert(User user) {
        return userMapper.insert(user);
    }
}
