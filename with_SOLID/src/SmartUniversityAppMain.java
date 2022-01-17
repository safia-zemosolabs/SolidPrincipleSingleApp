public class SmartUniversityAppMain {
    public static void main(String args[]){
        System.out.println("\nDemo Following the SOLID Principles\n");

        /*************************************
         *    Smart Student Management
         *************************************/
        StudentInfo studentInfoObj = new StudentInfo();
        studentInfoObj.setName("Omer");
        studentInfoObj.setAge(10);

        FeeCalculator feeCalculatorObj = new FeeCalculator(studentInfoObj);
        feeCalculatorObj.calculateFee();

        AttendanceCalculator attendanceCalculatorObj = new AttendanceCalculator(studentInfoObj);
        attendanceCalculatorObj.reportAttendance();

        //Using New Functionality following OCP Rule
        PerformanceCalculator performanceCalculatorObj = new PerformanceCalculator(studentInfoObj);
        performanceCalculatorObj.reportPerformance();

        /*************************************
         *    Smart Transportation
         *************************************/
        System.out.println();

        Bus busObj = new Bus();
        Bicycle bicycleObj = new Bicycle();

        busObj.startEngine();
        bicycleObj.startMoving();


        /*************************************
         *    Smart Electrical Automation
         *************************************/
        System.out.println();

        Switchable switchableBulb = new LightBulb();
        Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
        bulbPowerSwitch.press();
        //Delay
        for(long i = 1000000000; i > 0; i--);
        bulbPowerSwitch.press();
        System.out.println("\n");

        Switchable switchableFan = new Fan();
        Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);
        fanPowerSwitch.press();
        //Delay
        for(long j = 1000000000; j > 0; j--);
        fanPowerSwitch.press();
    }
}
