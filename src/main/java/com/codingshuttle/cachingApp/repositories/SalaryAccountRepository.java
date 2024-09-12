package com.codingshuttle.cachingApp.repositories;

import com.codingshuttle.cachingApp.entities.SalaryAccount;
import org.springframework.data.repository.CrudRepository;

public interface SalaryAccountRepository extends CrudRepository<SalaryAccount, Long> {
}
