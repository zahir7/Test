package exam;

class Car
{
	String name;
	String kind;
	
	public Car(String name, String kind) {
	
		this.name = name;
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", kind=" + kind + "]";
	} 
	
	
	
}

class CarFactory
{
	Car makeCar(String name,String kind)
	{
		Car sport=new Car(name,kind);
		
		return sport;
	}
}

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarFactory ulsan=new CarFactory();
		
		Car [] carr={
				ulsan.makeCar("람보르기니", "스포츠카"),
				ulsan.makeCar("봉고", "트럭"),
				ulsan.makeCar("스타렉스", "승합차")
		};
		
		for(Car c : carr)
		{
			System.out.println(c.toString());
		}

	}

}
