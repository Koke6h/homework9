public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i=0;i<arr.length;i++) {
            arr[i]= random.nextInt(100000)+ 100000;
        }
        return arr;
    }
    public static void task1(){
        int[] arr = generateRandomArray();
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");
    }
    public static void task2(){
        int [] arr = generateRandomArray();
        int minMax = 100000;
        for (int i = 0; i < arr.length; i++) {
           if (minMax<arr[i]){
               minMax=arr[i];
           }
        }
        System.out.println("Максимальная сумма трат за день составила"+minMax+" рублей");
        for (int i = 0; i < arr.length; i++) {
            if (minMax>arr[i]){
                minMax=arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+minMax+" рублей");
    }
    public static void task3(){
        int[] arr = generateRandomArray();
        double sum = 0;
        double avgSum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        avgSum=sum/arr.length;
        System.out.println("Средняя сумма трат за месяц составила "+avgSum+" рублей");
    }
    public static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i>=0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}