package ru.geekbrains.lesson3.task2;

import static ru.geekbrains.lesson3.task2.Program.random;

public class Worker extends Employee {

    public Worker(String name, String surname, int age, double salary) {
        super(name, surname, age, salary);
    }

    @Override
    public double calculateSalary() {
        int salary = random.nextInt(20000, 80000);
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; %d лет. Рабочий; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                surname, name, age,  calculateSalary());
    }
}
