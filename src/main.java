public class main {
    public static void main(String[] args){
        double initialBal = 5000.00;
        double yearlyInterest = .17;
        int month = 0;
        double monthlyInt = yearlyInterest / 12 ;
        double interestOne = initialBal * monthlyInt;
        double newBal = initialBal + interestOne;
        double interestTwo = newBal * monthlyInt;
        double newBal2 = newBal + interestTwo;
        System.out.println("The initial balance is $" + initialBal);
        System.out.println("the balance after 1 month is $" + newBal);
        System.out.println("the balance after 2 month is $" + newBal2);
    }
}
