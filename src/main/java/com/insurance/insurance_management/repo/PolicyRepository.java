package com.insurance.insurance_management.repo;

import com.insurance.insurance_management.entity.Policy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRepository extends JpaRepository<Policy, Long> {

}
