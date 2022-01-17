public class AttendanceCalculator implements AttendanceInterface{
    StudentInfo student;

    AttendanceCalculator(StudentInfo s){
        this.student = s;
    }

    public String reportAttendance(){
        String attendance = "90%";
        System.out.println("Attendance of " + this.student.getName() + " = "+ attendance);
        return attendance;
    }
}
