package com.learning.employe.model;

public class Test {

	public void fullThrottle() {
		System.out.println("The car is going as fast as it can");
	}
	public void speed(int maxSpeed) {
		System.out.println("Max Speed is: " + maxSpeed);
	}
	public static void main(String[] args) {
		Test test = new Test();
		test.fullThrottle();
		test.speed(120);
	}
}
