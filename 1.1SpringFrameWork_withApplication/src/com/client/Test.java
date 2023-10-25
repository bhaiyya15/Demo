package com.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.model.Student;

public class Test 
{
public static void main(String[] args) 
{

	

//**************Using ApplicationContext***************************	
	ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	
	Student s1=(Student) ac.getBean("s");
	
	s1.display();
	
	
	
}
}
