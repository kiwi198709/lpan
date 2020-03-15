package com.lzw.lpan.mapper;

import com.lzw.lpan.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author LZW
 * @date 2020/1/24 17:20
 */
@Mapper
@Component
public interface UserMapper {
    List<User> list();

    User findById(Long id);

    User findByName(String username);

    List<User> findByRole(Integer roleId);

    Integer deleteById(Long id);

    Integer insert(User user);
}
