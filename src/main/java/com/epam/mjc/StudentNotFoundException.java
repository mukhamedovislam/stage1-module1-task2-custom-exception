package com.epam.mjc;

class StudentNotFoundException extends IllegalArgumentException{
	public StudentNotFoundException(String message){
		super(message);
	}
}
