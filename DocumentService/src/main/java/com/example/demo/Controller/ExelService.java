package com.example.demo.Controller;

public class ExelService implements DocumentProcessInterface {

	public void readDocument() {
		System.out.println("Exel Document Reading");
	}

	public void processDocument() {
		System.out.println("Exel Document Processing");

	}

	public String printDocument() {
		System.out.println("Exel Document Printed");
		return "Exel Printed";
	}

}
