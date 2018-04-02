public class Cards{
	public static void main(String[] args){
		
		//need to implement fisher yates shuffle
			
		System.out.println("Deck of cards arranged in a linear array");
		Card[] linDeck = new Card[52];
		int offset = 0; // offset for corrected index, fill linear array using nested for loop
		for (Suit s : Suit.values()){
			for (int i = 0; i < 13; i++){
				linDeck[i+offset] = new Card(s, i+1);
			}
			offset+=13;
		}
		
		//print linear deck
		for (Card cd : linDeck){
			System.out.print(cd);
		}
		
		
		System.out.println();
		System.out.println();

		
		System.out.println("Deck of cards arranged in a 2d array");
		Card[][] deck = new Card[4][13];
		for (Suit s : Suit.values()){
			for (int j = 0; j < 13; j++){
				deck[s.ordinal()][j] = new Card(s, j+1); //fancy! using ordinal for index
			}
		}
		
		//print 2d deck
		for (int i = 0 ; i < deck.length; i++ ){
			for (int j = 0; j < deck[0].length; j++){ 
				System.out.print(deck[i][j]);
			}
			System.out.println();
		}
	}

}


enum Suit {
	CLUBS, 
	HEARTS, 
	SPADES, 
	DIAMONDS
}

class Card{
	private int value;
	private Suit suit;
	
	public Card(){
		this.value = 1;
		this.suit = Suit.SPADES;
	}
	
	public Card(Suit s, int v){
		this.value = v;
		this.suit = s;
	}
	
	public String toString(){
		String s = "";
		//s += ("The value is " + value + " and the suit is " + suit);
		s += "[" + value + suit.name().charAt(0) + "]";
		return s;
	}
	
}


//  0 ... 12
// 13 ... 25
// 26 ... 38
// 39 ... 51


// for (int i = 0 ; i < 4; i++ ){// can't use foreach cuz we don't define array based on suit name
			// for (int j = 0; j < 13; j++){
				//but we can do it based on array of suit
				// deck[i][j] = new Card(st[i], j+1);
			// }
		// }
		
		
		//Test deck with enum ordinal 
		
		// for (Suit sfir : st){
			// for (int j = 0; j < 13; j++){
				//but we can do it based on array of suit
				// deck[sfir.ordinal()][j] = new Card(st[sfir.ordinal()], j+1); //fancy! using ordinal for index
			// }
		// }
		
		//even fancier: using enum values so we don't need an external array of suits.