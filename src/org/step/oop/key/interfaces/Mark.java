package org.step.oop.key.interfaces;

public class Mark<T extends Number> {

    private int mark;

    public Mark(int mark) {
        this.mark = mark;
    }

    public int calculateNumber(Mark<T> second) {
        return this.getMark() + second.getMark();
    }

    public int calculateWildcardNumber(Mark<?> second) {
        return this.getMark() + second.getMark();
    }

    public int getMark() {
        return mark;
    }
}
