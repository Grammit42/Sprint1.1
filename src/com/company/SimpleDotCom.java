package com.company;
import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<String> locationCells; //Динамический массив для хранения адреса ячейки
    private String name;
    //private int numOfHits = 0;//Хранение кол-ва попаданий

    public String checkYouSelf(String userInput) {
        //int userGuess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                return "Потопил";
            } else {
                return "Попал";
            }
        }

        System.out.println(result);
        return result;
    }
    public void setLocationCells(ArrayList<String> loc) {
        locationCells= loc;
    }
}

