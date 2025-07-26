public class Person {
    int age;
    String name;
    double annualSalary;
    double monthlySpending;
    double totalNetworth;
    double dept;

    public Person(int Age, String Name){
        age=Age;
        name=Name;
    }
    
    public void converse(int intStat){
        
    }

    public void walk(double walkSpeed){
        
    }

    public void jump(double jumpHeight, double gravity){
        
    }

    public void networth(double annualsalary, double monthlyspending, double dEpt){
        annualSalary =  annualsalary;
        monthlySpending = monthlyspending;
        dept = dEpt;
        totalNetworth= annualSalary+(monthlySpending*12)-dept;
    }
}
