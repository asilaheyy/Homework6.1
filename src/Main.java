public class Main {
    public static void main(String[] args) {
        //ДЗ 1
        // 1.
        for (int i=1; i <= 10; i++){
            System.out.println(i);
        }
        // 2.
        for (int i =10; i>= 1; i--){
            System.out.println(i);
        }

        // 3.
        for (int i = 0; i<=17; i =i+2){
            System.out.println(i);
        }
        // 4.
        for (int i = 10; i>= -10; i--){
            System.out.println(i);
        }


        //ДЗ 2
        // 1.
        for (int i = 1904; i<=2096; i =i+4){
            System.out.println("Год "+ i+" високосный");
        }
        // 2.
        for (int i =7; i<=98; i =i+7){
            System.out.println(i);
        }
        //3.
        System.out.println("1");
        for (int i =2; i<=512; i =i*2){
            System.out.println(i);
        }
        //ДЗ 3
        int savings = 29000;
        int total =0;
        for( int i =0; i<12; i++){
            total = total+ total/100;
            total =total+savings;
            System.out.println("Месяц " +i + " ,итого " +total+" руб.");
        } System.out.println(total);


    }
}