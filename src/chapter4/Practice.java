package chapter4;

public class Practice {
    public static void main(String[] args) {
        // 1
        //1.1
        int x = 0;
        if(x > 10 && x < 20) System.out.println(true);
        //1.2
        char ch = 'a';
        if(ch != ' ' || ch != '\t') System.out.println(true);
        //1.3
        if(ch == 'x' || ch == 'X') System.out.println(true);
        //1.4
        if(ch >= '0' && ch <= '9') System.out.println(true);
        //1.5
        if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) System.out.println(true);
        //1.6
        int year = 4;
        if((year % 400 == 0 || year % 4 ==0) && year % 100 != 0) System.out.println(true);

        boolean powerOn = true;
        if(powerOn == false) System.out.println(true);
        String str = "NO";
        if(str.equals("yes")) System.out.println(true);

        //2
        int sum = 0;
        for(int i = 1; i<= 20; i++){
            if(i % 2 == 0 || i % 3 == 0)
                continue;
            sum += i;
        }
        System.out.println(sum);

        //3
        sum = 0;
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= i; j++){
                sum += j;
            }
        }
        System.out.println(sum);

        //4
        int num = 1;
        sum = 0;
        while(sum < 100){
            if(num % 2 == 0)
                sum += -num;
            else sum += num;
            num++;
        }
        System.out.printf("%d까지 더해야함%n", num);

        //5
        int i = 0;
        while(i <= 10){
            int j = 0;
            while(j <= i){
                System.out.print("*");
                ++j;
            }
            System.out.println();
            ++i;
        }

        //6
        int cnt = 0;
        for(int i1 = 1; i1<= 6; i1++){
            for(int j = 1; j<= 6; j++){
                if(i1 + j == 6)
                    cnt++;
            }
        }
        System.out.printf("경우의수 : %d%n", cnt);

        //7
        int value = (int)(Math.random() * 6) + 1;
        System.out.println(value);

        //8
        for(int iz = 0; iz <= 5; iz++){
            for(int j = 0; j <= 2; j++){
                if(iz * 2 + j * 4 == 10)
                    System.out.printf("x=%d, y=%d%n", iz, j);
            }
        }
        //9
        String str1 = "12345";
        int sum1 = 0;
        for(int i1=0; i1 < str1.length(); i1++) {
            sum1 += (str1.charAt(i1) - 48);
        }
        System.out.println("sum1="+sum1);
        //10
        int num2 = 12345;
        int sum2 = 0;

        while(num2 != 0){
            sum2 += (num2 % 10);
            num2 /= 10;
        }

        System.out.println("sum="+sum2);

        //11
        int num11 = 1;
        int num22 = 1;
        int num33 = 0; // 세번째 값
        System.out.print(num11+","+num22);
        for (int i1 = 0 ; i1 < 8 ; i1++ ) {
            num33 = num11 + num22;
            System.out.print(","+num33);
            num11 = num22;
            num22 = num33;
        }

        //12
        for(int h = 2; h <= 9; h++){
            for(int z = 1; z <= 3; z++){
                System.out.printf("%d*%d=%d%n", h, z, h * z);
            }
            System.out.println();
        }

        //13
        String value1 = "12o34";
        char ch1 = ' ';
        boolean isNumber = true;

        for(int i1=0; i1 < value1.length() ;i1++) {
            char checkChar = value1.charAt(i1);
            if(!(checkChar>= '0' && checkChar <= '9')) {
                isNumber = false;
                break;
            }
        }
        if (isNumber) {
            System.out.println(value1+" 는 숫자입니다.");
        } else {
            System.out.println(value1+" 는 숫자가 아닙니다.");
        }

        //14
//        int answer = (int)(Math.random() * 100) + 1;
//        int input = 0; // 사용자입력을 저장할 공간
//        int count = 0; // 시도횟수를 세기위한 변수
//
//        java.util.Scanner s = new java.util.Scanner(System.in);
//        do {
//            count++;
//            System.out.print("1 100과 사이의 값을 입력하세요 :");
//            input = s.nextInt(); // input . 입력받은 값을 변수 에 저장한다
//
//            if(input > answer){
//                System.out.println("더 작은 수를 입력하세요");
//            }else if(input < answer) System.out.println("더 큰수를 입력하세요");
//            else{
//                System.out.println("맞췄습니다.");
//                System.out.printf("시도횟수는 %d번 입니다.%n", count);
//                break;
//            }
//
//        } while(true); // 무한반복문
        //15
        int number = 12321;
        int tmp = number;
        int result =0; // number 변수 를 거꾸로 변환해서 담을 변수

        int cnt1 = (int)(Math.log10(number)+1) - 1;
        while(tmp !=0) {
            result += Math.pow(10, cnt1) * (tmp % 10);
            tmp /= 10;
            cnt1--;
        }

        if(number == result)
            System.out.println( number + "는 회문수 입니다.");
        else
            System.out.println( number + "는 회문수가 아닙니다 .");
    }
}
