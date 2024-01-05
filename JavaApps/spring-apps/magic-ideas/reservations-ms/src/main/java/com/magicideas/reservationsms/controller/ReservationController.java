package com.magicideas.reservationsms.controller;

import org.springframework.http.ResponseEntity;

public interface ReservationController {
    ResponseEntity<ReservationDTO> create(ReservationDTO reservation, String userId);
}
