package com.silvercloudsolution.graphsdemo;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.io.IOException;

@SpringBootApplication
public class GraphsdemoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(GraphsdemoApplication.class, args);

		LineChartExample example = new LineChartExample("Line Chart Example");

		PDDocument document = new PDDocument();
		PDPage firstPage = new PDPage();
		document.addPage(firstPage);

		PDImageXObject image = PDImageXObject.createFromFile("D:\\graphsdemo\\src\\main\\java\\com\\silvercloudsolution\\graphsdemo\\charttest.jpeg",document);
		PDPageContentStream contentStream = new PDPageContentStream(document, firstPage);
		contentStream.drawImage(image,25,25,320, 212);
		contentStream.close();

		document.save("D:\\graphsdemo\\src\\main\\java\\com\\silvercloudsolution\\graphsdemo\\charttest.pdf");
		document.close();
		System.out.println("PDF Created");
	}
}





