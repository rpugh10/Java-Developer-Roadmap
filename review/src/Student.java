import java.util.Scanner;
public class Student {
    private static int counter;

    private String name;

    private int id;

    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }


     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("name=").append(name);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);

       System.out.println("How many students do you want to create: ");
       int num = scan.nextInt();
       scan.nextLine();

       for(int i = 0 ; i < num; i++)
       {
            System.out.println("Enter student name: ");
            String name = scan.nextLine();

            System.out.println("Enter student id: ");
            int id = scan.nextInt();
            scan.nextLine();

            counter++;
            Student student = new Student(name, id);

       }


       System.out.println("The number of students created is " + counter);

    }

}
