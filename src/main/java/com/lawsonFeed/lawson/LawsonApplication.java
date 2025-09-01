package com.lawsonFeed.lawson;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileOutputStream;
import java.io.IOException;

@SpringBootApplication
public class LawsonApplication {

	public static void main(String[] args) {

		SpringApplication.run(LawsonApplication.class, args);
		System.out.println("Hello World");
		try(XWPFDocument document = new XWPFDocument()){

			XWPFParagraph paragraph = document.createParagraph();
			XWPFRun run = paragraph.createRun();
			run.setText("Hello, this is a word document");

			// save the documents
			FileOutputStream output = new FileOutputStream("word_output.docx");
			document.write(output);
			System.out.println("Document created successfully!");

		} catch(IOException e){
			e.printStackTrace();
		}
	}

}
