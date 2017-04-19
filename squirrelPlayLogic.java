/*
 
The squirrels in Palo Alto spend most of the day playing. 
In particular, they play if the temperature is between 
60 and 90 (inclusive). Unless it is summer, then the upper 
limit is 100 instead of 90. Given an int temperature
 and a boolean isSummer, return true if the squirrels play 
 and false otherwise.
 */

public class squirrelPlayLogic {
	
	public boolean squirrelPlay(int temp, boolean isSummer) {
		if (temp < 60) {
			return false;
		} else if (isSummer && temp <= 100) {
			return true;
		} else if (temp <= 90) {
			return true;
		} else
			return false;
	}

}