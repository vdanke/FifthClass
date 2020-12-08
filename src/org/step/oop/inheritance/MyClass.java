package org.step.oop.inheritance;

public abstract class MyClass {

    private String some;

    public MyClass(String some) {
        this.some = some;
    }

    public String getSome() {
        return some;
    }

    public MyClass getNewInstance() {
        return new MyClass("some") {
            @Override
            public String getSome() {
                return super.getSome();
            }

            @Override
            public MyClass getNewInstance() {
                return super.getNewInstance();
            }
        };
    }
}
