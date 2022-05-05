package com.alberto.datastructures;

public class CustomQueue {
    private static final int CAPACIDAD_INICIAL = 5;
    public int length = 0;
    private  CustomCollection collection = new CustomCollection(CAPACIDAD_INICIAL);

    public void enqueue(Float element) {

        collection.add(element);
        length++;
    }

    public Float dequeue() {
        return (Float)collection.delete(0);
    }

}
