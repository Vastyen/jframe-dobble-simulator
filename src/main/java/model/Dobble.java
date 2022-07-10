package main.java.model;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Dobble {

    private ArrayList<Card> cardsDeck;


    /**
     * @descr: Método constructor.
     */
    public Dobble (int numE, int maxC){

        ArrayList card = new ArrayList();
        this.cardsDeck = new ArrayList<>();

        int n  = numE-1;

        for (int i = 1; i <= n + 1; i++) {
            card.add(i);
        }
        if (this.cardsDeck.size() < maxC || maxC<= 0) {
            this.addCard(card);
        }

        for (int j = 1; j <= n; j++) {
            card.clear();
            card.add(1);
            for (int k = 1; k <= n; k++) {
                card.add(n * j + (k + 1));
            }
            if (this.cardsDeck.size() < maxC || maxC<= 0) {
                this.addCard(card);
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                card.clear();
                card.add(i + 1);

                for (int k = 1; k <= n; k++) {
                    card.add(n + 2 + n * (k - 1) + (((i - 1) * (k - 1) + j - 1) % n));
                }
                if (this.cardsDeck.size() < maxC || maxC<= 0) {
                    this.addCard(card);
                }
            }
        }





    }


    /**
     * @descr: Métodos selectores y modificadores.
     */

    public ArrayList<Card> getCardsDeck() {
        return cardsDeck;
    }
    public void setCardsDeck(ArrayList cardsDeck) {
        this.cardsDeck = cardsDeck;
    }
    public int getSize(){
        return this.cardsDeck.size();
    }



    /**
     * @descr: Método que añade una copia de la carta al cardsSet.
     * @param: No aplica.
     * @return: No aplica.
     */
    public void addCard(ArrayList<Integer> card){
        Card carta = new Card(card);
        this.cardsDeck.add(carta);
    }

    /**
     * @descr: Método que devuelve una n carta.
     * @param: ArrayList<Card> cardsDeck, número de carta (integer).
     * @return: Card.
     */
    public Card nthCard(ArrayList cardsDeck, int n){
        return this.cardsDeck.get(n);
    }

    /**
     * @descr: Método que a partir de una carta devuelve el máximo de cartas que se pueden generar.
     * @param: Card.
     * @return: Número entero.
     */
    public int findTotalCards(Card carta){
        int order = carta.getListElements().size()-1;
        int totalCards = order*order+order+1;
        return totalCards;
    }

    /**
     * @descr: Método que a partir de una carta devuelve el número de elementos que se deben generar.
     * @param: Card.
     * @return: Número entero.
     */
    public int requiredElements(Card carta){
        int order = carta.getListElements().size()-1;
        int totalElements = order*order+order+1;
        return totalElements;
    }


    /**
     * @descr: Método que a partir de un ArrayList de cartas retorna las faltantas para que sea un Dobble válido.
     * @param: ArrayList<Card> cardsDeck.
     * @return: ArrayList<Card> cardsDeck.
     */
    public ArrayList missingCards(ArrayList cardsDeck){
        ArrayList newCardsDeck = new ArrayList();
        Card firstCard = this.cardsDeck.get(1);
        int sizeFirstCard = firstCard.getListElements().size();
        int sizeDeck = cardsDeck.size();
        int order = sizeFirstCard-1;
        int totalElements = order*order+order+1;
        if (esPrimo(order)){
            return cardsDeck;
        }
        else {
            return newCardsDeck;
        }
    }

    /**
     * @descr: Método que verifica si un número es primo o no.
     * @param: Número (integer).
     * @return: boolean.
     */
    public static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0)
                return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dobble dobble = (Dobble) o;
        return Objects.equals(cardsDeck, dobble.cardsDeck);
    }

    @Override
    /**
     * @descr: Método que genera un string de clase Dobble.
     * @param: No aplica.
     * @return: String.
     */
    public String toString() {
        return cardsDeck.toString();

    }
}
