import java.util.ArrayList;
import java.util.Objects;

public class Card {

    private ArrayList<Integer> listElements;

    public Card(ArrayList<Integer> listElements) {
        this.listElements = (ArrayList) listElements.clone();
    }

    /**
     * @descr: Métodos selectores y modificadores.
     */
    public ArrayList<Integer> getListElements() {
        return listElements;
    }

    public void setListElements(ArrayList<Integer> listElements) {
        this.listElements = listElements;
    }

    @Override
    /**
     * @descr: Método que genera un string de clase Dobble.
     * @param: No aplica.
     * @return: String.
     */
    public String toString() {
        return listElements + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(listElements, card.listElements);
    }
}


