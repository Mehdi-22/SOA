package com.gestion.service.api.logic.api;

import com.gestion.service.api.to.AdherentTo;

import java.util.List;

public interface AdherentService {

    List<AdherentTo> getAllAdherent();

    AdherentTo findAdherentById(Long id);

    AdherentTo createAdhenrent(AdherentTo adherentTo);

    void deleteAdherent(Long id);

    AdherentTo updateAdherent(Long id, AdherentTo adherentTo);
}
