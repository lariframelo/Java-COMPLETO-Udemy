package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.println("Enter worker data: ");
        System.out.print("Enter Name: ");
        String workerName = sc.nextLine();
        System.out.print("Enter Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Enter Base salary: ");
        Double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, workerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (dd/mm/yyyy): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour : ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration hours: ");
            int hour = sc.nextInt();

            HourContract contract = new HourContract(contractDate,valuePerHour,hour);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income:(MM/YYYY) ");
        String monthAndYear = sc.next();

        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.print("Name: " + worker.getName());
        System.out.print("Department: " + worker.getDepartament().getName());
        System.out.print("Income for " + monthAndYear + ": " + String.format("%2.F",worker.income(year,month)));


        sc.close();
    }
}
