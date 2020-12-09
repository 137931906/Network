package com.cykj.mapper;


import com.cykj.bean.classes;
import com.cykj.bean.student;


import java.util.List;

public interface FindStudentMapper {

    List<student> findStudent();
    List<classes> findStudentByJoin();
    List<student> findStudentByJoin2();
}
