package icecreamstore.icecream;

public class Employee {
    String name;
    String position;
    Double salary;

    public Employee(String n, String p, Double s){
        this.name =n;
        this.position = p;
        this.salary = s;
    }

    public String getName(){
        return name;
    }
    public String getPosition(){
        return position;
    }
    public Double getSalary(){
        return salary;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setPosition(String p){
        this.position=p;
    }
    public void setSalary(Double s){
        this.salary=s;
    }
}


