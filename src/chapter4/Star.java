package chapter4;

public class Star {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 10; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 2; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                System.out.printf("%d x %d = %d%n",i, j, i * j);
            }
        }

        for(int i = 1; i <= 3; i++){
            for(int j = 1; j<= 3; j++){
                for(int k = 1; k <=3; k++){
                    System.out.println("" + i + j + k);
                }
            }
        }

        for(int i = 0; i< 5; i++){
            for(int j = 0; j < 5; j++){
                if(i == j)
                    System.out.printf("[%d, %d]", i, j);
                else
                    System.out.printf("%5c", ' ');
            }
            System.out.println();
        }
    }
}
