package io_p;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	
	public static void main(String[] args) {
//		C:\test_io
		
		File fdir = new File("C://test_io");
		File f = new File("C://test_io//test.txt");

		if(!fdir.exists()){
			fdir.mkdirs();
		}
		
		if(!f.exists()){
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		File f2 = new File("C://test_io//test_copy.txt");
		if(!f2.exists()){
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			
			fis = new FileInputStream(f);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(f2);
			bos = new BufferedOutputStream(fos);
			
			int b_size = 1024*1024;
			
			byte[] b = new byte[b_size];
			
			int readCnt;
			
			while((readCnt = bis.read(b)) != -1){
				bos.write(b, 0, readCnt);
			}
			
			
//			fos.write(new String("æ»≥Á«œººø‰").getBytes());
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				
				if(bos!=null){
					bos.flush();
					bos.close();
				}
				if(fos!=null){
					fos.flush();
					fos.close();
				}
				
				if(bis!=null)bis.close();
				if(fis!=null)fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
