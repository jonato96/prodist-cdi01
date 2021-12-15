package com.programacion.servicios;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OperacionesImpl implements Operaciones{
    public int suma(int x, int y) {
        return x+y;
    }
}
