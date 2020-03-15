package com.lzw.lpan.service.impl;

import com.lzw.lpan.service.FileSystemService;
import com.lzw.lpan.utils.HdfsUtils;
import com.lzw.lpan.utils.ResultUtils;
import com.lzw.lpan.vo.ResultVo;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @author LZW
 * @date 2020/1/22 21:51
 */
@Service
public class FileSystemServiceImpl implements FileSystemService {
    @Override
    public ResultVo list(String path){
        List<String> fileList = null;
        try {
            fileList = HdfsUtils.fileList(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResultUtils.success(fileList);
    }
}
