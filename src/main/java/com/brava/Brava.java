package com.brava;

import com.brava.resources.ContactResource;
import com.brava.resources.TodoResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class Brava extends Application<BravaConfiguration> {

    public static void main(String[] args) throws Exception{
        new Brava().run(args);
    }

    @Override
    public void initialize(Bootstrap<BravaConfiguration> bootstrap) {
        super.initialize(bootstrap);
    }

    @Override
    public void run(BravaConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(ContactResource.class);
        environment.jersey().register(TodoResource.class);
    }
}
