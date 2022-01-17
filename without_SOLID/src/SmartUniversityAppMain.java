public class SmartUniversityAppMain {
    public static void main(String args[]){
        System.out.println("\nDemo violating the SOLID Principles\n");

        /*************************************
         *    Smart Student Management
         *************************************/
        StudentInfo studentInfoObj = new StudentInfo();
        studentInfoObj.setName("Omer");
        studentInfoObj.setAge(10);

        studentInfoObj.calculateFee();
        studentInfoObj.reportAttendance();

        //Using New Functionality Violating OCP Rule
        studentInfoObj.reportPerformance();

        /*************************************
         *    Smart Transportation
         *************************************/
        System.out.println();

        Bus busObj = new Bus();
        Bicycle bicycleObj = new Bicycle();

        busObj.startEngine();
        bicycleObj.startEngine();


        /*************************************
         *    Smart Electrical Automation
         *************************************/
        System.out.println();

        LightBulb wiproBulb = new LightBulb();
        ElectricPowerSwitch powerSwitch = new ElectricPowerSwitch(wiproBulb);

        powerSwitch.press();
        //Delay
        for(long i = 1000000000; i > 0; i--);
        powerSwitch.press();
    }
}
