package com.login.entity;

import lombok.Data;
import org.hibernate.annotations.BatchSize;
import org.springframework.boot.convert.DataSizeUnit;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
//import javax.validation.constraints.Pattern;

@Data
@Entity
@Table(name = "regis_table")
public class Registration {
    @Id
    @Pattern(regexp = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")
    private String regId;
    private String fName;
    private String lName;
    @Column(unique = true)
    @Pattern(regexp = "/^(\\+\\d{1,3}[- ]?)?\\d{10}$/")
    private Long mobNo;
    private String regPwd;
    @Transient
    private String cnfPwd;
}
