package edu.co.icesi.examjpatemplate.repositories;

import edu.co.icesi.examjpatemplate.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route, Integer> {
}
