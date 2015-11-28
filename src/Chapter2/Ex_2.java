package Chapter2;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Created by WangJun on 2015/11/28.
 */
public class Ex_2 {

    public static void main(String[] args) {
        ThreadLocal<SimpleDateFormat> sdf = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));
//        Comparator.comparing()
        Stream.of(1, 2, 3).reduce()
    }


}
