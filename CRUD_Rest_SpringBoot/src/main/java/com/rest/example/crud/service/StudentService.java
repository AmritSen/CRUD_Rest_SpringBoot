package com.rest.example.crud.service;

import java.util.List;

import com.rest.example.crud.dto.StudentDTO;

public interface StudentService {

	StudentDTO createOrUpdate(StudentDTO studentDTO);

	StudentDTO getById(String studentId);

	List<StudentDTO> getAll();

	boolean deleteById(String studentId);
}
