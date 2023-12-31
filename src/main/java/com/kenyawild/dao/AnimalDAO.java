package com.kenyawild.dao;

import com.kenyawild.models.Animal;

import java.util.List;

public interface AnimalDAO {
    Integer create(Animal animal);
    void update(Animal animal);
    List<Animal> getAll();
    Animal getById(Integer id);
    void delete(String id);
}
