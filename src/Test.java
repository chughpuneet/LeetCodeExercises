import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        int[] a = {5,6,7,8};

        List<Integer> list = IntStream.of(a).parallel().boxed().collect(Collectors.toList());
        java.util.concurrent.atomic.AtomicInteger i = new java.util.concurrent.atomic.AtomicInteger(0);

        Map<Integer,Integer> x = IntStream.of(a).boxed().collect(Collectors.toMap(t-> list.indexOf(t), t->t));
        x.keySet().forEach(t-> {
            System.out.println(t + " - " + x.get(t));
        });


                //collect(Collectors.toMap(i.getAndIncrement(),Integer :: intValue));
    }
}
