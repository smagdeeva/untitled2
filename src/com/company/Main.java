package com.company;

public class Main {

    public static void main(String[] args) {


        class Phone {
            public int number;
            public String model;
            public int weight;
            Phone iphone1= new Phone();
            Phone iphone2 = new Phone();
            Phone iphone3 = new Phone();
            public void println() {
                System.out.println(iphone1.number +" "+iphone1.model +" "+iphone1.weight);
                System.out.println(iphone2.number +" "+iphone2.model +" "+iphone2.weight);
                System.out.println(iphone3.number +" "+iphone3.model +" "+iphone3.weight);
            }
            public void receiveCall(String name) {
                System.out.println("Звонит " + name);
            }
            public void getNumber() {
                System.out.println(number);
            }
            public Phone(int a, String b, int c) {
                number = a;
                model = b;
                weight = c;
                Phone phone1 = new Phone(a,b);
            }
            public Phone(int a, String b) {
                number = a;
                model = b;
            }
            public Phone() {
            }
            public void receiveCall(String name, int num) {
                System.out.println( name + "\n" + num);
            }
            public void sendMessage(int num1, int num2) {
                System.out.println(num1 + "\n" + num2);
            }
        }
    }
}

