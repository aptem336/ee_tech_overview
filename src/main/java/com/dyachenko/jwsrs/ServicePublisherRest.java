package com.dyachenko.jwsrs;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.net.URI;

public class ServicePublisherRest {
    public static void main(String[] args) {
        JdkHttpServerFactory.createHttpServer(URI.create("http://localhost:8080/rest/"),
                new ResourceConfig().register(TransactionServiceRest.class).register(JacksonFeature.class));
    }
}
