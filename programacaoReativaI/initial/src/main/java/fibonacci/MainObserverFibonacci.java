package imd.ufrn.br;

import java.util.Observer;
import java.util.Subject;

public class MainObserverFibonacci {
	public static void main(String[] args) {
		Subject<String> subject = new ConcreteSubject();
		Observer<String> observerAlpha = new ConcreteOserverA();
		Observer<String> observerBeta = new ConcreteOserverB();
		Fibonacci fibo = new Fibonacci();

		subject.registerObserver(observerAlpha);
		subject.registerObserver(observerBeta);

		for(int ii=0; ii<50; ii++){
			subject.notifyObservers("Fibonacci("+i+")"+fibo.fibo(i));
		}

	}
}
