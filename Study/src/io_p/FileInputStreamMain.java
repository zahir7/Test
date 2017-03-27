package io_p;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte [] output;
		byte [] buf = new byte[10];
		String res="";
		int len;
		char [] arr=new char[10];
	
		try {
			FileInputStream fis = 
					new FileInputStream("fff/littleCow.txt");
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			
			
		
				
			while(fis.available()>0)
			{
				len=fis.read(buf);
				bos.write(buf,0,len);	
				
			}
			
			res=bos.toString();
			System.out.println(res);
			
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
