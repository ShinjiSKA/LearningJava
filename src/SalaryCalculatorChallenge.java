import java.util.Scanner;

public class SalaryCalculatorChallenge {

    public static double salaryCalculator(double weekHours, double moneyHours, int vacationDays){

        double weekPeerYear = (weekHours * 52) - (vacationDays * 8);
        double result = weekPeerYear * moneyHours;
        return result;
    }

    public static void main(String[] args){
        System.out.println("Number of hours the employee works per week: ");
        Scanner input1 = new Scanner(System.in);
        int hours = input1.nextInt();
        System.out.println("Amount of money the employee makes per hour: ");
        Scanner input2 = new Scanner(System.in);
        int money = input2.nextInt();
        System.out.println("Number of vacation days: ");
        Scanner input3 = new Scanner(System.in);
        int vacation = input3.nextInt();
        double totalMoney = salaryCalculator(hours, money, vacation);
        System.out.println("Employee's gross yearly salary is " + "$" +totalMoney);
    }

}
