package Gun29._01_Constructor;

public class Student {
    int id;
    String name;
    String surname;
    int classroom;

    public Student () {
        System.out.println("nesne olusturuldu");
    }

    public Student (int id,String name,String surname, int classroom) {
        System.out.println("nesne parametreli olusturuldu");
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.classroom=classroom;
    }
    public Student (int id1,String name1,String surname1) {
        this(id1, name1, surname1,0); // this classin icindeyken classdan bahsettigi
    }
    public Student (int id1,String name1) {
        this (id1, name1, "",0);
    }
    public Student (int id1) {
        this (id1,"","",0);
    }
}
