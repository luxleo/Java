package access;

/**
 * 캡슐화 : 클래스의 속성과 메서드를 묶고, 접근 가능한 속성과 메서드만 공개한다.
 * 이외에 내부적으로만 사용되는 메서드는 private으로 접근을 제한하여
 * 클래스의 사용에 제한을 두고, 불필요한 사용을 허락하여 발생하는 혼란을 방지한다.
 */
public class BankAccount {
    private int balance;

    public void deposit(int amount) {
        if(isAmountValid(amount))
            balance += amount;
        else
            System.out.println("유효하지 않은 값입니다.");
    }

    public void withdraw(int amount) {
        if(isAmountValid(amount) && balance - amount > 0)
            balance -= amount;
        else
            System.out.println("유효하지 않은 값입니다.");
    }

    /**
     * 만일 public 제한자로 둔다면 사용자가 사용시에 필수적으로 사용해야하는 값인지
     * 의문을 가질수 있다.
     * @param amount
     * @return
     */
    private boolean isAmountValid(int amount) {
        if(amount<0)
            return false;
        return true;
    }
}
