package com.gestion.service.api.logic.api;

import com.gestion.service.api.to.AdherentTo;
import com.gestion.service.api.to.MessageTo;

import java.util.List;

public interface GestionService {

    MessageTo getMessage();

    MessageTo getMessageById(Integer id);


}
