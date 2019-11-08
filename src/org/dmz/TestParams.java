package org.dmz;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class TestParams {

    private static String params[] = new String[3];
    private static Set<String> romeDigits = Set.of("I","II","III","IV","V","VI","VII","VIII","IX","X");
    private static Set<String> arabDigits = Set.of("1","2","3","4","5","6","7","8","9","10");
    private static Set<String> ops = Set.of("+","-","/","*");

    public static String [] testParams(String prmLine) {
        params = prmLine.trim().split(" ");
        if (params.length < 3 || params.length > 3) throw new IllegalArgumentException("Некорректный формат введённой арифметической операции.");
        if (romeDigits.contains(params[0]) && romeDigits.contains(params[2]) && ops.contains(params[1])) return params;
        if (arabDigits.contains(params[0]) && arabDigits.contains(params[2]) && ops.contains(params[1])) return params;
        else throw new IllegalArgumentException("Некорректный формат введённой арифметической операции.");

    }

    public static Set<String> getRomeDigits() {
        return romeDigits;
    }

    public static Set<String> getArabDigits() {
        return arabDigits;
    }
}
