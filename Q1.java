import java.util.Scanner;

class student {
    String[] names = new String[200];
    int[] rollno = new int[200];
    String[] dob = new String[200];
    int n;

    void inputdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        n = sc.nextInt();
        System.out.println("Enter the rollno,name,dob: ");
        for (int i = 0; i < n; i++) {

            rollno[i] = sc.nextInt();
            names[i] = sc.next();
            dob[i] = sc.next();

        }

    }

    void printdata() {
        System.out.print("Name\t\t" + "DOB\t\t" + "RollNo\t\t");
        for (int j = 0; j < n; j++) {
            System.out.println(names[j] + "\t\t" + dob[j] + "\t\t" + rollno[j]);
        }
    }
}

class marks extends student {
    float[] p = new float[n];
    float[] c = new float[n];
    float[] m = new float[n];
    float[] cts = new float[n];
    float[] e = new float[n];
    float[] tot = new float[n];
    float[] per = new float[n];
    char[] gd = new char[n];
    Scanner sc = new Scanner(System.in);

    void readdata() {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the marks of physics: ");
            p[i] = sc.nextFloat();
            System.out.println("Enter the marks of chemistry: ");
            c[i] = sc.nextFloat();
            System.out.println("Enter the marks of maths: ");
            m[i] = sc.nextFloat();
            System.out.println("Enter the marks of computer science: ");
            cts[i] = sc.nextFloat();
            System.out.println("Enter the marks of english: ");
            e[i] = sc.nextFloat();
        }
    }

    void compute() {
        for (int j = 0; j < n; j++) {
            tot[j] = p[j] + c[j] + m[j] + cts[j] + e[j];
            per[j] = tot[j] / 500;
            if (per[j] >= 90) {
                gd[j] = 'A';
            } else if (per[j] >= 60 && per[j] < 90) {
                gd[j] = 'B';
            } else if (per[j] >= 40 && per[j] < 60) {
                gd[j] = 'C';
            } else if (per[j] < 40) {
                gd[j] = 'D';
            }
        }
    }

    void showdata() {
        for (int i = 0; i < n; i++) {
            System.out.println(
                    "Name\t\t" + names[i] + "RollNo\t\t" + rollno[i] + "Percentage\t\t" + per[i] + "Grade\t\t" + gd[i]);
        }

    }

}

public class Q1 {

    public static void main(String[] args) {
        marks m1 = new marks();
        m1.inputdata();
        m1.printdata();
        m1.readdata();
        m1.compute();
        m1.showdata();
    }
}