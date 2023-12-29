package fileHandlingDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class FileClass {
	
	public static void main(String[] args) throws IOException {
		
		//Reading a file which is present outside the project work space
		File file1 = new File("C:\\Users\\HOME\\Desktop\\Testing\\FileDemo.txt");
		//File outside the project we cannot create shortcut path to read file
		
		//Reading a file which is present inside the project work space
		//File file2 = new File("C:\\Users\\HOME\\Desktop\\JavaSeleniumTrainingWorkSpace\\FileDemo1.txt");
		//C:\\Users\\HOME\\Desktop\\JavaSeleniumTrainingWorkSpace\\FileDemo1.txt - is Complete/Absolute Path
		//File inside the project we can create shortcut path to read file
		
		//short cut path to read file inside the project
		File file2 = new File("FileDemo1.txt");//shortcut path - Just give file name not need to give full path when the file is inside the project 
		
		//getAbsolutePath() : To read full path of the file
		System.out.println(file2.getAbsolutePath());
		
		File file3 = new File("sample.txt");
		
		//To read text from file
		//We have to use 2 classes
		//1.FileReader
		//2.BufferReader
		
		FileReader fr = new FileReader(file3);
		BufferedReader br = new BufferedReader(fr);
		
/*		System.out.println(br.readLine());// reads 1st line from the file
		System.out.println(br.readLine());// reads 2nd line from the file
		System.out.println(br.readLine());// reads 3rd line from the file
		System.out.println(br.readLine());// reads 4th line from the file
		System.out.println(br.readLine());// reads 5th line from the file
		System.out.println(br.readLine());// reads 6th line from the file
		System.out.println(br.readLine());// reads 7th line from the file
		System.out.println(br.readLine());// reads 8th line from the file - 8th line is not exist in the file so it prints Null
		*/
		
		//Optimize the above code using while() loop
		//Step1: take one variable as String str;
		//Step2: check condition "br.readLine()!=null" and store this in str vaiable
		//str=br.readLine()!=null
		//Step4: write while loop like while(str){ sop(str)}
		
		String str;
		
		while((str=br.readLine())!=null) {
			
			System.out.println(str);
			
		}
			
	}
	
}
