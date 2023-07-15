package com.company;

public class Main {
    public static void main(String[] args){

        /*
    int[] MyArray1= new int[15];
    int con= 0;

        for (int i = 0; i < MyArray1.length; i++) {
            MyArray1[i]=(int)(Math.random()*(100+1)) ;
        }
        for (int i = 0; i <MyArray1.length; i++) {
            System.out.print(MyArray1[i]+" ");
        }

        for (int i = 0; i < MyArray1.length; i++) {
            if(MyArray1[i]>MyArray1[i+1])

            for (int j = 0; j < MyArray1.length; j++) {

            }
        }

        for (int i = 0; i <MyArray1.length; i++) {
            System.out.println(MyArray1[i]);
        }
        */

        /*  int BeerNum= 99;
        String word= "бутылок (бутылки)";

        while(BeerNum >0 ){
            if (BeerNum==1 ){
                word = "Бутылка";
            }
            System.out.println(BeerNum + " "+ word + " пива на стене");
            System.out.println(BeerNum+ " "+ word+ " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            BeerNum= BeerNum- 1;
            if (BeerNum>0){
                if (BeerNum==1 ){
                    word = "Бутылка";
                }
                System.out.println(BeerNum+ " "+ word+ " пива на стене");
            }
            else {
                System.out.println("Нет бутылок пива на стене");
            }

        }
        */
/*
    String [] wordListOne= {"круглосуточный","трех-звездный","30000-футовый",
            "взаимный","обоюдный выигрыш","фронтенд",
            "на основе веб-технологий", "проникающий", "умный",
            "шесть сигм", "метод критичекого пути ", "динамичный"};

    String [] wordListTwo= {"уполномоченный ","трудный","чистый продукт",
            "ориентированный","центральный","распределенный","кластеризированный","фирменный",
            "нестандартный ум","позиционированный","сетевой","сфокусированный","использованный с выгодой",
            "выровненный","нацеленный на","общий","совместный","ускоренный"};

    String [] wordListThree= {"процесс","пункт разгрузки","выход из положение",
    "тип структуры","талант","подход","уровень завоеванного внимания",
            "портал","период времени","обзор","образец","пункт следования"};

    int oneLenght= wordListOne.length;
    int twoLenght= wordListTwo.length;
    int threeLenght= wordListThree.length;

    int rand1= (int) (Math.random()* oneLenght);
    int rand2= (int) (Math.random()* twoLenght);
    int rand3= (int) (Math.random()* threeLenght);

    String phrase= wordListOne[rand1]+ " "+wordListTwo[rand2]+" "+wordListThree[rand3];

        System.out.println("Всё, что нужно, - это " + phrase);
*/
/*        int x=3;
        while (x > 0){
            if (x>2){
                System.out.print("a");
            }
            x=x-1;
            System.out.print("-");
            if(x==2){
                System.out.print("b c");
            }
            x=x-1;
            System.out.print("-");
            if(x==1){
                System.out.print("d");
                x-=1;
            }

        }


        */
        /*
int x =0;
int y= 0 ;
while( x<5 ){

if (y<5){
    x+=1;
    if (y<3){
        x-=1;
    }
}
y=y+2;

    System.out.print(x+""+y+ " ");
    x+=1;
    */
/*

int x=0;
while(x<4){
    System.out.print("a");
    if (x<1) {
        System.out.print(" ");
    }
    System.out.print("n");

    if (x>1){
        System.out.print("oyster");
    x=x+2;
    }
    if (x==1) {
        System.out.print("noys ");
    }
    if (x<1){
        System.out.print("oise ");
    }
    System.out.println("");
  x=x+1;
  }
*/

        class Dog {
            int size;
            String breed;
            String name;
            void bark() {
                System.out.println("Гав! Гав!");
            }
        }

        Dog d = new Dog();
        d.size =40;
        d.bark();
    }
}











