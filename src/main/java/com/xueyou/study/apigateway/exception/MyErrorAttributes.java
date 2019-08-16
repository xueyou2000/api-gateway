package com.xueyou.study.apigateway.exception;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * 创建 by xueyo on 2019/8/15
 * 自定义错误属性，默认 /error 端点会用DefaultErrorAttributes处理，在json情况下返回前端错误信息的json格式
 * DefaultErrorAttributes 只在没有 ErrorAttributes bean 的时候生效
 */
public class MyErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> result = super.getErrorAttributes(webRequest, includeStackTrace);
        result.put("myErrorField", "gg");
        return result;
    }
}
