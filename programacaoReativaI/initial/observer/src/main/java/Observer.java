package main.java;

public interface Observer<T>{
    void observe(T event);
}