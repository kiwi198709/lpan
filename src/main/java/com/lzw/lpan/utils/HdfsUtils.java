package com.lzw.lpan.utils;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * @author LZW
 * @date 2019/12/17 20:37
 */
public class HdfsUtils {

    static  FileSystem fs = null;

    static {
        try {
            Configuration configuration = new Configuration();
            System.setProperty("HADOOP_USER_NAME", "root");
            fs = FileSystem.get(new URI("hdfs://lmaster:9000"), configuration);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 返回目录下文件名
     */
    public static List<String> fileList(String filePath) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        FileStatus[] listStatus = fs.listStatus(new Path(filePath));
        for (FileStatus status : listStatus) {
            list.add(status.getPath().getName());
        }
        return list;
    }

    /**
     * 返回目录下文件信息
     */
    public static FileStatus[] listStatus(String filePath) throws IOException {
        return fs.listStatus(new Path(filePath));
    }

    /**
     * 目录是否存在
     */
    public static boolean isExist(String filePath) throws IOException {
        if (StringUtils.isEmpty(filePath)) {
            return false;
        }
        return fs.exists(new Path(filePath));
    }

    /**
     * 创建目录
     */
    public static boolean mkdir(String filePath) throws IOException {
        if (isExist(filePath)) {
            return false;
        }
        return fs.mkdirs(new Path(filePath));
    }

    /**
     * 重命名
     */
    public static boolean rename(String oldName, String newName) throws IOException {
        return fs.rename(new Path(oldName), new Path(newName));
    }

    /**
     * 从hdfs下载到本地
     *
     * @param filePath
     * @param localPath
     * @throws IOException
     */
    public static void copyToLocalFile(String filePath, String localPath) throws IOException {
        fs.copyToLocalFile(false, new Path(filePath), new Path(localPath));
        fs.close();
    }

    /**
     * 浏览器下载
     *
     * @param filePath
     * @param out
     * @throws IOException
     */
    public static void copyFileAsStream(String filePath, OutputStream out) throws IOException {
        FSDataInputStream fsInput = fs.open(new Path(filePath));
        IOUtils.copyBytes(fsInput, out, 4096, false);
        fsInput.close();
        out.flush();
    }


}
