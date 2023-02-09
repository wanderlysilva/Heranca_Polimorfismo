package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Entre com a quantidade de funcionarios: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Funcionario #" + i + " data: ");
            System.out.print("O funcionario é terceirizado? (y/n) :");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.print("Horas: ");
            int hours = sc.nextInt();
            System.out.print("Valor por hora: ");
            Double valuePerHours = sc.nextDouble();

            if (ch == 'y') {
                System.out.print("Despesa adicional :");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge));
            } 
            else {
                list.add(new Employee(name, hours, valuePerHours));
                
            }
        }

        System.out.println();
        System.out.println("Pagamento: ");

        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
            
        } 
        sc.close();
    }
}