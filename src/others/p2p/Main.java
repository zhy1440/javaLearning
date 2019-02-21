package others.p2p;

public class Main {
    private static int TEM_THOUSAND = 10000;

    public static class Calculator {
        private int capital;
        private double rate;
        private double salaryRate;
        private double income;
        private String capitalText;

        Calculator(int capital, double rate, double salaryRate) {
            this.capital = capital;
            this.rate = rate;
            this.salaryRate = salaryRate;
        }

        double getIncome() {
            this.income = this.capital * this.rate + this.capital * this.salaryRate * 2;
            return income;
        }

        String getCapitalText() {
            this.capitalText = capital / TEM_THOUSAND + "w";
            return capitalText;
        }
    }

    public static void main(String[] args) {
        double highRate = 0.085;
        double lowRate = 0.07;
        double oldSalary = 1600 / 100000.0;
        double highSalary = 4000.0 / 100000;
        double lowSalary = 260.0 / 10000;

        Calculator c1 = new Calculator(20 * TEM_THOUSAND, highRate, oldSalary);
        Calculator c2 = new Calculator(4 * TEM_THOUSAND, lowRate, lowSalary);
        Calculator c3 = new Calculator(20 * TEM_THOUSAND, highRate, highSalary);


        System.out.println(c1.getCapitalText() + ": " + c1.getIncome());
        System.out.println(c2.getCapitalText() + ": " + c2.getIncome());
        System.out.println(c3.getCapitalText() + ": " + c3.getIncome());
        System.out.println("new total: " + (c2.getIncome() + c3.getIncome()));
        System.out.println("delta: " + (c2.getIncome() + c3.getIncome() - c1.getIncome()));
    }
}
