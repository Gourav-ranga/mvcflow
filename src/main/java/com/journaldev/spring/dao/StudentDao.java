package com.journaldev.spring.dao;

import javax.ws.rs.core.Response;
import com.journaldev.spring.model.User;

public interface StudentDao 
{
	public Response getStudentDetail(User userdata);
	
}
