package com.lordnighton;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        RelationsData relations = mapper.readValue(new File("relations.json"), RelationsData.class);

        System.out.println("Family " + relations.getFamily().get(0).getId());
        System.out.println("Community " + relations.getCommunities().get(0).getOrdName());

    }

}