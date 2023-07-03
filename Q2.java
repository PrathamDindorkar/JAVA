import java.util.Scanner;

class Teacher {
    String name[] = new String[200];
    String dob[] = new String[200];
    String doj[] = new String[200];
    int n;
    Scanner sc = new Scanner(System.in);

    void getdata() {
        System.out.println("Enter the number of teachers: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            dob[i] = sc.next();
            doj[i] = sc.next();
        }
    }

    void show_getdata() {
        System.out.println("Name\t\tDOB\t\tDOJ");
        for (int j = 0; j < n; j++) {
            System.out.println(name[j] + "\t\t" + dob[j] + "\t\t" + doj[j]);
        }
    }
}

class Principal extends Teacher {
    void sortdata() {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (name[i].compareTo(name[j]) > 0) {
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;

                    temp = dob[i];
                    dob[i] = dob[j];
                    dob[j] = temp;

                    temp = doj[i];
                    doj[i] = doj[j];
                    doj[j] = temp;
                }
            }
        }
    }

    void display() {
        System.out.println("Sorted data: ");
        System.out.println("Name\t\tDOB\t\tDOJ");
        for (int i = 0; i < 3; i++) {
            System.out.println(name[i] + "\t\t" + dob[i] + "\t\t" + doj[i]);
        }
    }

    void searchdata() {
        System.out.println("Enter the name to be searched: ");
        String search = sc.next();
        for (int i = 0; i < n; i++) {
            if (search.equals(name[i])) {
                System.out.println("Name\t\tDOB\t\tDOJ");
                System.out.println(name[i] + "\t\t" + dob[i] + "\t\t" + doj[i]);
            }
        }
    }
}

public class Q2 {
    public static void main(String args[]) {
        Principal t = new Principal();
        t.getdata();
        t.show_getdata();
        t.sortdata();
        t.display();
        t.searchdata();
    }
}