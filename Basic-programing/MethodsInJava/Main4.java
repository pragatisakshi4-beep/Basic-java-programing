package MethodsInJava;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // 1. पहले छात्र (Student 1) की जानकारी इनपुट लें
            int id1 = sc.nextInt();
            sc.nextLine(); // स्पेस या लाइन चेंज को सँभालने के लिए
            String name1 = sc.nextLine();
            int score1 = sc.nextInt();

            // 2. दूसरे छात्र (Student 2) की जानकारी इनपुट लें
            int id2 = sc.nextInt();
            sc.nextLine(); // स्पेस या लाइन चेंज को सँभालने के लिए
            String name2 = sc.nextLine();
            int score2 = sc.nextInt();

            // 3. दोनों छात्रों की जानकारी स्क्रीन पर दिखाएँ
            System.out.println(id1 + " - " + name1 + " - " + score1);
            System.out.println(id2 + " - " + name2 + " - " + score2);

            // 4. दोनों के नंबरों (Scores) की तुलना करें
            if (score1 > score2) {
                System.out.println(name1 + " has the higher Java score.");
            } else if (score2 > score1) {
                System.out.println(name2 + " has the higher Java score.");
            } else {
                System.out.println("Both students have the same Java score.");
            }
        }
    }
}

