package test;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ReadForm extends GenericServlet {

	@Override
	public void service(ServletRequest reg, ServletResponse res) throws ServletException, IOException {
		String name = reg.getParameter("n");
		String age = reg.getParameter("a");
		
		System.out.println(name);
		System.out.println(age);
		
	}

	

}
