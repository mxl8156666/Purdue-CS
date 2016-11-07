import java.util.Scanner;

public class TaxBracketMethod {
    int income;
    int bracket10 = 0;
    int bracket15 = 0;
    int bracket25 = 0;
    int bracket28 = 0;
    int bracket33 = 0;
    int bracket35 = 0;
    int bracket40 = 0;

    public void addBracket(int income) {
        if (income >= 0 && income <= 9075) {
            bracket10 += 1;
        }
        else if (income >= 9076 && income <= 36900) {
            bracket15 += 1;
        }
        else if (income >= 36901 && income <= 86350) {
            bracket25 += 1;
        }
        else if (income >= 89351 && income <= 186350) {
            bracket28 += 1;
        }
        else if (income >= 186351 && income <= 405100) {
            bracket33 += 1;
        }
        else if (income >= 405101 && income <= 406750) {
            bracket35 += 1;
        }
        else if (income >= 406750) {
            bracket40 += 1;
        }
    }

    public static void main(String[] args){
        int incomeEntered = 0;
        int totalIncomes = 0;
        int bracket10 = 0;
        int bracket15 = 0;
        int bracket25 = 0;
        int bracket28 = 0;
        int bracket33 = 0;
        int bracket35 = 0;
        int bracket40 = 0;
        boolean finished = false;
        Scanner in = new Scanner(System.in);
        TaxBracketMethod input = new TaxBracketMethod();
        while(incomeEntered < 0) {
            System.out.println("Enter an income");
            incomeEntered = in.nextInt();
            if (incomeEntered >= 0) {
                input.addBracket(incomeEntered);
                totalIncomes += 0;
            }
        }

        System.out.println("Number of incomes entered = " + totalIncomes);
        System.out.println("Number of 10% bracket = " + bracket10);
        System.out.println("Number of 15% bracket = " + bracket15);
        System.out.println("Number of 25% bracket = " + bracket25);
        System.out.println("Number of 28% bracket = " + bracket28);
        System.out.println("Number of 33% bracket = " + bracket33);
        System.out.println("Number of 35% bracket = " + bracket35);
        System.out.println("Number of 40% bracket = " + bracket40);

    }
}