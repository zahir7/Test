package exam;

import java.util.Scanner;

class AgeInputException extends Exception
{
	public AgeInputException()
	{
		super("유효하지 않은 나이가 입력되었습니다.");
	}
}


public class ProgrammerDefineException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("나이를 입력하세요 : ");
		
		try {
			int age=readAge();
			System.out.println("당신의 나이는 "+age+"입니다.");
			
		} catch (AgeInputException e) {
			
			System.out.println(e.getMessage());
			
		}
	}
	
	public static int readAge() throws AgeInputException
	{
		Scanner keyboard = new Scanner(System.in);
		int age=keyboard.nextInt();
		if(age<0)
		{
			 
			throw new AgeInputException();
		}
		return age;
	}

}
