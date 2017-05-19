package first.assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assign1 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(System.in);
		Switch sw = new Switch();
		Frame frame = null;

		File file = new File("D://workspace//DataStructure//src//first//assignment1//BigSwitch.txt");
		Scanner inputFrame = null;
		boolean isOK = false;

		if (file.exists()) {
			inputFrame = new Scanner(file);
			while (inputFrame.hasNext()) {
				frame = new Frame();
				isOK = frame.readFrame(inputFrame);
				if (isOK) {
					sw.processFrame(frame);
				} else {
					System.out.println("Invalid data read....ending program");
					break;
				}
			}
		} else {
			System.out.println("No file read...Program ending");
		}

		// display the table
		sw.displayTable();

		input.close();
		inputFrame.close();

	} // end of main

}
