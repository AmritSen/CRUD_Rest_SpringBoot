package com.rest.example.crud.dao.impl;

import org.springframework.stereotype.Repository;

import com.rest.example.crud.dao.StudentDao;
import com.rest.example.crud.models.Student;

@Repository
public class StudentDaoImpl extends BaseDaoImpl<Student> implements StudentDao {

}