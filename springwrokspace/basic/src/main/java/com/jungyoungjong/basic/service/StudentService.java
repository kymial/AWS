package com.jungyoungjong.basic.service;

import org.springframework.http.ResponseEntity;

import com.jungyoungjong.basic.dto.request.student.PostStudentRequestDto;

public interface StudentService {
    ResponseEntity<String> postStudent(PostStudentRequestDto dto);
}
