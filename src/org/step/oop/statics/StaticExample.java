package org.step.oop.statics;

public class StaticExample {

    public static void main(String[] args) {
        User user = new User(4);
        User second = new User(4);

        System.out.println(user.equals(second));
        System.out.println(user.hashCode());
        System.out.println(second.hashCode());

        some(user);

        boolean idValid = IdValidator.isIdValid(user.getUserId());

        System.out.println(idValid);

        System.out.println(Constants.STR_CONSTANT);

        System.out.println(Constants.changeable);

        Constants.changeable = "new change";

        System.out.println(Constants.changeable);
    }

    public static void some(Object o) {

    }
}
