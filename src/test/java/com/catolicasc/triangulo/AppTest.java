package com.catolicasc.triangulo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Larissa Censi
 */
public class AppTest {
    

    @Test
     public void testeTrianguloEquilátero(){
         Triangulo triangulo = new Triangulo();
         String expResult = "[Válido, Equilátero]";
         Set<String> result = triangulo.verificar(5, 5, 5);
         assertEquals(expResult,result.toString());
               
    }
     
    @Test
     public void testeTrianguloIsósceles(){
         Triangulo triangulo = new Triangulo();
         String expResult = "[Válido, Isósceles]";
         Set<String> result = triangulo.verificar(7, 5, 5);
         assertEquals(expResult,result.toString());
               
    }
     
    @Test
     public void testeTrianguloEscaleno(){
         Triangulo triangulo = new Triangulo();
         String expResult = "[Escaleno, Válido]";
         Set<String> result = triangulo.verificar(4, 9, 8);
         assertEquals(expResult,result.toString());
               
    }
     
     
    @Test
     public void testeTrianguloInvalido(){
         Triangulo triangulo = new Triangulo();
         String expResult = "[Inválido]";
         Set<String> result = triangulo.verificar(7, 20, 40);
         assertEquals(expResult,result.toString());
               
    }
}