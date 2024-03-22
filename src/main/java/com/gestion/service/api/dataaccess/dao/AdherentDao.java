package com.gestion.service.api.dataaccess.dao;

import com.gestion.service.api.dataaccess.entities.Adherent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdherentDao extends JpaRepository<Adherent,Long> {
}
