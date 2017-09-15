package in.vamsoft.training.oops;

public class SportsCar extends Car{

	public SportsCar() {
		System.out.println("SportsCar.SportsCar()");
	}
	
	@Override
	public void stop() {
		System.out.println("SportsCar.stop()");
	}

	@Override
	public void brake() {
		System.out.println("SportsCar.brake()");
	}
	
	@Override
	public void start() {
		System.out.println("SportsCar.start()");
	}
	
	

}
