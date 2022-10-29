
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] mas = {6, 8, 10, 3, 7};

        boolean Sorting = false;
        int num;
        while (!Sorting) {
            Sorting = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    Sorting = false;

                    num = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = num;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}