package packt.learningrxjava.chapter1;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class Ch1_3 {
    public static void main(String[] args) {
        Observable<Long> secondInterval = Observable.interval(2, TimeUnit.SECONDS);
        secondInterval.subscribe(System.out::println);
        sleep(10000);
    }

    public static void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
