/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */

public class Program {

    public static void main(String[] args) {

        menu();
    }

    private static void menu() {
        int chon = 6;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("====  =====");
            System.out.println("1.Khoi tao danh sach cau thu");
            System.out.println("2.Them moi cau thu");
            System.out.println("3.Xuat thong tin cau thu");
            System.out.println("4.Tim cau thu co luong cao nhat");
            System.out.println("5.Xap sep danh sach cau thu");
            System.out.println("----------------------------");
            System.out.print("6.Tinh luong(1->6):");
            chon = input.nextInt();
            switch (chon) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Goodbye. See you again");
                    break;
            }
        } while (chon != 6);
    }

}
