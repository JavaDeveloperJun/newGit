package Polemorfism;

public class Operator {
    public static void main(String[] args) {
        Provider[] arr = new Provider[] {new Life(), new Kievstar(), new Vodafon()};
        for (int i = 0; i < arr.length; i++)
            arr[i].call();
    }

}
