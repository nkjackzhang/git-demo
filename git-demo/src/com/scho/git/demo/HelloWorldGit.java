package com.scho.git.demo;

import java.util.UUID;

public class HelloWorldGit {

	public static void main(String[] args) {
		System.out.println("hello world");
		System.out.println("git");
		UUID randomUUID = UUID.randomUUID();
		System.out.println(randomUUID.toString().length());
		System.out.println(randomUUID);
		EnumClass enumClass = EnumClass.A;
		switch (enumClass) {
		case A:
			System.out.println(EnumClass.A);
			break;
		default:
			System.out.println(EnumClass.B);
			break;
		}
	}
}
