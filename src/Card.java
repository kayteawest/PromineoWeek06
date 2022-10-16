
public class Card { // Section 1.a - Class named "Card".

	private int value; // Section 1.a.i.1 - Field value.
	private String name; // Section 1.a.i.2 - Field name.
	
	
	
	public int getValue() { // Section 1.a.ii.1 - Method that returns (gets) the value of the card.
		return value;
	}
	
	public void setValue(int newValue) { // Section 1.a.ii.1 - Method that sets the variable named "value" to equate to the same value as the variable named "newValue".
		value = newValue;
	}
	
	public String getName() { // Section 1.a.ii.1 - Method that returns (gets) the name of the card.
		return name;
	}
	
	public void setName(String newName) { // Section 1.a.ii.1 - Method that sets the variable named "name" to equate to the same value as the variable named "newName".
		name = newName;
	}
	
	public void describe() { // Section 1.a.ii.2 - Method that prints out the name and value of the card to the console.
		System.out.println(name + " - Point value: " + value);
	}
	
}
