package com.lzw.lpan.controller;

import com.lzw.lpan.service.FileSystemService;
import com.lzw.lpan.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LZW
 * @date 2020/1/22 21:18
 */
@RestController
@RequestMapping("/fileSystem")
public class FileSystemController {
    @Autowired
    FileSystemService fileSystemService;

    @GetMapping("/list")
    public ResultVo list(String path) {
        return fileSystemService.list(path);
    }
}
