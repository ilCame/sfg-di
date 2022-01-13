package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service // ora spring sa che deve portare una istanza di questo oggetto nel suo contesto
public class GreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreetin() {
        return "Hello World";
    }
}
