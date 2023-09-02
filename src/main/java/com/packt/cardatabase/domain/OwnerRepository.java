// OwnerRepository.java
package com.packt.cardatabase.domain;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
	Iterable<Owner> findAll(Sort sort);
}