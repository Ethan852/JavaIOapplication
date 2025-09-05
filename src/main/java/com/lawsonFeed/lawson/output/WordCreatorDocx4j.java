package com.lawsonFeed.lawson.output;

import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.exceptions.InvalidFormatException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;
import org.docx4j.wml.ObjectFactory;
import org.docx4j.wml.P;
import org.docx4j.wml.R;
import org.docx4j.wml.Text;

public class WordCreatorDocx4j {

    public void createDocument(){
        try{
            // Creating a new Document
            WordprocessingMLPackage wordPackage = WordprocessingMLPackage.createPackage();
            MainDocumentPart main = wordPackage.getMainDocumentPart();

            // Add test to the document
            ObjectFactory factory = new ObjectFactory();
            P paragraph = factory.createP();
            R run = factory.createR();
            Text text = factory.createText();
            text.setValue("Hello, this is a Word Document created with Docx4j!");

            run.getContent().add(text);        //Add text to run
            paragraph.getContent().add(run);    // Add run to paragraph
            main.getContent().add(paragraph);   // Add paragraph to the document

            //Save the document
            wordPackage.save(new java.io.File("output.docx"));
            System.out.println("document saved successfully.");


        } catch (RuntimeException e){
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            throw new RuntimeException(e);
        } catch (Docx4JException e) {
            throw new RuntimeException(e);
        }
    }
}
