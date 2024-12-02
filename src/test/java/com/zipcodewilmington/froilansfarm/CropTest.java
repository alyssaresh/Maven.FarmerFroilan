package com.zipcodewilmington.froilansfarm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CropTest {


    @Test
    public void testFertilization() {
        Tomato tomato = new Tomato();
        TomatoPlant tomatoPlant = new TomatoPlant();
        Produce<Tomato> crop = new Crop<>(tomato);
        assertFalse(TomatoPlant.hasBeenFertilized);
        CropDuster.fertilize(tomatoPlant);
        assertTrue(TomatoPlant.hasBeenFertilized);
    }


    @Test
    public void testYieldAfterFertilization() {
        Tomato tomato = new Tomato();
        TomatoPlant tomatoPlant = new TomatoPlant();
        Produce<Tomato> crop = new Crop<>(tomato);
        CropDuster.fertilize(tomatoPlant);
        Edible item = tomatoPlant.yield();
        assertNotNull(item, "The crop should yield an edible item after fertilization.");
    }

    @Test
    public void testHarvest() {
        EarCorn corn = new EarCorn();
        Produce<EarCorn> cornStalk = new Crop<>(corn);
        CropDuster.fertilize(cornStalk);
        tractor.harvest(cornStalk);
        assertTrue(cornStalk.hasBeenHarvested, "The Cornstalk has been harvested.");
    }

    @Test
    public void testIsProduce() {
        Tomato tomato = new Tomato();
        Crop<Tomato> tomatoPlant = new Crop<>(tomato);
        assertTrue(tomatoPlant instanceof Produce, "Crop should implement Produce interface.");
    }
}
