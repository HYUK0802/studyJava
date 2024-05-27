package Chapter2.ch16;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김재혁");

        System.out.println(Employee.getSerialNum());

        Employee employeeBob = new Employee();
        employeeBob.setEmployeeName("이혀나");


        System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId());
        System.out.println(employeeBob.getEmployeeName() + "님의 사번은 " + employeeBob.getEmployeeId());
    }


}
