package calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요");
        input=sc.next();
        String input2=input.replace(":",",");
        String[] splitname=input2.split(",");
        int sum=0;
        for(int i=0;i<splitname.length;i++){
            sum+=Integer.parseInt(splitname[i]);
        }
        System.out.println(sum);
    }
}
