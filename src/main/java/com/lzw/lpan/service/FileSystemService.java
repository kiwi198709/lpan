package com.lzw.lpan.service;

import com.lzw.lpan.vo.ResultVo;

import java.io.IOException;

/**
 * @author LZW
 * @date 2020/1/22 21:49
 */
public interface FileSystemService {

    ResultVo list(String path);
}
