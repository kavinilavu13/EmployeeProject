package com.employee;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;

public class ReadDataFromFile {
  public static void main(String args[])throws Exception{  
	     File fout = new File("D:\\data.txt");
		FileOutputStream fos = new FileOutputStream(fout,true);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
	    for (int i = 0; i < 10; i++) {
		
		bw.write("something");
			bw.newLine();
		}

		bw.close();
	  
	  
	  /*
	          FileReader fr=new FileReader("D:\\data.txt");
	          BufferedReader br=new BufferedReader(fr);
	          String Line=br.readLine();
	       
	          while(Line!=null)    
	          {
	        	  
	        	  String[] linesplit=Line.split(",");
	        	 int lineLength= linesplit.length;
	        	 // for(int i=0;i<=lineLength;i++)
	        	//  {
	        		 String salary= linesplit[3];	        		
	        		 int filesalary = Integer.parseInt(salary);	 
	        		 if(filesalary>300)
	        		 {
	        		  System.out.println(Line);
	        		 }
	        	
	        	//  }
	        	  Line=br.readLine();
	        	 
	          }
	          br.close();    
	          
	          */
	    } 
  

 
}
