package guru.springframework.sfgdi.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedGreetingServiceTest {

    SetterInjectedGreetingService setterInjectedGreetingService;

    @BeforeEach
    void setUp() {
        setterInjectedGreetingService = new SetterInjectedGreetingService();
    }

    @Test
    void sayGreeting() {
        assertEquals(setterInjectedGreetingService.sayGreeting(), "Hello World - Setter");
    }
}