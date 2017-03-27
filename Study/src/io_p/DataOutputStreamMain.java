package io_p;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataOutputStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			FileOutputStream fos = new FileOutputStream("fff/ddd.abc");
			
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeInt(12345);
			dos.writeBoolean(true);
			dos.writeDouble(123.45);
			dos.writeUTF("À±¼º¹® Á» °¡¸¸È÷ÀÖ¾îºÁ");
			
			dos.close();
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
