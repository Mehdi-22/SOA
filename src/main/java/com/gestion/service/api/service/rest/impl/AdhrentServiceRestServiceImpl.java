package com.gestion.service.api.service.rest.impl;

import com.gestion.service.api.api.AdherentRestService;
import com.gestion.service.api.logic.api.AdherentService;
import com.gestion.service.api.to.AdherentTo;

import javax.inject.Inject;
import java.util.List;

public class AdhrentServiceRestServiceImpl implements AdherentRestService {


    @Inject
    AdherentService adherentService;

    @Override
    public List<AdherentTo> getAllAdherent() {
        return adherentService.getAllAdherent();
    }

    @Override
    public AdherentTo getAdherentById(Long id) {
        return adherentService.findAdherentById(id);
    }

    @Override
    public AdherentTo createAdherent(AdherentTo adherentTo) {
        return adherentService.createAdhenrent(adherentTo);
    }

    @Override
    public AdherentTo updateAdherent(Long id, AdherentTo adherentTo) {
        return adherentService.updateAdherent(id,adherentTo);
    }
    @Override
    public void deleteAdherent(Long id) {
        adherentService.deleteAdherent(id);
    }
}
