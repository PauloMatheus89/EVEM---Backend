package com.evembackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Inicializar e configurar automaticamente toda a aplicação Spring Boot
//Aqui começa minha aplicação Spring — configura tudo automaticamente.
@SpringBootApplication
public class EvemBackendApplication {
    public static void main(String[] args) {
        //Inicia toda a aplicação Spring
        SpringApplication.run(EvemBackendApplication.class, args);
    }
}

// SpringApplication
// Classe responsável por bootar o Spring

// .run
// Método que inicia a aplicação

//EvemBackendApplication.class
/*
Diz ao Spring:

“Comece por essa classe”

Isso é importante porque:

define o ponto de entrada
define o pacote base para scan
*/

//args
//Argumentos da linha de comando