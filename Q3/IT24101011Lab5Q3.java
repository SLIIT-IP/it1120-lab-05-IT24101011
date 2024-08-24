import java.util.Scanner;

public class IT24101011Lab5Q3 {
    
    private static final int ROOM_CHARGE_PER_DAY = 48000;
    private static final int DISCOUNT_3_TO_4_DAYS = 10;
    private static final int DISCOUNT_5_OR_MORE_DAYS = 20;
    private static final int MIN_DATE = 1;
    private static final int MAX_DATE = 31;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the start date (1-31):");
        int startDate = scanner.nextInt();
        
        System.out.println("Enter the end date (1-31):");
        int endDate = scanner.nextInt();
        
        if (!isValidDate(startDate) || !isValidDate(endDate)) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return;
        }
        
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }
        
        int numberOfDays = endDate - startDate;
        
        int totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;
        
        int discountPercentage = getDiscountPercentage(numberOfDays);
        double discountAmount = (discountPercentage / 100.0) * totalAmount;
        double finalAmount = totalAmount - discountAmount;
        
        System.out.println("Number of days reserved: " + numberOfDays);
        System.out.println("Total amount before discount: Rs " + totalAmount);
        System.out.println("Discount: " + discountPercentage + "%");
        System.out.println("Discount amount: Rs " + discountAmount);
        System.out.println("Total amount to be paid: Rs " + finalAmount);
        
        scanner.close();
    }
    
    private static boolean isValidDate(int date) {
        return date >= MIN_DATE && date <= MAX_DATE;
    }
    
    private static int getDiscountPercentage(int numberOfDays) {
        if (numberOfDays >= 5) {
            return DISCOUNT_5_OR_MORE_DAYS;
        } else if (numberOfDays >= 3) {
            return DISCOUNT_3_TO_4_DAYS;
        } else {
            return 0; 
        }
    }
}
