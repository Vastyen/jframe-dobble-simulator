import java.util.ArrayList;

public interface IDobble {

    public void addCard();
    public Card nthCard();
    public int findTotalCard();
    public int requiredElements();
    public ArrayList missingCards();
    public String toString();
    public boolean equals();
}
