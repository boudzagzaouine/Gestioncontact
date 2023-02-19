package com.developer.employeemanagement.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "mt_employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "telephone")
    private Integer tele;


    public EmployeeEntity() {
    }

    public EmployeeEntity(Long id, String name, Integer tele) {
        this.id = id;
        this.name = name;
        this.tele = tele;

    }


}
