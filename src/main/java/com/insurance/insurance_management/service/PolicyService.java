package com.insurance.insurance_management.service;

import com.insurance.insurance_management.entity.Policy;
import com.insurance.insurance_management.repo.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

    public Policy createPolicy(Policy policy){
        return policyRepository.save(policy);
    }

    public List<Policy> getAllPolicies(){
        return policyRepository.findAll();
    }

}
