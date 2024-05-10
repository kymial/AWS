package com.estate.back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.estate.back.entity.EstateEntity;
import com.estate.back.repository.resultSet.GetLocalDataResultSet;

public interface EstateRepository extends JpaRepository<EstateEntity, Integer> {

    @Query(value = 
    "SELECT `year_month` as yearMonth, sale, lease, month_rent as monthRent " +
    "FROM estate " +
    "WHERE `year_month` BETWEEN '2023-01-01' AND '2023-12-31' " +
    "AND `local` = :local ",
    nativeQuery = true
    )
    List<GetLocalDataResultSet> getLocalData(@Param("local") String local);


}
