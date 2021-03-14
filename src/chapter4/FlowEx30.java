package chapter4;

public class FlowEx30 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (true){
            if(sum > 100)
                break;
            ++i;
            sum += i;

        }
        System.out.println("i= " + i);
        System.out.println("sum= " + sum);
        System.out.println();

        for(int i1 = 0; i1 <= 10; i1++){
            if(i1 % 3  == 0)
                continue;
            System.out.println(i1);
        }
    }
}
