package io_p;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= "fff/littleCow.txt";
		
		try {
			
			FileReader fr = 
					new FileReader(name);
			
			BufferedReader br=
					new BufferedReader(fr);
			
			int data=0;
			
			String line;
			while((line=br.readLine())!=null){
				
				data++;
				System.out.println(data+" : "+line);
				
			}
			
			br.close();
			fr.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
