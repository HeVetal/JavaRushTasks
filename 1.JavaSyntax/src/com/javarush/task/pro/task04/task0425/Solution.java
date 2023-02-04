package com.javarush.task.pro.task04.task0425;

/* 
Диггер (1)
*/

public class Solution {
    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";


    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 1; i <= 10;i++){

            for (int j = 1; j <= 9;j++){

                if(j == 4 && i == 1){
                    System.out.print(robot);
                    continue;
                }
                if(i == 10){
                    System.out.print(bug);
                }
                else{
                    System.out.print(land);
                }
            }
            if(i == 10){
                System.out.print(bug);
            }else {
                System.out.println(land);
            }
        }
    }
}
