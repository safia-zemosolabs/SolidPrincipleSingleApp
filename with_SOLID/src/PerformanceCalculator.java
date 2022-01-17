public class PerformanceCalculator implements PerformanceInterface{
    StudentInfo student;

    PerformanceCalculator(StudentInfo s){
        this.student = s;
    }

    public String reportPerformance(){
        String performance = "99%";
        System.out.println("Performance of " + this.student.getName() + " = " + performance);
        return performance;
    }
}
