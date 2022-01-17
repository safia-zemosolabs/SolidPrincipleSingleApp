public class StudentInfo {
    private String name;
    private int age;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    //Violating SRP rule
    public long calculateFee(){
        long fee = 20000;
        System.out.println("Fee of " + this.name + " = Rs. " + fee);
        return 2000;
    }

    //Violating SRP rule
    public String reportAttendance(){
        String attendance = "90%";
        System.out.println("Attendance of " + this.name + " = "+ attendance);
        return attendance;
    }

    // Adding New Functionality Violating OCP rule
    public String reportPerformance(){
        String performance = "99%";
        System.out.println("Performance of " + this.name + " = "+ performance);
        return performance;
    }
}
