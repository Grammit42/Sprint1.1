package com.company;
import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<SimpleDotCom> dotComList= new ArrayList<SimpleDotCom>();
    private int numOfGuesses=0;

    private void setUpGame(){
        SimpleDotCom one= new SimpleDotCom();
        SimpleDotCom two= new SimpleDotCom();
        SimpleDotCom three= new SimpleDotCom();
        one.setName("Jut.su");
        two.setName("NarutoWatch.com");
        three.setName("OnePiece.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Ваша цель - посмотреть все аниме на сайтах.");
        System.out.println("Для этого вам необходимо зайти на каждый сайт 3 раза.");
        System.out.println("Блич на jut.su, Наруто на NarutoWatch.com, а так же всемилюбимый Ван пис на One.Piece");
        System.out.println("Постарайтесь посмотреть все аниме за наименьшее количество попыток входа на различные сайты.");

        for(SimpleDotCom dotComToSet : dotComList){
            ArrayList<String> newLocation = helper.placeDotCom();
        dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying(){
    while(!dotComList.isEmpty()){
        String userGuess= helper.getUserInput("Сделайте ход");
        checkUserGuess(userGuess);
        }
    }

    public void checkUserGuess(String userGuess){
    //Выясняем, было ли попадание в один  из наших сайтов(или потопление)
        numOfGuesses++;
        String result= "Мимо";
        for(SimpleDotCom dotComToTest: dotComList){
        result= dotComToTest.checkYouSelf(userGuess);
        if(result.equals("Попал")){
            break;
        }
    if(result.equals("Потопил")){
        dotComList.remove(dotComToTest);
        break;
    }
        }

    }
    public void finishGame(){

    }

}
