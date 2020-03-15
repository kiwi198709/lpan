package com.lzw.lpan.model;

import lombok.Data;

/**
 * @author LZW
 * @date 2020/1/24 17:08
 */
@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private String roleId;
}
