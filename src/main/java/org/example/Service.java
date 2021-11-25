package org.example;

public class Service {
    public void doSomething() throws MyException {
        throw new MyException();
    }

    public String stringProcessing(String s) {
        return s.toLowerCase().toString();
    }
}
