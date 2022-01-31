package com.ashukulu.javacwh;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        /*String st = "  Ashu Kulu  ";
        System.out.println(st.length());
        System.out.println(st.toLowerCase());
        System.out.println(st.toUpperCase());
        System.out.println(st.trim());
        System.out.println(st.substring(3));
        System.out.println(st.substring(2,8));
        System.out.println(st.replace(' ', '_'));
        System.out.println(st.replace(" Kulu", "tosh"));
        System.out.println(st.indexOf('K'));
        System.out.println(st.indexOf("  ", 4));
        String name="Ashutosh";
        System.out.println(name.startsWith("A"));
        System.out.println(name.endsWith("o"));
        System.out.println(name.equals("ashutosh"));
        System.out.println(name.equalsIgnoreCase("ashutosh"));*/

        System.out.print("Enter Website with domain to check :");
        Scanner sc = new Scanner(System.in);
        String www = sc.nextLine();
        if(www.endsWith(".com")){
            System.out.println("Commercial Website.");
        } else if(www.endsWith(".in")){
            System.out.println("Indian Website.");
        } else if(www.endsWith(".org")){
            System.out.println("Organizational Website.");
        } else {
            System.out.println("Unrecognised");
        }
    }
}
