import java.util.ArrayList;

public class SumEven {
    public static int main(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int i : arrayList) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;

    }
}
