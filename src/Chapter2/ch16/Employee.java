package Chapter2.ch16;

public class Employee {

    private static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    public Employee() {
        serialNum++;
        employeeId = serialNum;
    }
    public static int getSerialNumber() {
        int i = 0;


        return serialNum;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Employee setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Employee setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public Employee setDepartment(String department) {
        this.department = department;
        return this;
    }
}
