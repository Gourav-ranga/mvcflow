package com.journaldev.spring.dao;
import java.util.logging.Logger;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.journaldev.spring.model.User;

@Component
public class StudentDaoImpl implements StudentDao 
{

	
 Logger logger=Logger.getLogger(StudentDaoImpl.class.getName());

 public Response getStudentDetail(User userdata)
 {
	 Response response=null;
	 logger.info("------------------------------------------------");
	 logger.info("Id : "+userdata.getId());
	 logger.info("getFname : "+userdata.getFname());
	 logger.info("getLname : "+userdata.getLname());
	 logger.info("getAge : "+userdata.getAge());
	 logger.info("------------------------------------------------");
	 logger.info("In StudentDaoImpl: getStudentDetail()");
	 
		/*
		 * JdbcTemplate jdbcTemplate = new JdbcTemplate(); List<User> data=null;
		 * 
		 * data = jdbcTemplate.query("{call InsertStudentData}",new Object[]
		 * {userdata.getId(),userdata.getFname(),userdata.getLname(),userdata.getAge()},
		 * new BeanPropertyRowMapper<User>(User.class));
		 */
		 
	 
	 
	 return response;
 }
}
