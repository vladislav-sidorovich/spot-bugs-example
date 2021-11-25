package org.example;

public class Runner {
    public static void main(String[] args) {
        Service service = new Service();

        System.out.println(service.stringProcessing(null));

        try {
            service.doSomething();
        } catch (MyException e) {
            throw new RuntimeException();
        }
    }
}
