package ru.geekbrains.lesson3.task2;

public abstract class Employee implements Comparable<Employee> {

    protected String name;
    protected String surname;

    protected int age;
    protected double salary; // Ставка заработной платы

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public Employee(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();

    @Override
    public int compareTo(Employee o) {
        int res = name.compareTo(o.name);
        if (res == 0){
            return surname.compareTo(o.surname);
        }
        return res;
    }

}
