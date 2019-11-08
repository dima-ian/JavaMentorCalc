package org.dmz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] toCalc;
        String line;
        System.out.println("Введите арифметическую операцию в формате: Ч операция Ч - [10 + 10] или [X * X] (10 или X - макс.; E - выход)");
        line = br.readLine();
        if(line.toLowerCase().equals("e")) {System.exit(0);}

        do {
            try
            {
                toCalc = TestParams.testParams(line);
                if (TestParams.getArabDigits().contains(toCalc[0]))
                {
                    int resAr = ArabCalc.doCalc(Integer.parseInt(toCalc[0]), Integer.parseInt(toCalc[2]), toCalc[1].charAt(0));
                    System.out.println("Вычисление арабских цифр, результат = " + resAr +".");
                }
                else
                {
                    String resRm = RomeCalc.doCalc(toCalc[0], toCalc[2], toCalc[1].charAt(0));
                    System.out.println("Вычисление римских цифр, результат = " + resRm +".");
                }
            }
            catch (IllegalArgumentException iae)
            {
                System.out.println(iae.toString()); System.exit(0);
            }
            System.out.println("Введите арифметическую операцию в формате: Ч операция Ч - [10 + 10] или [X + X] (10 или X - макс.; E - выход)");
            line = br.readLine();
        } while (!line.toLowerCase().equals("e"));
    }
}
