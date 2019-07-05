package com.brava.resources;

import com.brava.api.Todo;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Path("/todos")
public class TodoResource {
    private static final List<Todo> todos = new ArrayList<>(10);

    static {
        Todo todo = new Todo("4th Plans", "Make pland for the 4th of July", new Date());
        todos.add(todo);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTodos() {
        return Response.ok(todos).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postTodo(Todo todo) {
        todos.add(todo);
        return Response.ok(todos).build();
    }
}
