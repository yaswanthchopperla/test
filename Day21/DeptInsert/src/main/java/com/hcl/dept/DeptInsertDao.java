package com.hcl.dept;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

public class DeptInsertDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
    public void insertDept() {
    	int deptno;
    	String dname,loc,head;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Dept No :");
    	deptno=Integer.parseInt(sc.nextLine());
    	System.out.println("Dept Name :");
    	dname=sc.nextLine();
    	System.out.println("Location :");
    	loc=sc.nextLine();
    	System.out.println("Head :");
    	head=sc.nextLine();
    	String cmd="insert into department values(?,?,?,?)";
    	jdbcTemplate.update(cmd,new Object[] {deptno,dname,loc,head} );
    }
}
