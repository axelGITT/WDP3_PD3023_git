/**
 *
 *  @author Nowak Piotr PD3023
 *
 */

/**
 *  W pliku {user.home}/iter.txt podane są trzy liczby całkowite: start end limit(rozdzielone spacjami)
Napisać program wczytujący te trzy liczby i sumujący  liczby całkowite od start do end, ale przerywającą sumowanie gdy wartość sumy osiągnie lub przekroczy zadane ograniczenie limit. 
Program ma wypisać na konsoli jedną liczbę: wynik sumowania.

Dla przykładu, jeśli w pliku  podano:
1 3 6
to na konsoli uzyskamy:
6

W przypadku wystąpienia błędów (np. brak pliku, wadliwe dane) należy wypisać na konsoli TYLKO trzy gwiazdki:

***
i zakończyć działanie programu.

Nazwa pliku, jego umiejscowienie i postać oraz postać wyniku na konsoli jest obowiązkowa. Rozwiązanie nie spełniające tych wymagań otrzymują 0 punktów.
 *
 */

package zad1;


public class Main {

  public static void main(String[] args) {
    String fname = System.getProperty("user.home") + "/iter.txt";            

  }
}
