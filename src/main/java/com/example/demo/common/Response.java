package com.example.demo.common;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Leo
 */
@Data
@ApiModel(value = "全局统一返回结果")
public class Response {
    @ApiModelProperty(value = "返回码")
    private  Integer code;
    @ApiModelProperty(value = "返回消息")
    private  String message;
    @ApiModelProperty(value = "是否成功")
    private  Boolean success;
    @ApiModelProperty(value = "返回数据")
    private Object data;
    private Response() {}
    /**
     * 返回成功的结果集
     */
    public static Response  success(){
        Response  r = new Response ();
        r.setSuccess(ResultCodeEnum.SUCCESS.isSuccess());
        r.setCode(ResultCodeEnum.SUCCESS.getCode());
        return r;
    }
    /**
     * 返回带参的成功结果集
     */
    public static Response  success(Object data) {
        Response  r = new Response ();
        r.setSuccess(ResultCodeEnum.SUCCESS.isSuccess());
        r.setCode(ResultCodeEnum.SUCCESS.getCode());
        r.setData(data);
        return r;
    }
    /**
     * 返回失败的结果集
     */
    public static Response  error(){
        Response  r = new Response ();
        r.setSuccess(ResultCodeEnum.UNKNOWN_REASON.isSuccess());
        r.setCode(ResultCodeEnum.UNKNOWN_REASON.getCode());
        return r;
    }
    /**
     *
     * @param resultCodeEnum
     * @return
     */
    public static Response  setResult(ResultCodeEnum resultCodeEnum){
        Response  r = new Response ();
        r.setSuccess(resultCodeEnum.isSuccess());
        r.setCode(resultCodeEnum.getCode());
        return r;
    }

    public Response  success(Boolean success){
        this.setSuccess(success);
        return this;
    }

    public Response  message(String message){
        this.setMessage(message);
        return this;
    }

    public Response  code(Integer code){
        this.setCode(code);
        return this;
    }
    public Response  data(Object data) {
        this.data = data;
        return this;
    }
}




