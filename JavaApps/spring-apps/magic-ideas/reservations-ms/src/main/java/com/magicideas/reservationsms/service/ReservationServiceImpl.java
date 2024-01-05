package com.magicideas.reservationsms.service;

import com.magicideas.reservationsms.controller.ReservationDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Slf4j
public class ReservationServiceImpl implements ReservationService {
    @Override
    public ResponseEntity<ReservationDTO> create(ReservationDTO dto, String userId) {
        return null;
    }
}
