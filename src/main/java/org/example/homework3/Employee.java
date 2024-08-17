package org.example.homework3;

import java.time.LocalDateTime;
import java.util.Date;

public class Employee {
    private static final int CURRENT_YEAR = 2024;
    String name;
    String midname;
    String surname;
    String position;
    String phone;
    int salary;
    int birth;


    public Employee() {

    }

    public Employee(String name, String midname, String surname,
                    String position, String phone, int salary, int birth) {
        this.name = name;
        this.midname = midname;
        this.surname = surname;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birth = birth;

    }

    public String getName() {
        return name;
    }

    public String getMidname() {
        return midname;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getBirth() {
        return birth;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return CURRENT_YEAR - birth;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", midname='").append(midname).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", position='").append(position).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", birth=").append(birth);
        sb.append('}');
        return sb.toString();
    }

    public String info() {
        return getName() + getMidname() + getPhone();
    }

    public void increaSesalary(int amount) {
        this.salary += amount;
    }
//Написать прототип компаратора - метод внутри класса сотрудника,
//сравнивающий две даты, представленные в виде трёх чисел:
//гггг-мм-дд, без использования условного оператора.

//    public int protocompare(Employee a1, Employee a2){
//        int date1 = a1.гггг+мм+дд;
//        int date2 = a2.гггг-мм-дд;
//        return date1 - date2;
//    }


}
