package com.lzw.lpan.controller;

import com.lzw.lpan.model.Role;
import com.lzw.lpan.service.RoleService;
import com.lzw.lpan.utils.ResultUtils;
import com.lzw.lpan.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author LZW
 * @date 2020/1/24 17:08
 */
@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    RoleService roleServie;

    @GetMapping("/list")
    public ResultVo list() {
        List<Role> list = roleServie.list();
        return ResultUtils.success(list);
    }

    @GetMapping("/findById")
    public ResultVo findById(Integer id) {
        Role role = roleServie.findById(id);
        return ResultUtils.success(role);
    }

    @GetMapping("/findByName")
    public ResultVo findByName(String roleName) {
        Role role  = roleServie.findByName(roleName);
        return ResultUtils.success(role);
    }


    @DeleteMapping ("deleteById")
    public ResultVo deleteById(Integer id) {
        Integer res = roleServie.deleteById(id);
        return ResultUtils.success(res);
    }

    @PostMapping("insert")
    public ResultVo insert(Role role) {
        Integer res = roleServie.insert(role);
        return ResultUtils.success(res);
    }


}
