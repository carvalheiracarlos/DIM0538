package main.java;
public class MainObserver{
    public static void main(String[] args){
        Observer<String> observerA = new ConcreteObserverA();
        System.out.println("AAAA");
    }

}
