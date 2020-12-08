package org.step.oop.key.interfaces;

public interface Repository<T extends Person> {

    T[] findAll();

    T findById();

    void save(T t);

    void delete(T t);

    static <Z extends Number> int logic(Z first, Z second) {
        return first.intValue() + second.intValue();
    }

    default <Z extends Number> long powAge(Z first, Z second) {
        return first.longValue() * second.longValue();
    }
}
