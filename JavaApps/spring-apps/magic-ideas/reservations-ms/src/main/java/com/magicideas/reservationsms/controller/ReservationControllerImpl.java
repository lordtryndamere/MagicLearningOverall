package com.magicideas.reservationsms.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("Api/V1/reservations")
@RequiredArgsConstructor
@Slf4j
public class ReservationControllerImpl implements ReservationController {



    @PostMapping
    @Override
    public ResponseEntity<ReservationDTO> create(ReservationDTO reservation, String userId) {
        return null;
    }
}
