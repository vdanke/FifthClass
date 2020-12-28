package org.step.java.eight.stream.api.functional.interfaces.main;

import java.util.function.Supplier;

public class SupplierImpl implements Supplier<String> {

    @Override
    public String get() {
        String simpleName = this.getClass().getSimpleName();

        return String.format("Hey, I'm %s", simpleName);
    }
}
