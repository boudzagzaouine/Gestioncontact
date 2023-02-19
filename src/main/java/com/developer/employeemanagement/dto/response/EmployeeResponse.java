package com.developer.employeemanagement.dto.response;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class EmployeeResponse implements Serializable {
    private Long id;
    private String name;
    private Integer tele;

    public EmployeeResponse() {
    }

    public Long getId() {
        return id;
    }


}
