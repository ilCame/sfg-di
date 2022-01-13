package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectionControllerTest {

    PropertyInjectionController controller;

    /*nel before each setto le condizioni di testing */
    @BeforeEach
    void setUp(){
        controller = new PropertyInjectionController(); //sto facendo un mock

        controller.greetingService = new GreetingServiceImpl();
    }
    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}