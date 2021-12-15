package com.programacion.servicios;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class OperacionesImpl implements Operaciones{
    @Inject
    private Log log;
    public int suma(int x, int y) {
        log.log("Inicializando operacion");
        return x+y;
    }
}
