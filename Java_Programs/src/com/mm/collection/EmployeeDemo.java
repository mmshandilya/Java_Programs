package com.mm.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

 public class EmployeeDemo 
 {

	private String name;
	private int id;
	private long salary;
	
	public EmployeeDemo(String name, int id, long salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeListDemo [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public static void main(String[] args) 
	{
		List<EmployeeDemo> list=new ArrayList<>();
		list.add(new EmployeeDemo("Mahesh", 1, 3000));
		list.add(new EmployeeDemo("Sharad", 3, 4000));
		list.add(new EmployeeDemo("Deepak", 4, 1000));
		list.add(new EmployeeDemo("Praveen", 5, 7000));
		list.add(new EmployeeDemo("Yogesh", 1, 500));
		System.out.println("Employee List: "+list);
		
		List sortlist=list.stream()
				.sorted((o1,o2)-> (int)(o2.getSalary()-o1.getSalary()))
				.limit(2)
				//.skip(1)
				.collect(Collectors.toList());
		
		System.out.println("Sort List: "+sortlist);
	}

}

