package com.gestion.service.api.logic.impl;

import com.gestion.service.api.logic.api.GestionService;
import com.gestion.service.api.service.rest.exception.ErrorEnum;
import com.gestion.service.api.to.MessageTo;
import org.dozer.DozerBeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class GestionServiceImpl implements GestionService {

    private static final Logger logger = LoggerFactory.getLogger(GestionServiceImpl.class);

    @Inject
    DozerBeanMapper dozer;


    @Override
    public MessageTo getMessage() {
        MessageTo message = new MessageTo();
        message.setMessage("Test KO");
        message.setCode(400);
        return message;
    }

    @Override
    public MessageTo getMessageById(Integer id) {
        MessageTo message = new MessageTo();
        switch (id) {
            case 200:
                message.setMessage(ErrorEnum.GLOBAL_200_DESCRIPTION.getValue());
                break;
            case 404:
                message.setMessage(ErrorEnum.GLOBAL_404_DESCRIPTION.getValue());
                break;
            default:
                message.setMessage(ErrorEnum.INVALID_CODE_DESCRIPTION.getValue());
                break;
        }

        message.setCode(id);
        return message;

    }
}
