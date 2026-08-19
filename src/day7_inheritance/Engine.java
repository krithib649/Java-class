package day7_inheritance;

class Engine {
	
	void start() {
		
		System.out.println("Engine has started...");
	}
	
	void stop() {
		
		System.out.println("Engine has stopped..");
	}
	
}
	
class Car {
	
	Engine engine; // Car has an engine
	
	Car() {
		
		engine = new Engine();
	}
	
    void drive() {
    	
    	engine.start();
    	System.out.println("Car is driving");
    	engine.stop();
    	
    }
    
    public static void main(String [] args) {
    	
    	Car car = new Car();
    	car.drive();
    }
    
}

