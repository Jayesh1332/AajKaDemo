package com.example.demo.Controller;

public class PdfService implements DocumentProcessInterface {

	@Override
	public void readDocument() {
		System.out.println("reading pdf");
	}

	@Override
	public void processDocument() {
		System.out.println("processing pdf");
	}

	@Override
	public String printDocument() {
		System.out.println("Print Pdf");
		return "Pdf Printed";
	}
	
	
}
