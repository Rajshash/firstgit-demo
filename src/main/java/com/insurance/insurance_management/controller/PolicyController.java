package com.insurance.insurance_management.controller;

import com.insurance.insurance_management.entity.Policy;
import com.insurance.insurance_management.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/policies")
public class PolicyController {

    @Autowired
    public PolicyService policyService;

    @PostMapping("/create")
    public ResponseEntity<?> createPolicy(@RequestBody Policy policy){

        policyService.createPolicy(policy);
        return ResponseEntity.ok("Policy Created Successfully");
    }
    @GetMapping("/all")
    public ResponseEntity<List<Policy>> getAllPolicies(){
        List<Policy> policies = policyService.getAllPolicies();
        return ResponseEntity.ok(policies);
    }

}
