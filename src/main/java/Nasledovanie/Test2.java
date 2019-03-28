package Nasledovanie;

public class Test2  {
    public static void main(String[] args) {
        Test4 vova = new Test4();
        vova.say("Vitaliy");
        System.out.println(vova.name + "is height is " + vova.height);
        Test3 roy = new Test3(78 , "Sasha", 4);
        roy.tell();
    }
}
