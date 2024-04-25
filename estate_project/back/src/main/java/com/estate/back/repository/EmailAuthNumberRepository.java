package com.estate.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estate.back.entity.EmailAuthNumberEntity;

// Estate 데이터베이스 email_auth_number 태이블 작업을 위한 리포지토리

@Repository

public interface EmailAuthNumberRepository extends JpaRepository<EmailAuthNumberEntity, String> {

    boolean existsByEmailAndAuthNumber(String email, String authNumber);

}
