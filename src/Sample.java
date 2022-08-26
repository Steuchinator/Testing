import java.util.*;

public class Sample {
	String nombre = "";
	int possessed = 0;
	public Sample (String name, int isaacsInPossession) {
		nombre = name;
		possessed = isaacsInPossession;
	}
	
	public String toString () {
		return "my name is "+ nombre + ", and i have "+possessed+"isaacs.";
	}
}
