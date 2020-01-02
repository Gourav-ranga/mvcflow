package com.journaldev.spring.service;

import javax.ws.rs.core.Response;

import com.journaldev.spring.model.User;

public interface StudentService 
{
 public Response getStudentDetail(User userdata);
}
