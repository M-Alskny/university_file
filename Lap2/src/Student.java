public class Student  extends  Person{
    private  int id ;


    public Student(double age, String name, int id) {
        super(age, name);
        this.id = id;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
