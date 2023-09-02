package com.packt.cardatabase.domain;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository extends PagingAndSortingRepository<Car, Long> {

		// Fetch cars by brand
		//List<Car> findByBrand(String brand);
		// Fetch cars by color
		//List<Car> findByColor(String color);
		// Fetch cars by year
		List<Car> findByYear(int year);
		// Fetch cars by brand and model
		List<Car> findByBrandAndModel(String brand, String
		model);
		// Fetch cars by brand or color
		List<Car> findByBrandOrColor(String brand, String
				color);
		// Fetch cars by brand and sort by year
		List<Car> findByBrandOrderByYearAsc(String brand);
		// Fetch cars by brand using SQL
		List<Car> findByBrand(@Param("brand") String brand);
		// Fetch cars by color
		List<Car> findByColor(@Param("color") String color);
		Iterable<Car> findAll(Sort sort);
		Page<Car> findAll(Pageable pageable );
	
}
