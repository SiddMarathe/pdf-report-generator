package com.silvercloudsolution.graphsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class GraphsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphsdemoApplication.class, args);

		LineChartExample example = new LineChartExample("Line Chart Example");
			/*SwingUtilities.invokeLater(() -> {
			LineChartExample example = new LineChartExample("Line Chart Example");
			example.setAlwaysOnTop(true);
			example.pack();
			example.setSize(600, 400);
			example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			example.setVisible(true);
*/
		}
	}





