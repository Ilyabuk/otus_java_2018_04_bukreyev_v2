package ru.otus;

@Service(name = "SuperSimpleService")
public class SimpleService {

    @Init
    public void initService() {
        System.out.println("I'm simpleService");
    }

    public void shinitService() {
        System.out.println("Shinit service");
    }
}
