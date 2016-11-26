package com.yada.ncpkj.treaty.back.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 记录交易请求地址的拦截器
 *
 * @author QinQiang
 */
public class RecordRequestAddrInterceptor extends HandlerInterceptorAdapter {
    private final static Logger log = LoggerFactory.getLogger(RecordRequestAddrInterceptor.class);

    /**
     * 记录交易请求地址
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String remoteAddr = request.getRemoteAddr();
        int remotePort = request.getRemotePort();
        String uniqueKey = (String) request.getAttribute("uniqueKey");
        log.info("交易[{}]来自[{}:{}]", uniqueKey, remoteAddr, remotePort);
        return super.preHandle(request, response, handler);
    }

}
