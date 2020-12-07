package org.step.entity;

public class Entity {

    public static final String CONSTANT = "CONSTANT";

    // public, private, protected, default

    private void show() {
        System.out.println("Only inside the class");
    }

    public void makeShowPublic() {
        show();
    }

    void defaultShow() {
        System.out.println("Show by default");
    }

    // Видно наследникам и классам в том же пакете
    protected void protectedShow() {

    }
}
