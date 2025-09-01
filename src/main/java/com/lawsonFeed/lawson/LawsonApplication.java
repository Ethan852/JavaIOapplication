package com.lawsonFeed.lawson;

import com.lawsonFeed.lawson.output.WordCreator;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileOutputStream;
import java.io.IOException;

@SpringBootApplication
public class LawsonApplication {


	public static void main(String[] args) {

		SpringApplication.run(LawsonApplication.class, args);
		System.out.println("Hello World");
		WordCreator creator = new WordCreator();
		creator.createWordDocuments();

	}

}
