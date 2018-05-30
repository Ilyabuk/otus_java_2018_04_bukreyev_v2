package ru.otus;

@Service(name = "MySuperLazyService")
public class LazyService {

    @Init
    public void lazyInit() throws Exception {
        System.out.println("I'm lazy");
    }
}
