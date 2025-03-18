import java.util.HashMap;

public class FruitIntoBuckets {
    public static void main(String[] args) {
        int[] fruit = InputUtils.readNumbers();
        FruitIntoBuckets fib = new FruitIntoBuckets();
        int [] test = new int[] {1,2,3,2,2}; //4
        System.out.println(fib.totalFruit(test));
    }

    public int totalFruit(int[] fruits) {
        int begin = 0;
        int result = 0;
        HashMap<Integer, Integer> windowState = new HashMap<>();
        for (int end = 0; end < fruits.length; end++) {
            windowState.put(fruits[end], windowState.getOrDefault(fruits[end], 0) + 1);
            while (windowState.size() > 2) {
                int fruitAtBegin = fruits[begin];
                windowState.put(fruitAtBegin, windowState.get(fruitAtBegin) - 1);
                if (windowState.get(fruitAtBegin) == 0) {
                    windowState.remove(fruitAtBegin);
                }
                begin++;
            }
            result = Math.max(result, end - begin + 1);
        }
        return result;
    }

}
