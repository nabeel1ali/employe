package com.learning.employe.model;

public class Main {
public void sum(int a,int b) {
	System.out.println("sum" + " = " +(a + b));
}
public void div(int a,int b) {
	System.out.println("div = " + (a/b));
}
public void mul(int a,int b) {
	System.out.println("mul = " + (a*b));
}
public void sub(int a, int b) {
	System.out.println("sub" + " = " +(a - b));
}
public static void main(String[] args) {
	Main main = new Main();
	main.sum(10, 5);
	main.mul(10, 10);
	main.div(100, 10);
	main.sub(100, 99);
}


}
