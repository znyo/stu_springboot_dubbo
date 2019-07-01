package com.qf.service;

import com.qf.entity.Classes;

import java.util.List;


public interface IClassesService {
    public List<Classes> list();
    public Classes getclassById(Integer id);
}
