package org.step.oop.annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

public class AnnotationExample {

    public static Person[] findAll(PersonService personService) {
        return personService.findAllPersons();
    }

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Person person = idMakerAnnotationProcessor(Person.class, false);

        final PersonService object = createObject(PersonService.class);

        Person[] all = findAll(object);
        Person[] s = findAll(object);
        Person[] b = findAll(object);

        for (Person p : all) {
            if (p == null) {
                break;
            }
            System.out.println(p.getId());
        }
        System.out.println(person.getId());
    }

    private static Person idMakerAnnotationProcessor(Class<Person> personClass, boolean isAnnotationCreation) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Field[] declaredFields = personClass.getDeclaredFields();

        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(IdMaker.class)) {
                if (isAnnotationCreation) {
                    System.out.println("Annotation ID creation");
                    Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor();
                    Person person = declaredConstructor.newInstance();
                    field.set(person, UUID.randomUUID().toString());
                    return person;
                } else {
                    System.out.println("Constructor ID creation");
                    Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor(String.class);
                    return declaredConstructor.newInstance(UUID.randomUUID().toString());
                }
            }
        }
        return null;
    }

    public static  <T> T createObject(Class<T> tClass) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<T> declaredConstructor = tClass.getDeclaredConstructor();
        return declaredConstructor.newInstance();
    }
}
