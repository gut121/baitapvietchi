package refactor;
class Instructor {
String Id;
String name;
int yearOfExp;
public Instructor() {
// TODO Auto-generated constructor stub
}
public int getSalary() {
return 1;
}
}
class Student implements Person {
String Id;
String name;
String ClassName;
public Student() {
// TODO Auto-generated constructor stub
}

@Override
public int getScholarship() {
return 1;
}
}