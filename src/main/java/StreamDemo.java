import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamDemo {
    public long findAnyMethod(List<Integer>list) {

        long count = list.stream().sorted().filter(i -> i > 35).map(i -> i * 10).count();
        return count;
    }

}
