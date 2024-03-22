package com.gestion.service.api.logic.impl;

import com.gestion.service.api.dataaccess.dao.AdherentDao;
import com.gestion.service.api.dataaccess.entities.Adherent;
import com.gestion.service.api.logic.api.AdherentService;
import com.gestion.service.api.to.AdherentTo;
import org.dozer.DozerBeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Named
public class AdherentServiceImpl implements AdherentService {

    private static final Logger logger = LoggerFactory.getLogger(GestionServiceImpl.class);

    @Inject
    DozerBeanMapper dozer;

    @Autowired
    AdherentDao adherentDao;


    @Override
    public List<AdherentTo> getAllAdherent() {
        List<Adherent> adherentList = adherentDao.findAll();

        return adherentList.stream()
                .map(adherent -> dozer.map(adherent, AdherentTo.class))
                .collect(Collectors.toList());
    }

    @Override
    public AdherentTo findAdherentById(Long id) {

        Optional<Adherent> adherent = adherentDao.findById(id);

        return dozer.map(adherent,AdherentTo.class);

    }

    @Override
    public AdherentTo createAdhenrent(AdherentTo adherentTo) {

        Adherent newAdherent = dozer.map(adherentTo, Adherent.class);

        Adherent savedAdherent = adherentDao.save(newAdherent);

        return dozer.map(savedAdherent, AdherentTo.class);
    }

    @Override
    public void deleteAdherent(Long id) {

        adherentDao.deleteById(id);

    }

    @Override
    public AdherentTo updateAdherent(Long id, AdherentTo adherentTo) {

        Optional<Adherent> adherent = adherentDao.findById(id);

        if(adherent.isPresent()){

            Adherent existingAdherent = adherent.get();

            // Use Dozer to map the values from AdherentTo to the existing Adherent
            dozer.map(adherentTo, existingAdherent);

            // Save the updated Adherent back to the database
            adherentDao.save(existingAdherent);

            // Map the updated Adherent back to AdherentTo for the return value
            return dozer.map(existingAdherent, AdherentTo.class);

        }
        return null;
    }
}
