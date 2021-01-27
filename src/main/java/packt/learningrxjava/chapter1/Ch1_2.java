package packt.learningrxjava.chapter1;

import io.reactivex.rxjava3.core.Observable;

public class Ch1_2 {
    public static void main(String[] args) {
        Observable<String> myStrings = Observable.just("Alpha", "Beta", "Gamma");
        myStrings.map(str -> str.length()).subscribe(System.out::println);
    }
}
