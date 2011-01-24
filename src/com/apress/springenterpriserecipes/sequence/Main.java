package com.apress.springenterpriserecipes.sequence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
		SequenceGenerator generator = (SequenceGenerator) context.getBean("sequenceGenerator");
		System.out.println(generator.getSequence());
        System.out.println(generator.getSequence());

	}

}
