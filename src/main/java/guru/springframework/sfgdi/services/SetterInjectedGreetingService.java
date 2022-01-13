package guru.springframework.sfgdi.services;

public class SetterInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreetin() {
        return "Hello World - Setter";
    }
}
