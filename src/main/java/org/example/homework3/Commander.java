package org.example.homework3;

//Опишите класс руководителя, наследник от сотрудника.
// Перенесите статический метод повышения зарплаты в класс руководителя,
// модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем,
// кроме руководителей.
// В основной программе создайте руководителя и поместите его
// в общий массив сотрудников.
// Повысьте зарплату всем сотрудникам и проследите,
// чтобы зарплата руководителя не повысилась.
public class Commander extends Employee{

    public Commander(String name, String midname, String surname, String position, String phone, int salary, int birth) {
        super(name, midname, surname, position, phone, salary, birth);
    }

    public static void increaserParam(Employee[] emp, int increase, int age){
        for (int i = 0; i < emp.length; i++) {
            if(emp[i].getClass().equals(Employee.class) & emp[i].getAge()>age){
                emp[i].increaSesalary(increase);
            }
        }
    }
}
