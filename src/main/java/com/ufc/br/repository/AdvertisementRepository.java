package com.ufc.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ufc.br.model.Advertisement;

@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement, Long>{

}
