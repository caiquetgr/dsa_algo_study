package br.com.caiqueborges.arrays.exercise;

public class ReverseString {
    public static String reverse(String str) {
        if (str == null) return null;
        if (str.length() < 2) return str;

        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
