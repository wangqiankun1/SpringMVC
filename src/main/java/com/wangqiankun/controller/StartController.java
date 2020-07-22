package com.wangqiankun.controller;
import com.wangqiankun.domian.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//
//
@Controller
public class StartController {

    @RequestMapping(path = "/start")
    public String start(Model model){
        System.out.println("hello");
        Student student = new Student();
        student.setStuName("王乾坤");
        student.setStuAge(20);
        model.addAttribute("student",student);
        return "success";
    }
}
