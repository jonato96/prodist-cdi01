package com.programacion.servicios;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class OperacionesImpl implements Operaciones{
    @Inject
    private Log log;

    public OperacionesImpl(){
        System.out.println("Estoy en el constructor");
    }

    @PostConstruct
    void init(){
        System.out.println("Ciclo de vida @PostConstruc");
    }
    @PreDestroy
    void destroy(){
        System.out.println("Ciclo de vida @PreDestroy");
    }

    public int suma(int x, int y) {
        log.log("Inicializando operacion");
        return x+y;
    }
}
