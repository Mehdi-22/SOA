package com.gestion.service.api.api;

import com.gestion.service.api.to.AdherentTo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/adherent")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface AdherentRestService {

    @GET
    List<AdherentTo> getAllAdherent();

    @GET
    @Path("/{id}")
    AdherentTo getAdherentById(@PathParam("id") Long id);

    @PUT
    @Path("/{id}")
    AdherentTo updateAdherent (@PathParam("id") Long id, @RequestBody AdherentTo adherentTo);

    @POST
    @Path("/create")
    AdherentTo createAdherent(@RequestBody AdherentTo adherentTo);

    @DELETE
    @Path("/{id}")
    void deleteAdherent(@PathParam("id") Long id);


}
