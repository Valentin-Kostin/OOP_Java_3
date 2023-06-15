package ru.geekbrains.lesson3.task2;

import static ru.geekbrains.lesson3.task2.Program.random;

// 20d * 8h

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания
 */
public class Freelancer extends Employee{

    public Freelancer(String name, String surname, int age, double salary) {
        super(name, surname, age,  salary);
    }

    @Override
    public double calculateSalary() {
        int salary = random.nextInt(500, 1500) * 8 * 20;
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; %d лет. Фрилансер; Среднемесячная заработная плата (оплата за сумму часов в месяц): %.2f (руб.)",
                surname, name, age,  calculateSalary());
    }
}
