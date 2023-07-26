
public class student {
    private int Rno;
    private String Name;
    private String Class;
    private static String College;
    private static int nextRno;

    static {

        College = "RSML";
        nextRno =10;
    }

    public student(String Name, String Class) {
        this.Rno = nextRno;
        nextRno++;
        this.Name = Name;
        this.Class = Class;
    }

    public int getRno(){
        return Rno;
    }

    public void setRno(int Rno){
        this.Rno= Rno;
    }
    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public String getClass(String Class){
        return Class;
    }
    public void setClass(String Class){
        this.Class = Class;
    }

    public static String getCollege(){
        return College;
    }
    public static void setCollege(String College){
        student.College=College;
    }

    public void display(){
        System.out.println(Rno + " " + Name + " " + Class);
    }




}
