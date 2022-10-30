import java.util.Iterator;

//To run the program, go to the directory with this file, open terminal and run the following command: java CardExercise.java

class MyStarterClass {
    public static void main(String[] args) {
        var myInts = new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12,13};
        CardDeck c = new CardDeck(myInts);
        System.out.println(c.next());
        System.out.println(c.next());
    }
}

class CardDeck implements Iterator<Integer> {

    private Integer[] myCards;
    private int currentSize;

    public CardDeck(Integer[] newArray) {
        this.myCards = newArray;
        this.currentSize = myCards.length;
    }

    private int currentIndex = 1;

    @Override
    public boolean hasNext() {
        return currentIndex < currentSize && myCards[currentIndex] != null;
    }

    @Override
    public Integer next() {
        return myCards[currentIndex++];
    }


}
