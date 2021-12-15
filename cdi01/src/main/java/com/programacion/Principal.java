package com.programacion;

import com.programacion.servicios.Operaciones;
import jakarta.enterprise.inject.Instance;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class Principal {
    public static void main(String[] args) {
        //Ahora ya no se busca cualquier posible componentes
        //Sino que solo los que estan anotados

        //Inicializamos el contenedor
        SeContainer container = SeContainerInitializer
                .newInstance()
                .initialize();
        //Buscamos el componente
        Instance<Operaciones> servicio = container.select(Operaciones.class);
        //Obtenemos el metodo
        Operaciones op = servicio.get();
        int resultado = op.suma(2,2);
        System.out.println("El resultado de la suma es: "+resultado);
    }
}
