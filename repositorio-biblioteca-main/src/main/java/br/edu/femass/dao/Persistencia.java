package br.edu.femass.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;


public class Persistencia<T> {
    protected ObjectMapper getObjectMapper(){
        ObjectMapper objectMapper = JsonMapper.builder().addModule(new JavaTimeModule()).build().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper;
    }
}
