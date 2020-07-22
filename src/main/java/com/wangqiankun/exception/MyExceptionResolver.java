package com.wangqiankun.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        MyException myException = null;

        if (ex instanceof MyException) {
            myException = (MyException) ex;
        } else {
            myException = new MyException("页面出错了");
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("errorMessage",myException.getMessage());
        mv.setViewName("errorPage/errorpage");
        return mv;
    }
}
