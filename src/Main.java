
class Student {
    String name;
    long admissionNumber;
    int rollNumber;
    String college;

    public Student(String name, long admissionNumber, int rollNumber, String college) {
        this.name = name;
        this.admissionNumber = admissionNumber;
        this.rollNumber = rollNumber;
        this.college = college;
    }
}

    public class Main
    {
        static Scanner sc = new Scanner(System.in);
        static ArrayList<Student> studentList = new ArrayList<Student>();
        static void addStudent()
        {
            System.out.print("Enter Student name:");
            String name = sc.next();
            System.out.print("Enter admission number:");
            long admissionNumber = sc.nextLong();
            System.out.print("Enter roll number:");
            int rollNumber = sc.nextInt();
            System.out.print("Enter college:");
            String college = sc.next();
            Student st = new Student(name,admissionNumber, rollNumber, college);
            studentList.add(st);
            System.out.println("Student Added Successfully");
        }

        public static void main(String[] args) {
            while(true) {
                System.out.println("------------------ Menu ----------------------");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Search Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.println("----------------------------------------------");
                System.out.print("\nPlease enter the choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        viewStudent();
                        break;
                    case 3:
                        searchStudent();
                        break;
                    case 4:
                        deleteStudent();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }
        }
