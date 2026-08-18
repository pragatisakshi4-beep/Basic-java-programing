import java.util.Scanner;

// 1. लर्नर क्लास की परिभाषा
class Learner {
    int id;
    String name;
    int javaScore;

    // कंस्ट्रक्टर (Constructor)
    public Learner(int id, String name, int javaScore) {
        this.id = id;
        this.name = name;
        this.javaScore = javaScore;
    }

    // रिकॉर्ड प्रिंट करने के लिए मेथड
    public void display() {
        System.out.println(id + " - " + name + " - " + javaScore);
    }
}

// 2. मेन क्लास
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // पहले लर्नर का डेटा इनपुट लेना
        int id1 = sc.nextInt();
        sc.nextLine(); // न्यूलाइन क्लियर करने के लिए
        String name1 = sc.nextLine();
        int score1 = sc.nextInt();

        // दूसरे लर्नर का डेटा इनपुट लेना
        int id2 = sc.nextInt();
        sc.nextLine(); // न्यूलाइन क्लियर करने के लिए
        String name2 = sc.nextLine();
        int score2 = sc.nextInt();

        // 7वां इनपुट: पहले लर्नर का नया Java Score
        int newScore1 = sc.nextInt();

        // दो अलग-अलग लर्नर ऑब्जेक्ट्स बनाना
        Learner l1 = new Learner(id1, name1, score1);
        Learner l2 = new Learner(id2, name2, score2);

        // अपडेट से पहले रिकॉर्ड्स प्रिंट करना
        System.out.println("Before Update");
        l1.display();
        l2.display();

        // केवल पहले लर्नर का स्कोर अपडेट करना
        l1.javaScore = newScore1;

        // अपडेट के बाद रिकॉर्ड्स प्रिंट करना
        System.out.println("After Update");
        l1.display();
        l2.display();

        sc.close();
    }
}
