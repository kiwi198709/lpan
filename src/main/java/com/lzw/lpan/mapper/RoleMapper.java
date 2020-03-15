package com.lzw.lpan.mapper;

import com.lzw.lpan.model.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author LZW
 * @date 2020/1/24 21:45
 */
@Mapper
@Component
public interface RoleMapper {
    List<Role> list();

    Role findById(Integer id);

    Role findByName(String roleName);

    Integer deleteById(Integer id);

    Integer insert(Role role);
}
