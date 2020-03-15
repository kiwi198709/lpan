package com.lzw.lpan.utils;


import com.lzw.lpan.vo.ResultVo;

/**
 * @Author LZW
 * @Date 2019/11/20 18:02
 **/
public class ResultUtils {
    private ResultUtils() {
    }

    public static ResultVo success() {
        return ResultVo.SUCCESS;
    }

    public static ResultVo success(Integer code, String msg) {
        ResultVo<String> success = ResultVo.SUCCESS;
        success.setMsg(msg);
        return success;
    }

    public static <T> ResultVo<T> success(T content) {
        ResultVo<T> success = new ResultVo<>();
        success.setCode(ResultVo.SUCCESS_CODE);
        success.setContent(content);
        return success;
    }


    public static ResultVo faild() {
        return ResultVo.FAIL;
    }

    public static ResultVo faild(Integer code, String msg) {
        ResultVo<String> faild = ResultVo.FAIL;
        faild.setMsg(msg);
        return faild;
    }

    public static <T> ResultVo faild(T content) {
        ResultVo<T> faild = new ResultVo<>();
        faild.setCode(ResultVo.FAIL_CODE);
        faild.setContent(content);
        return faild;
    }


}
