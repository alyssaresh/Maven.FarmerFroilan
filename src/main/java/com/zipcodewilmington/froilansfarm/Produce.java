package com.zipcodewilmington.froilansfarm;

public interface Produce<T extends Edible> {
    T yield();
    //would make this abstracted property, if able
    boolean hasBeenFertilized = false;
}
