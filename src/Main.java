import java.util.Random;

public class Main {

    public static void main(String[] args){
        task1();
        task2();
        task3();
        task4();

    }
    public static int [] generateRandomArray(){
        Random random = new java.util.Random();
        int [] arr = new int[30];
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100_000)+100_000;
        }
        return  arr;
    }



    public static void task1(){
        int [] arr = generateRandomArray();
        int sum = 0;
        for (int j:arr){
            sum+=j;
        }
        System.out.println("Суммв трат за месяц составила " + sum+  "рублей.");
        System.out.println();
    }
    public static void task2(){
        int[] costs = generateRandomArray();
        int maxCost = costs[0];
        int minCost = costs[0];
        System.out.println(costs[0] + "");
        for (int i = 1; i < costs.length; i++) {
            System.out.print(costs[i] + "");
            if (costs[i] > maxCost) {
                maxCost = costs[i];
            }
            if (costs[i] < minCost) {
                minCost = costs[i];
            }
        }
        System.out.println();
        System.out.println("Максимальная сумма затрат за день " + maxCost);
        System.out.println("Минимамальная сумма затрат за день " + minCost);
    }
    public static void task3(){
        int[] array = generateRandomArray();
        for (int i = array.length -1; i > 0; i--){
        }


        System.out.println(array[0] + " рублей, составляет средняя сумма трат.");
    }
    public static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >= 0; i--){
            System.out.println(reverseFullName[i]);
        }


    }


}