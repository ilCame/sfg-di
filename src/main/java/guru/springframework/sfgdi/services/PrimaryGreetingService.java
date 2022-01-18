package guru.springframework.sfgdi.services;

//avendolo aggiunto a greatingservicecinfig posso togliere entrambe le annotazioni
//@Primary
//@Service
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - from the prymary bean";
    }
}
