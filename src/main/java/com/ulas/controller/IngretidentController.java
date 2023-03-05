package com.ulas.controller;

import com.ulas.dto.request.IngretidentSaveRequestDto;
import com.ulas.repository.entity.Ingretident;
import com.ulas.service.IngretidentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingretident")
@RequiredArgsConstructor
public class IngretidentController {
    private final IngretidentService ingretidentService;

    @PostMapping("/save")
    public ResponseEntity<Ingretident> ingretidentSave(@RequestBody IngretidentSaveRequestDto dto){
        return ResponseEntity.ok(ingretidentService.ingretidentSave(dto));
    }
}
