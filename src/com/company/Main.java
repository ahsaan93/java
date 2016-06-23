package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // initializations
        int a[][] = new int[3][3];
        int locrow = 0;
        int loccol = 0;
        int p1 = 1;
        int p2 = 2;
        int x = 0;
        int player = 1;
        Scanner scan = new Scanner(System.in);

        System.out.println("---" + a[0][0] + "---|---" + a[0][1] + "---|---" + a[0][2] + "---");
        System.out.println("---" + a[1][0] + "---|---" + a[1][1] + "---|---" + a[1][2] + "---");
        System.out.println("---" + a[2][0] + "---|---" + a[2][1] + "---|---" + a[2][2] + "---");
        System.out.println("\n");



        for (int c = 0; c < a.length; c++) {


            for (int d = 0; d < c; d++) {


                switch (player) {
                    case 1:
                        System.out.print("Player 1 enter your number of row = ");
                        locrow = scan.nextInt();
                        locrow = locrow - 1;
                        System.out.print("Player 1 enter your number of column = ");
                        loccol = scan.nextInt();
                        loccol = loccol - 1;
                        for (int i = 0; i < 20; i++) {
                            if (a[locrow][loccol] != 0) {

                                System.out.print("Space not available, kindly re-enter player 1 enter your number of row = ");
                                locrow = scan.nextInt();
                                locrow = locrow - 1;
                                System.out.print("Space not available, kindly re-enter player 1 enter your number of column = ");
                                loccol = scan.nextInt();
                                loccol = loccol - 1;
                            } else {
                                a[locrow][loccol] = 1;
                                break;
                            }
                        }

                        System.out.println("---" + a[0][0] + "---|---" + a[0][1] + "---|---" + a[0][2] + "---");
                        System.out.println("---" + a[1][0] + "---|---" + a[1][1] + "---|---" + a[1][2] + "---");
                        System.out.println("---" + a[2][0] + "---|---" + a[2][1] + "---|---" + a[2][2] + "---");
                        System.out.println("\n");
                        player = 2;

                    case 2:
                        System.out.print("\n");
                        System.out.print("Player 2 enter your number of row = ");
                        locrow = scan.nextInt();
                        locrow = locrow - 1;
                        System.out.print("Player 2 enter your number of column = ");
                        loccol = scan.nextInt();
                        loccol = loccol - 1;

                        for (int i = 0; i < 20; i++) {
                            if (a[locrow][loccol] != 0) {

                                System.out.print("Space not available, kindly re-enter player 2 enter your number of row = ");
                                locrow = scan.nextInt();
                                locrow = locrow - 1;
                                System.out.print("Space not available, kindly re-enter player 2 enter your number of column = ");
                                loccol = scan.nextInt();
                                loccol = loccol - 1;
                            } else {
                                a[locrow][loccol] = 2;
                                break;
                            }
                        }

                        System.out.println("---" + a[0][0] + "---|---" + a[0][1] + "---|---" + a[0][2] + "---");
                        System.out.println("---" + a[1][0] + "---|---" + a[1][1] + "---|---" + a[1][2] + "---");
                        System.out.println("---" + a[2][0] + "---|---" + a[2][1] + "---|---" + a[2][2] + "---");
                        System.out.println("\n");
                        player = 1;


                }
            }
        }
    }
}
