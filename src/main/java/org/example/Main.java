package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi;
        System.out.println("Sayı giriniz:");
        sayi= input.nextInt();
       int donguSayısı=0;
        for(int i=1; i<sayi; i++)
        {
            if(sayi%i==0)
            {
                 donguSayısı++;
                 //Eğer donguSayısı 2 veya daha fazla çıkarsa ise sayı asal olmamış oluyor.
                //System.out.println(i);
            }

        }
        if(donguSayısı>=2) {
            System.out.println("Girdiğiniz " + sayi + " sayısı bir asal sayı değildir..");
        }
        else
        {
            System.out.println("Girdiğiniz "+sayi+" sayısı bir asal sayıdır.");
        }
        }
}