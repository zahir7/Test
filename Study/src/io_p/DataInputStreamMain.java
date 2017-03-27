package io_p;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class DataInputStreamMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fis = new FileInputStream("fff/ddd.abc");
			DataInputStream dis = new DataInputStream(fis);
			
			
			dis.readInt();
			dis.readBoolean();
			dis.readDouble();
			dis.readUTF();
			
			//순서가 맞아야한다.
			
			dis.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
