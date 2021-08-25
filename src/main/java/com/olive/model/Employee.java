package com.olive.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name="emp_tab_query_Non")
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {
@Id
@Column(name="eid")
private Integer empId;
@Column(name="ename")
private String empName;
@Column(name="esal")
private double empSal;
private String empAddress;

}
