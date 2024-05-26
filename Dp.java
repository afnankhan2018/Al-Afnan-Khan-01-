// PaymentStrategy interface
public interface PaymentStrategy {
    boolean pay(double amount);
}

// Concrete strategy for CreditCard
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Making payment using credit card");
        // Implementation of credit card payment
        return true;
    }
}

// Concrete strategy for PayPal
public class PayPalPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Making payment using PayPal");
        // Implementation of PayPal payment
        return true;
    }
}

// Concrete strategy for Bank
public class BankPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Making payment using Bank");
        // Implementation of bank payment
        return true;
    }
}

// Concrete strategy for Bkash
public class BkashPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Making payment using Bkash");
        // Implementation of Bkash payment
        return true;
    }
}
