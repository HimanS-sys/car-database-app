package com.myorg.cardatabase01.web;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.myorg.cardatabase01.domain.Car;
import com.myorg.cardatabase01.domain.CarRepository;

@RestController
public class CarController
{
	private final CarRepository repository;
	
	public CarController(CarRepository repository)
	{
		this.repository = repository;
	}
	@GetMapping("/cars")
	public Iterable<Car> getCars()
	{
		// fetch and return cars
		return repository.findAll();
	}
	
}
