package com.lawsonFeed.lawson.output;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class WordCreator {

    public void createWordDocuments(){
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
