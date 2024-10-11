package com.insurance.insurance_management.entity;


import jakarta.persistence.*;
import lombok.Data;


@Data
@Table(name="policies")
@Entity
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String policyName;
    private String policyType;
    private Double coverageAmount;
    private Double premiumAmount;
}
