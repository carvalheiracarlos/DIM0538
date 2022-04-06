package imd.ufrn.br;

import java.util.concurrent.Callable;

public class FibonacciCallable implements Callable<Long>{
	private long numinit;

	FibonacciCallable(long i){
		numinit = i;
	}

	public Long call(){
		long count = 0;
		long a = 0;
		long b = 1;
		while(count < numinit -1){
			long sum = a + b;
			a = b;
			b = sum;
			count++;
		}
		System.out.println("("+ numinit + ")......:" + b );
		return b;
	}
}
