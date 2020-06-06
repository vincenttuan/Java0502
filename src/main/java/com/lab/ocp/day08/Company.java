package com.lab.ocp.day08;

public class Company {
    private String name = "ABC"; // 公司名稱
    
    public void printGoal(int yyyy) { // 公司願景
        int year = 2020;
        class Goal {
            void printYear() {
                System.out.printf("%d 願景...\n", year);
                System.out.printf("%d 願景...\n", yyyy);
            }
        }
        Goal goal = new Goal();
        goal.printYear();
    }
    
    // 建立員工類別
    public class Employee {
        private String name = "John"; // 員工名字
        public int getSalary() {
            return 40000;
        }
        public void job() {
            String name = "寫程式"; // 工作內容名稱
            System.out.printf("%s 在 %s 公司的工作內容是:%s\n", this.name, Company.this.name, name);
        }
    }
}
