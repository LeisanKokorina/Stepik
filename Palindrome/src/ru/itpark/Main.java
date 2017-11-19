package ru.itpark;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }
    public static boolean isPalindrome(String text){
//        text.replaceAll("[^a-zA-Z0-9]", "");
//        StringBuilder stringBuilder = new StringBuilder(text);
//        stringBuilder.reverse();
//        String reverseText = stringBuilder.reverse().toString();

        return text.replaceAll("\\W","")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W",""))
                        .reverse().toString());
    }
}
