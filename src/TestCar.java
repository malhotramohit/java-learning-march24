
public class TestCar {

	public static void main(String[] args) {

		// classname dzire = new classname();

		Car dzire = new Car(); // mem loca // address of this obj

		dzire.carName = "Dzire";
		System.out.println(dzire.carName);
		System.out.println(dzire.engineType);
		System.out.println(dzire.modelYear);
		System.out.println(dzire.topSpeed);
		System.out.println(dzire.getAvgSpeed());

		System.out.println(dzire.hashCode());

		Car ciaz = new Car();

		ciaz.carName = "Ciaz";
		ciaz.modelYear = 2020;
		ciaz.topSpeed = 455.3f; // garbage collection ..

		ciaz = dzire;

		System.out.println(ciaz.engineType);
		System.out.println(ciaz.modelYear);
		System.out.println(ciaz.topSpeed);
		System.out.println(ciaz.getAvgSpeed());
		System.out.println(ciaz.hashCode());

		// car jo 2nd latest yof model

		Car[] cars = { dzire, ciaz };

		// 2nd latest , car name

	}

}
