package org.step.oop.inheritance;

public class SecondClass extends MyClass implements MyAPI {
    public SecondClass(String some) {
        super(some);
    }

    @Override
    public String[] findAll() {
        return new String[0];
    }

    @Override
    public String findById() {
        return null;
    }

    @Override
    public void save(String str) {

    }

    @Override
    public void delete(String str) {

    }

    @Override
    public String getSome() {
        return super.getSome();
    }

    @Override
    public MyClass getNewInstance() {
        return super.getNewInstance();
    }
}
