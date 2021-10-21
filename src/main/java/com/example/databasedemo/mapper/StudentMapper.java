package com.example.databasedemo.mapper;

import com.example.databasedemo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> findAllStudent();
     List<Student> findStudentByno(int no);
     List<Student> findStudentByname(String name);
      int insertStudent(Student student);
     int updateStudent(Student student);
     int deleteStudent(Student student);
}