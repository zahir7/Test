package exam2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

class Stud
{
	String name;
	int age;
	public Stud(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Stud [name=" + name + ", age=" + age + "]";
	}
	
	
	
}

class Com implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Stud st = (Stud)o1;
		Stud st1 = (Stud)o2;
		
		
		
		int res = 0;
		
		res=st.age-st1.age;
			/*if(st.age-st1.age ==0)
				res=1;*/
		if(st.age==st1.age)
			res=st.name.compareTo(st1.name);
			
			
		
		
		return res;
	}
	
}


public class StudExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,Stud> stu = new TreeMap(new Com());
		
		stu.put(1,new Stud("���ȯ",26));
		stu.put(2,new Stud("������",31));
		stu.put(3,new Stud("����õ",27));
		stu.put(4,new Stud("���¿�",25));
		stu.put(5,new Stud("������",27));
		stu.put(6,new Stud("����ȫ",27));
		stu.put(7,new Stud("����ȭ",38));
		stu.put(9,new Stud("��μ�",29));
		stu.put(10,new Stud("������",28));
		stu.put(11,new Stud("������",28));
		
		
		
		Iterator it = stu.keySet().iterator();
		
		while(it.hasNext()){
			Object key = it.next();
			System.out.println(stu.get(key));
		}
		
		
		
		
		
	}

}
