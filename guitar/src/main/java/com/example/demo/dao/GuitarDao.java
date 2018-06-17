package com.example.demo.dao;


import com.example.demo.entity.Guitar;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GuitarDao extends CrudRepository<Guitar,Integer> {

    public List<Guitar>  findByName(String name);

}
