package org.step.oop.inheritance;

public class SimpleClass extends MyClass implements MyAPI {

    @JsonView(render = View.FullView.class)
    private int id;
    @JsonView(render = View.FullView.class)
    private String username;
    @JsonView(render = View.InternalView.class)
    private String password;

    public SimpleClass(String some) {
        super(some);
    }

    @Override
    public String[] findAll() {
        return new String[]{};
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
    public SimpleClass getNewInstance() {
        return new SimpleClass("some");
    }
}
