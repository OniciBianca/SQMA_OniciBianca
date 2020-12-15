public class Math {

	public boolean estePrim(int numar) {
		if(numar < 0) {
			throw new IllegalArgumentException();
		}

		if(numar == 0 || numar == 1) {
			return false;
		}

		boolean gasit = false;
		for(int i = 2; i <= numar/2; i++) {
			if(numar % i == 0) {
				gasit = true;
			}
		}
		return !gasit;
	}

	public boolean estePalindrom(int numar) {
		if(numar < 0) {
			throw new IllegalArgumentException();
		}

		int invers = 0;
		int rest;
		int original;

		original = numar;

		while(numar != 0) {
			rest = numar % 10;
			invers = invers * 10 + rest;
			numar  /= 10;
		}

		return original == invers;
	}
}
