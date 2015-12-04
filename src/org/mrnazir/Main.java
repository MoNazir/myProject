package org.mrnazir;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("java.vm.name"));
		System.out.println(System.getProperty("java.vm.vendor"));
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(System.getProperty("os.version"));
		
		long mem = Runtime.getRuntime().availableProcessors();
		System.out.println(mem);
		
		System.out.println(Calendar.getInstance().toInstant().toString());
		String x = "hello, world!";
		
		System.out.println(x.hashCode());
		
	}

}
