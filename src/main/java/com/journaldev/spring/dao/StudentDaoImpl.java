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
	 logger.info("getFname : "+userdata.getLname());
	 logger.info("getFname : "+userdata.getAge());
	 logger.info("------------------------------------------------");
	 logger.info("In StudentDaoImpl: getStudentDetail()");
	 return response;
 }
}
