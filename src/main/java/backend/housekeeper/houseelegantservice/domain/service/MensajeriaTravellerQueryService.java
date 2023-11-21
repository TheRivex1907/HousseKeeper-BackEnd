package backend.housekeeper.houseelegantservice.domain.service;



import backend.housekeeper.houseelegantservice.domain.model.aggregates.MensajeriaTraveller;

import java.util.List;
import java.util.Optional;

public interface    MensajeriaTravellerQueryService {
    MensajeriaTraveller getMensajeriaTravellerById(Long mensajeriaTravelleId);
    List<MensajeriaTraveller> getAllMensajes();
}