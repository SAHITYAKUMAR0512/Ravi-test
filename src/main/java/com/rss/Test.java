package com.rss;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws Exception {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      String line=br.readLine();
	      int count=1;
	      while(line!=null)
	      {
	    	 
	          System.out.println(count+" "+line);
	          count++;
	         line = br.readLine();
	         if(line.startsWith("0"))
             {
           	 break;
             }
	         
	      }
	      System.out.print("exit");
	}

}
