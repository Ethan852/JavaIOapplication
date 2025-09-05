package com.lawsonFeed.lawson;

import com.lawsonFeed.lawson.output.FileCreator;
import com.lawsonFeed.lawson.output.WordCreator;
import com.lawsonFeed.lawson.output.WordCreatorDocx4j;
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
		FileCreator creator3 = new FileCreator();
		creator3.createFile();

//		WordCreator creator = new WordCreator();
//		creator.createWordDocuments();
//		WordCreatorDocx4j creator2 = new WordCreatorDocx4j();
//		creator2.createDocument();;
		System.out.println("Finish all");

	}

}
