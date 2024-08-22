package com.api.api_java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.SortedSet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiJavaApplication implements CommandLineRunner{

	public static void main(String[] args){
		SpringApplication.run(ApiJavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var list = new ArrayList<String>();
		list.add("Um"); 
		list.add("Dois"); 
		list.add("Tres"); 
		list.add("Quatro"); 
		list.add("Cinco"); 
		System.out.println("RUNNER...");
		list.forEach(l -> System.out.println(l));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.iterator().next());
		System.out.println(list.iterator().next());
		System.out.println(list.iterator().next());

		System.out.println("----------------------");

		var set = new HashSet<String>();
		set.add("Um"); 
		set.add("Dois"); 
		set.add("Tres"); 
		set.add("Tres"); 
		set.add("Quatro"); 
		set.add("Cinco"); 
		set.forEach(s -> System.out.println(s));
		
	}

}
