/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prova_continuada;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author castr
 */
public class Numero {
    Double numeroMemoria = ThreadLocalRandom.current().nextDouble(0, 7.9); //GB
    Integer numeroDisco = ThreadLocalRandom.current().nextInt(0, 100); //%
    Double numeroCpu = ThreadLocalRandom.current().nextDouble(250, 390); //GHz
}
