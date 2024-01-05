package com.magicideas.reservationsms.service;

import com.magicideas.reservationsms.controller.ReservationDTO;
import org.springframework.http.ResponseEntity;

public interface ReservationService {
    ResponseEntity<ReservationDTO> create(ReservationDTO dto, String userId);

}
