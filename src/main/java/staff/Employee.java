package staff;

public abstract class Employee {
    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNiNumber(){
        return this.niNumber;
    }
    public double getSalary(){
        return this.salary;
    }

    public String salaryRaise(int percentage){
        if (percentage > 0) {
            double bump = percentage / 100.0;
            this.salary = this.salary * (1 + bump);
            return "Congratulations, you got a salary bump. Nice Job!";
        }
        else {
            return "No negative percentage allowed, this is a salary BUMP!!!";
        }
    }

    public  double payBonus(){
        return this.salary * 0.01;
    };

    public void setName(String newName) {
        if (newName.length() > 0) {
            this.name = newName;
        }
    }


}

