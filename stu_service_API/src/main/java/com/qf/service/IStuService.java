package com.qf.service;

import com.qf.entity.Student;

import java.util.List;


public interface IStuService {
    public int addstu(Student student);
    public List<Student> stulist();
}
