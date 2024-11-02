class Student{
    int rollNo, marks;
    String name;
    // public Student(int a, int b, String c){
    //     rollNo = a;
    //     marks = b;
    //     name = c;
    // }

}

public class Array {
    public static void main(String[] args) {
        // int arr[][] = new int[3][];

        // arr[0] = new int[4];
        // arr[1] = new int[3];
        // arr[2] = new int[2];

        // arr[0] = 5;
        // arr[1] = 6;
        // arr[2] = 1;
        // arr[3] = 9;
        // arr[4] = 0;

        // for(int i=0; i<5; ++i){
        // System.out.print(i + " ");
        // }
        // for(int i=0; i<3; ++i){
        // for(int j = 0; j<4; ++j){
        // arr[i][j] = (int)(Math.random()*10);
        // }
        // }

        // for(int m[]: arr){
        // for(int n: m){
        // System.out.print(n + " ");
        // }
        // System.out.println();
        // }
        // for (int i = 0; i < arr.length; ++i) {
        //     for (int j = 0; j < arr[i].length; ++j) {
        //         arr[i][j] = (int) (Math.random() * 10);
        //     }
        // }

        // for(int m[]: arr){
        //     for(int n: m){
        //         System.out.print(n + " ");
        //     }
        //     System.out.println();
        // }

        // Student stu1 = new Student(1, 66, "Arvinderjeet");
        // System.out.print(stu1.rollNo + ". " + stu1.name + " : " + stu1.marks);

        Student s1 = new Student();
        s1.name = "Arvinderjeet";
        s1.marks = 66;
        s1.rollNo = 1;
        Student s2 = new Student();
        s2.name = "Nitin";
        s2.marks = 87;
        s2.rollNo = 2;
        Student s3 = new Student();
        s3.name = "Prashant";
        s3.marks = 33;
        s3.rollNo = 3;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i=0; i<students.length; ++i){
        //     System.out.println(students[i].rollNo + ". " + students[i].name + ":  " + students[i].marks);
        // }

        for(Student stud: students){
            System.out.println(stud.rollNo + ". " + stud.name + ":  " + stud.marks);
        }

    }
}