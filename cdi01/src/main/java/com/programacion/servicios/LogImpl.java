package com.programacion.servicios;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LogImpl implements Log{
    public void log(String msg) {
        System.out.println("Log: "+msg);
    }
}
