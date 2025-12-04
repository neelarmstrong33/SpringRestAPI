package com.codeburner.jain.learningRestAPI.respositories;

import com.codeburner.jain.learningRestAPI.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
