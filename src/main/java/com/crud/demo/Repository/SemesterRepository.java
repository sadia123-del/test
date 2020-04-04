package com.crud.demo.Repository;

import com.crud.demo.Domain.Semester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterRepository extends JpaRepository<Semester,Integer> {
}
