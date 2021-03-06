package com.miaoshaproject.response;

/**
 * @program: miaosha
 * @description:
 * @author: JIANG Ziyang
 * @create: 2019-08-09 17:37
 **/
public class CommonReturnType {
    //表明对应请求的返回处理结果"success"或"fail"
    private String status;

    //若status=succes，则data内返回前端需要的json数据
    //若status=fail，则data内使用通用的错误码格式
    private Object data;

    //定义一个通用的创建方法
    public static CommonReturnType create(Object result){
        return CommonReturnType.create(result, "success");
    }

    public static CommonReturnType create(Object result, String status){
        CommonReturnType type = new CommonReturnType();
        type.setData(result);
        type.setStatus(status);
        return type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
