package io_p;

import java.io.*;

public class FileWriteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= "fff/littleCow.txt";
		int data;
		
		try {
			
			FileReader fr = new FileReader(name);
			
			FileWriter fw = new FileWriter("fff/cowSong.txt");
			
			while((data=fr.read())!=-1)
			{
				System.out.print((char)data);
				fw.write(data);
			}
			
			fw.close();
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
