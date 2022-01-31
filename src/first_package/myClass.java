package first_package;

public class myClass {
    private int id;
    private String name;
    private double marks;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name =name;
    }
    public double getMarks(){
        return marks;
    }
    public void setMarks(double marks){
        this.marks =marks;
    }
    public static void main(String[] args) {
        myClass objEarn = new myClass();
        objEarn.setId(1813010);
        System.out.println("ID: "+objEarn.getId());
        objEarn.setName("Nirob");
        System.out.println("NAME: "+objEarn.getName());
        objEarn.setMarks(45);
        System.out.println("MARKS: "+objEarn.getMarks());

    }
}
