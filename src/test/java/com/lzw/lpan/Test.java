package com.lzw.lpan;

import com.lzw.lpan.utils.HdfsUtils;

import java.io.IOException;
import java.util.List;

/**
 * @author LZW
 * @date 2019/12/29 21:44
 */
public class Test {
    public static void main(String[] args) throws IOException {
        List<String> list = HdfsUtils.fileList("/");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
