package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class CropRow<T extends Crop<Edible>> { //extends ArrayList<Crop> {
    private List<T> row = new ArrayList<>();
    private T crop;

    public CropRow(T crop) {
        this.crop = crop;
    }
//    public CropRow(){
//        super();
//    }
//    public void plant(Crop crop) {
//    this.add(crop);
//    }
//
//
//    public boolean hasCrop(Crop crop) {
//        return this.contains(crop);
//    }
//
//    public void showCrops() {
//        for (Crop crop : this){
//            System.out.println(crop);
//        }
//    }

}
