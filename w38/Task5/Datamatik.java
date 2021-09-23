/*
For this task you should reuse the Student class from Task 3.
    Methods of reusing the class could be:
    - copy the Students.java file and add it to a new folder called task5
    - copy the content of the Students class from Task 3 and create the class once more in this folder
    - Open the task 3 folder and continue working in this.
    Either method is fine - it is up to you.

5.a Create a new class Datamatik or reuse the one you created earlier. Add an array of Students with 10 elements in it. This should be a class variable (static). From the main method, add 10 student instances to the array. Each student must have a unique reference.

5.b Create a function in Datamatik that takes in the array from 5.a as a parameter as well as an integer. The function should return the field "name" (the name of the student) and print it (the integer should be used as the index nuber of the student to be printed). Call this method with different parameters (only the integer - not the array) from the main() of Datamatik.

5.c Create a similar function to that of 5.b, but instead of receiving the array and an integer, it receives the array and a string. Loop through all elements in the array until you find the element with the name received as a parameter. Then return the index of that student. Call this method with different names from the main method of Datamatik
*/


class Datamatik {

  static Student[] students = {new Student("August", 23, false, 'a'),

                            new Student("Lars", 25, false, 'a'),
                            new Student("Johan", 22, false, 'b'),
                            new Student("Henrik", 37, false, 'a'),
                            new Student("Kristian", 28, false, 'a'),
                            new Student("Pontoppidan", 28, false, 'b'),
                            new Student("Lisa", 28, true, 'a'),
                            new Student("Rasmus", 22, false, 'b'),
                            new Student("Ole", 42, false, 'a'),
                            new Student("Josephine", 22, true, 'b')};

    public static void main(String[] args) {
        studentName(students, 1);
        studentName(students, 4);
        studentName(students, 3);
        studentName(students, 6);
        findStudentByName(students, "August");
        findStudentByName(students, "Lise");
        findStudentByName(students, "Lisa");
        findStudentByName(students, "Josephine");
    }
    //5.B
    public static void studentName(Student[] _students, int index){
        System.out.println(_students[index].name);
    }
    //5.C
    public static void findStudentByName(Student[] _students, String name){
        for(int i = 0; i < _students.length; i++){
            if(_students[i].name == name){
                System.out.println(i);
                return;
            }
        }
        System.out.println("Name does not exist in the list of student names");

    }
}

    /*Teacher teacher = new Teacher("Jesper",150,false);
    Student s1 = new Student("August",23,false,'A');
    Student s2 = new Student("William",420,false,'A');

    System.out.println(teacher.getName());
    System.out.println(s1.getName()+" "+s1.getAge() +" team "+ s1.getDatamatikerTeam());
    System.out.println(s2.getName()+" "+s2.getAge() +" team "+ s2.getDatamatikerTeam());
    */
