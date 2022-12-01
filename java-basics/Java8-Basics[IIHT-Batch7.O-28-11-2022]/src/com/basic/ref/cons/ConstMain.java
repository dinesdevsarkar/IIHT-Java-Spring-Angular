package com.basic.ref.cons;

public class ConstMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("We are studying here the constructor reference");

		IStudent istudent = () -> {
			return new Student();
		};
		
		//IStudent istudent = () -> new Student();
		
		Student student = istudent.getStudent();
		student.display("ABC", "JavaStudent");

	}

}
