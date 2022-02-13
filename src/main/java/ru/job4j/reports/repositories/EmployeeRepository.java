package ru.job4j.reports.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.job4j.reports.domains.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> { }
