package edu.co.icesi.examjpatemplate.controller;

import edu.co.icesi.examjpatemplate.model.Bus;
import edu.co.icesi.examjpatemplate.model.GeoPoint;
import edu.co.icesi.examjpatemplate.repositories.BusRepository;
import edu.co.icesi.examjpatemplate.repositories.GeoPointRepository;
import edu.co.icesi.examjpatemplate.repositories.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/metroCali")
public class Controller {

    @Autowired
    private GeoPointRepository geoPointRepository;

    @Autowired
    private RouteRepository routeRepository;

    @Autowired
    private BusRepository busRepository;

    /*
    Encontrar los buses que atienden una ruta específica por nombre de la ruta
    */

    @GetMapping("/getBusesByRoute/{routeName}")
    public List<Bus> getBusesByRouteName(@PathVariable String routeName) {
        return busRepository.findByRouteRouteName(routeName);
    }

    /*
    Obtener el recorrido de un bus por placa, esto es, obtener cada posición
    registrada ordenada por tiempo para el bus seleccionado
    */

    @GetMapping("/getGeoPointByBus/{licensePlate}")
    public List<GeoPoint> getGeoPointByBusLicensePlate(@PathVariable String licensePlate) {
        return geoPointRepository.findByBusLicensePlateOrderByTimestamp(licensePlate);
    }

    /*
    Obtener la ubicación más reciente registrada de un bus según su matrícula
    */

    @GetMapping("/getRecentGeoPointByBus/{licensePlate}")
    public GeoPoint getRecentGeoPointByBusLicensePlate(@PathVariable String licensePlate) {
        return geoPointRepository.findFirstByBusLicensePlateOrderByTimestampDesc(licensePlate);
    }




}
