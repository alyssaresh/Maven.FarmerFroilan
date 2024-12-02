package com.zipcodewilmington.froilansfarm;

public class Crop<T extends Edible> implements Produce<T>{
private T edible;

    public Crop(T edible) {
        this.edible = edible;
    }

    public Crop() {
    }

//    public boolean hasBeenFertilized() {
//        return hasBeenFertilized;
//    }

    @Override
    public T yield() {
        if (!hasBeenFertilized) {
            return null;
        } return edible;
    }


//    public boolean hasBeenHarvested() {
//        return harvested;
//    }
}
