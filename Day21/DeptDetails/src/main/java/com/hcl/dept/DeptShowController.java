package com.hcl.dept;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DeptShowController {
	
	@RequestMapping("/DeptInsert")
	public ModelAndView deptInsert(HttpServletRequest req,HttpServletResponse res){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");
		DataSource datasource=(DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt=new JdbcTemplate(datasource);
		String cmd="insert into department values(?,?,?,?)";
		int deptno=Integer.parseInt(req.getParameter("deptno"));
		String dname=req.getParameter("dname");
		String loc=req.getParameter("loc");
		String head=req.getParameter("head");
		jt.update(cmd, new Object[]{deptno,dname,loc,head});
		return(new ModelAndView("insertpage","message","Record Inserted"));
	}
	@RequestMapping("/searchdept")
	public ModelAndView deptSearch(HttpServletRequest req,HttpServletResponse res) {
		int deptno=Integer.parseInt(req.getParameter("deptno"));
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");
		  DataSource datasource=(DataSource)ctx.getBean("dataSource");
		  JdbcTemplate jt=new JdbcTemplate(datasource);
		  String cmd="select * from department where deptno=? ";
		  List dep=null;
		  dep=jt.query(cmd,new Object[]{deptno}, new RowMapper() {

				public Object mapRow(ResultSet rs, int arg1) throws SQLException {
					String depInfo=rs.getInt("deptno")+"-----"+
				    rs.getString("dname")+"------"+
					rs.getString("loc")+"-----"+
					rs.getString("head");
					return depInfo;	
				}
			  });   
				 return (new ModelAndView("showpage","dep",dep));
		  }
}

	
	
	
  /*@RequestMapping("/deptshow")
  public ModelAndView deptShow() {
	  ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");
	  DataSource datasource=(DataSource)ctx.getBean("dataSource");
	  JdbcTemplate jt=new JdbcTemplate(datasource);
	  String cmd="select * from department ";
	  List dep=null;
	  dep=jt.query(cmd, new RowMapper() {

		public Object mapRow(ResultSet rs, int arg1) throws SQLException {
			String depInfo=rs.getInt("deptno")+"-----"+
		    rs.getString("dname")+"------"+
			rs.getString("loc")+"-----"+
			rs.getString("head");
			return depInfo;	
		}
	  });   
		 return (new ModelAndView("showpage","dep",dep));
  }
}
*/