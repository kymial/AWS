package com.jungyoungjong.basic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jungyoungjong.basic.dto.request.student.PatchStudentRequestDto;
import com.jungyoungjong.basic.dto.request.student.PostStudentRequestDto;
import com.jungyoungjong.basic.service.StudentService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    // CREATE
    @PostMapping("/")
    public ResponseEntity<String> postStudent(
            @RequestBody @Valid PostStudentRequestDto requestBody) {
        ResponseEntity<String> response = studentService.postStudent(requestBody);
        return response;
    }

    // UPDATE
    @PatchMapping("/")
    public ResponseEntity<String> patchStudent(
            @RequestBody @Valid PatchStudentRequestDto requestBody) {
        ResponseEntity<String> response = studentService.patchStudent(requestBody);
        return response;
    }

    // DELETE
    @DeleteMapping("/{studentNumber}")
    public ResponseEntity<String> deleteStudent(
            @PathVariable("studentNumber") Integer studentNumber) {
        ResponseEntity<String> response = studentService.deleteStudent(studentNumber);
        return response;
    }

}