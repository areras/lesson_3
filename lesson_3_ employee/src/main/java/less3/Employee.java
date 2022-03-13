package less3;

public class Employee {

    String name;
    String position;
    String email;
    String phone_number;
    int salary;
    int age;


    public Employee(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }



    public String toString(){
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                name, position, email, phone_number, salary, age);}


    public void print(){
        System.out.println(this);
    }

    public static void main(String[] args)  {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee(" Бровко Максим>", "Генеральный директор", "bk@primer.ru", "+7999257527544", 200000, 42);
        persArray[1] = new Employee("Коршун Игорь", "Директор", "kz12@primer.ru", "+79858584455", 12000, 49);
        persArray[2] = new Employee("Путилоло Владимир", "Охранник", "dpv@primer.ru", "+79997558534", 10000, 21);
        persArray[3] = new Employee("Петрова Евгения", "Главный разработчик", "pv@primer.ru", "+799955589", 13000, 27);
        persArray[4] = new Employee("Гиренок Кристина", "Директор по работе с клиентами", "gv@primer.ru", "+7999889965", 13700, 48);


        for (int i=0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].print();

    }
}