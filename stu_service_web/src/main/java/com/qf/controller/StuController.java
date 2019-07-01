package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Classes;
import com.qf.entity.Student;
import com.qf.service.IClassesService;
import com.qf.service.IStuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StuController {
    @Reference
    private IStuService stuService;
    @Reference
    private IClassesService classesService;

    @RequestMapping("/toadd")
    public String toadd(Model model){
        List<Classes> classes=classesService.list();
        model.addAttribute("classes",classes);
        return "addstu";
    }
    @RequestMapping("/addstu")
    public String addstu(Student student){
        int result=stuService.addstu(student);
        return "index";
    }
    @RequestMapping("/list")
    public String list(Model model){
       List<Student> list= stuService.stulist();
        model.addAttribute("list",list);
        return "stulist";
    }
    @RequestMapping("/g")
    public String q(Model model){

        return "a";
    }
}
