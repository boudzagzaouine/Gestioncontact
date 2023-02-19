package com.developer.employeemanagement.dto.request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class EmployeeRequest implements Serializable {
    private String name;
    private Integer tele;

}
