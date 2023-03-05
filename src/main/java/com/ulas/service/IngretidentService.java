package com.ulas.service;

import com.ulas.dto.request.IngretidentSaveRequestDto;
import com.ulas.mapper.IngretidentMapper;
import com.ulas.repository.IIngretidentRepository;
import com.ulas.repository.entity.Ingretident;
import com.ulas.utility.ServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class IngretidentService extends ServiceManager<Ingretident,Long>  {

    private final IIngretidentRepository repository;

    public IngretidentService(IIngretidentRepository repository) {
        super(repository);
        this.repository = repository;
    }
    public Ingretident ingretidentSave(IngretidentSaveRequestDto dto){
        return  save(IngretidentMapper.INSTANCE.toIngretident(dto));
    }
}
