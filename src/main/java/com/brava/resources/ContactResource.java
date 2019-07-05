package com.brava.resources;

import com.brava.api.Contact;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/contacts")
public class ContactResource {
    private static final List<Contact> contacts = new ArrayList<>(10);

    static {
        Contact contact = new Contact("Hello", "World");
        contacts.add(contact);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getContacts() {
        return Response.ok(contacts).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postContact(Contact contact) {
        contacts.add(contact);
        return Response.ok(contacts).build();
    }
}
