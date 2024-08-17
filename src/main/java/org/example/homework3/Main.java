package org.example.homework3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee max = new Employee("max", "jonson", "freddison",
                "tester", "2234423", 75000, 21031990);
        Employee den = new Employee("den", "jhonson", "etkins",
                "tester", "9887564636", 55000, 1980);
        Employee steve = new Employee("steve", "richards", "tiggo",
                "project manager", "999233423", 75000, 1998);
        Employee nina = new Employee("nina", "gordi", "kim",
                "developer", "3341029", 90000, 1989);
        Employee maggy = new Employee("maggy", "boui", "lee",
                "leader", "45527895", 100000, 1995);
        Commander sam = new Commander("sam","fort","nikolson",
                "Boss","5543424", 150000,1980);

        Employee[] company = {max, maggy, den, steve, nina, sam};

        for (Employee id : company) {
            System.out.println(id.getSalary() + " " + id.getName());
        }
//        for (int i = 0; i < company.length; i++) {
//            increaser(company);
//        }
        Commander.increaserParam(company, 5000,30);
        for (Employee id : company) {
            System.out.println(id.getSalary() + " " + id.getName());
        }




    }
//    private static void increaser(Employee[] emp){
//        for (int i = 0; i < emp.length; i++) {
//            if(emp[i].getAge() > 30){
//                emp[i].increaSesalary(5000);
//            }
//        }
//    }

//    public static void increaserParam(Employee[] emp, int increase,int age){
//        for (int i = 0; i < emp.length; i++) {
//            if(emp[i].getAge() > age){
//                emp[i].increaSesalary(increase);
//            }
//        }
//    }

}
