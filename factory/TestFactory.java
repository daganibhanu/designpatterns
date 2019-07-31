package designpatterns.factory;

public class TestFactory {

	enum CarType {
		MINI, SEDAN, LUXURY
	}

	public static void main(String[] args) {
		Car minicar = buildCar(CarType.MINI);
		minicar.someFunctionality();

		Car sedan = buildCar(CarType.SEDAN);
		sedan.someFunctionality();

		Car luxury = buildCar(CarType.LUXURY);
		luxury.someFunctionality();
	}

	public static Car buildCar(CarType model) {
		Car car = null;
		switch (model) {
		case MINI: {
			car = new MiniCar();
			break;
		}
		case SEDAN: {
			car = new SedanCar();
			break;
		}
		case LUXURY: {
			car = new LuxuryCar();
			break;
		}
		default: 
            break;
		}
		return car;
	}

}
