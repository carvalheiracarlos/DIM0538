package main.java;

import java.util.Arrays;
import java.util.concurrent.SubmissionPublisher;

public class MainFibonacci{
	public static void main(String[] args) throws InterruptedException {
		SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
		MyFilterProcessor<String, String> filterProcessor = new MyFilterProcessor<>(s -> !s.equals("x"));
		MyTransformProcessor<String, Integer> transformProcessor =
				new MyTransformProcessor<>(s -> Integer.parseInt(s) + 5);
		MySubscribe<Integer> subscriber = new MySubscribe<>();
		FibonacciCallable fibo = new FibonacciCallable(50);

		publisher.subscribe(filterProcessor);
		filterProcessor.subscribe(transformProcessor);
		transformProcessor.subscribe(subscriber);
		System.out.println("Publishing itens");
		Arrays.asList(fibo.call()).stream().forEach(i -> publisher.submit(i.toString()));
		publisher.close();
		Thread.sleep(2000);
	}

}
