package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController
{

	@RequestMapping("/hello")
	public String getMessage()
	{
		return "hello";
	}
	@RequestMapping("/login")
	public String userLogin()
	{
		return "login";
	}
	@RequestMapping("/index")
	public String  dashboard()
	{
		return "index";
	}
	@RequestMapping("/signup")
	public String signup()
	{
		return "login";
	}
	@RequestMapping("/forms")
	public String  userForms()
	{
		return "forms";
	}
	
	@RequestMapping("/calendar")
	public String  calendar()
	{
		return "calendar";
	}
	@RequestMapping("/editors")
	public String  userEditors()
	{
		return "editors";
	}
	@RequestMapping("/tables")
	public String  tables()
	{
		return "tables";
	}
	@RequestMapping("/buttons")
	public String  buttons()
	{
		return "buttons";
	}
	@RequestMapping("/stats")
	public String  stats()
	{
		return "stats";
	}
}
