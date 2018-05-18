/**
 * 
 */
package pe.com.test.dao;

import pe.com.test.graphics.Track;
import pe.com.test.graphics.vehicules.Car;

/**
 * @author PCQUIROGA
 *
 */
public class Test1 {

	public static void main(String[] args) {
		Track track = new Track();
		Car car1 = new Car("car.png");
		Car car2 = new Car("car.png");
		Car car3 = new Car("car.png");
		//Car car4 = new Car("car.png");
		//Car car5 = new Car("car.png");
		car1.setVelocity(5);
		car2.setVelocity(6);
		car3.setVelocity(10);
		//car4.setVelocity(7);
		//car5.setVelocity(9);
		track.add(car1);
		track.add(car2);
		track.add(car3);
		//track.add(car4);
		//track.add(car5);
		track.start();
	}
}
