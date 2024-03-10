package com.cadastrofornecedor.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.ParameterizedType;

public abstract class GenericService <DTO, Entity>{

    protected final JpaRepository<Entity, Long> repository;
    @Autowired
    private ObjectMapper objectMapper;

    public GenericService(JpaRepository<Entity, Long> repository) {
        this.repository = repository;
    }

    @Transactional
    public void save(DTO dto) {
        Entity entity = objectMapper.convertValue(dto, getEntityClass());
        repository.save(entity);
    }

    @SuppressWarnings("unchecked")
    private Class<Entity> getEntityClass() {
        return (Class<Entity>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[1];
    }
}
