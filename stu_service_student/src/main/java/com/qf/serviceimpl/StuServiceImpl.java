package com.qf.serviceimpl;


import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.qf.entity.Classes;
import com.qf.entity.Student;
import com.qf.mapper.StuMapper;
import com.qf.service.IClassesService;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class StuServiceImpl implements IStuService {

    @Autowired
    private StuMapper stuMapper;
   @Reference
   private IClassesService classesService;

    @Override
    public int addstu(Student student) {
        return stuMapper.insert(student);
    }

    @Override
    public List<Student> stulist() {
        List<Student> students = stuMapper.selectList(null);
        for (Student student : students) {
            Classes classes = classesService.getclassById(student.getCid());
            student.setClasses(classes);
        }
        return students;
    }
}
