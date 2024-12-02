package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce<Egg> {
private int chickenId;
//private boolean hasBeenFertilized;

//* `Eater` can `eat` an `Edible` object.
//	* `NoiseMaker` can `makeNoise`
//            * `Animal` is a `NoiseMaker` and `Eater`
//* `Chicken` is an `Animal` and a `Produce` which `yield` an
// `EdibleEgg` if `hasBeenFertilized` flag is `false`.


    public Chicken(int chickenId) {
        this.chickenId = chickenId;
    }

    public Chicken() {
    }

    @Override
    public boolean eat(Edible edible) {
        return false;
    }

    @Override
    public String makeNoise() {
        return "Cluck!";
    }

    public int getChickenId() {
        return chickenId;
    }

    @Override
    public Egg yield() {
       return null;
    }

    //@Override
    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }

    @Override
    public void fertilize() {

    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }
}
