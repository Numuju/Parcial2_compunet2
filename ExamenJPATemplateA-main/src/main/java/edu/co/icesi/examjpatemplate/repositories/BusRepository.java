package edu.co.icesi.examjpatemplate.repositories;

import edu.co.icesi.examjpatemplate.model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusRepository extends JpaRepository<Bus, Integer> {

    List<Bus> findByRouteRouteName(String routeName);
}
