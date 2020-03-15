package com.lzw.lpan.controller;

import com.lzw.lpan.model.User;
import com.lzw.lpan.service.UserService;
import com.lzw.lpan.utils.ResultUtils;
import com.lzw.lpan.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author LZW
 * @date 2020/1/24 17:08
 */
@Api(value = "用户")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userServie;

    @ApiOperation(value = "用户列表",notes = "用户列表 ")
    @GetMapping("/list")
    public ResultVo list() {
        List<User> list = userServie.list();
        return ResultUtils.success(list);
    }

    @ApiOperation(value = "查询用户")
    @GetMapping("/findById")
    public ResultVo findById(Long id) {
        User user = userServie.findById(id);
        return ResultUtils.success(user);
    }

    @ApiOperation(value = "查询用户")
    @GetMapping("/findByName")
    public ResultVo findByName(String username) {
        User user = userServie.findByName(username);
        return ResultUtils.success(user);
    }
    @ApiOperation(value = "查询用户")
    @GetMapping("/findByRole")
    public ResultVo findByRole(Integer roleId) {
        List<User> list = userServie.findByRole(roleId);
        return ResultUtils.success(list);
    }
    @ApiOperation(value = "删除用户")
    @DeleteMapping("deleteById")
    public ResultVo deleteById(Long id) {
        Integer res = userServie.deleteById(id);
        return ResultUtils.success(res);
    }
    @ApiOperation(value = "添加用户")
    @PostMapping("insert")
    public ResultVo insert(User user) {
        Integer res = userServie.insert(user);
        return ResultUtils.success(res);
    }

}
