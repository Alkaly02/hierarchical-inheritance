package MainActivity;

import models.*;

public class MainActivity {
	public static void main(String[] args) {
		Livre livre1 = new Livre("L'aventure de Alkaly en Java", "Alkaly", 2024, 400, "TECH");
		
		livre1.afficherDetails();
	}
}
