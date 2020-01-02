package com.journaldev.spring.service;

import javax.ws.rs.core.Response;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.journaldev.spring.dao.StudentDao;
import com.journaldev.spring.model.User;

@Component
public class StudentServiceImpl implements StudentService 
{
Logger logger=Logger.getLogger(StudentServiceImpl.class);
	
 @Autowired
 StudentDao sdao;
 Response response;
 
 public Response getStudentDetail(User userdata)
 {
	 response = sdao.getStudentDetail(userdata);
	 logger.info("In Service getStudentDetail()");
	 return response;
 }
 
}
