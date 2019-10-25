package com.y.Dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.y.model.Employee;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer>{
  @Query("select e from Employee e where Dept=?1 and Desig=?2")
  List<Employee> findByDeptDesig(String dept,String desig);
  
  @Query("select e from Employee e where Name=?1 and Dept=?2")
  List<Employee> findByNameDept(String empname,String dept);
  
  @Query("select e from Employee e where  Dept=?1 and Desig=?2 and Basic>?3")
  List<Employee> findByDeptDesigSalary(String dept,String desig,int basi);
  
  @Query("select e from Employee e where  Dept=?1 and Desig=?2 and Basic>?3 and Name LIKE 'k%'")
  List<Employee> findByDeptDesigSalaryName(String dept,String desig,int basi,Sort sort);
  
  @Query("select e from Employee e where Dept=?1 ")
  List<Employee> findByDept(String dept,Sort sort);

  
}
