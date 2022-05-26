package com.test.gradle.demo;

import model.Car;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void Test1() {
		List<Car> cars = new ArrayList();
		cars.add(new Car("Tiida", 11));
		cars.add(new Car("Versa", 100));
		cars.add(new Car("Attitude", 50));
		cars.add(new Car("Sentra", 70));
		cars.add(new Car("Aveo", 110));
		cars.add(new Car("March", 150));
		List<Car> cars2= cars.stream().filter(car -> car.getKilometers() < 100)
				.collect(Collectors.toList());

		cars2.forEach(car -> System.out.println("Car " + car.getModel()));

		Stream<String> streamEmpty = Stream.empty();
	}

}
