package io_p;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
			FileInputStream fis = 
						new FileInputStream("fff/littleCow.txt");
			FileOutputStream fos = 
						new FileOutputStream("fff/qwer.txt");
			

			byte [] buf = new byte[10];
			int length;
					
				while(fis.available()>0)
				{
					length=fis.read(buf);
					fos.write(buf,0,length);	
					
				}
				
				
				fis.close();
				fos.close();
		


	}

}
