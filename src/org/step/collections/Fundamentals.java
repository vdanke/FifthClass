package org.step.collections;

public class Fundamentals<T> {

    private Object[] array;

    public Fundamentals(int size) {
        this.array = new Object[size];
    }

    public static void main(String[] args) {

    }

    public void addNewElem(T t) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null && i != array.length - 1) {
                array[i] = t;
                break;
            } else {
                this.dynamicArrays();
                addNewElem(t);
            }
        }
    }

    @SuppressWarnings("unchecked")
    public T getElemByIndex(int index) {
        return (T) array[index];
    }

    private void dynamicArrays() {
        Object[] newArray = this.array;
        this.array = new Object[newArray.length * 2];
        for (int i = 0; i < newArray.length; i++) {
            this.array[i] = newArray[i];
        }
    }
}
