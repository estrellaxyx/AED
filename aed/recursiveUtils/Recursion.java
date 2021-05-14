package aed.recursiveUtils;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.positionlist.NodePositionList;

public class Recursion {

	/**
	 * Returns the position found by advancing n steps forwards in l, starting at
	 * pos, if n is positive, and if negative, returns the position found by
	 * retracting n steps.
	 * 
	 * @return the position found.
	 */
	public static <E> Position<E> getPosition(PositionList<E> l, Position<E> pos, int n) {
		// Empezando con la posicion pos en la lista l,
		// si n > 0, devuelve la posicion n puestos despues
		// si n < 0, devuelve la posicion n puestos antes
		if (n == 0)
			return pos;
		else if (n > 0)
			return getPosition(l, l.next(pos), n - 1);
		return getPosition(l, l.prev(pos), n + 1);
	}

	/**
	 * Returns a new positionlist filled with characters resulting from using the
	 * encodedText to navigate the alphabet positionlist, using the navigation
	 * discipline explained in the getPosition method.
	 * 
	 * @return a new positionlist.
	 */
	public static PositionList<Character> decrypt(PositionList<Character> alphabet, PositionList<Integer> encodedText) {
		// Devuelve una lista nueva de caracteres que resulta
		// de descifrar el texto codificado (encodedText)
		// usando el alfabeto (alphabet)
		return decrypt(alphabet, encodedText, new NodePositionList<Character>(), alphabet.first(), encodedText.first());
	}

	private static PositionList<Character> decrypt(PositionList<Character> alphabet, PositionList<Integer> encodedText,
			PositionList<Character> res, Position<Character> posA, Position<Integer> posB) {
		posA = getPosition(alphabet, posA, posB.element());
		res.addLast(posA.element());

		if (posB != encodedText.last())
			return decrypt(alphabet, encodedText, res, posA, encodedText.next(posB));
		return res;
	}

	/**
	 * Checks if the string is balanced, i.e., if the open symbols '{', '[' and '('
	 * are closed correctly with closing symbols '}', ']' and ')'.
	 * 
	 * @return true if the parameters string is balanced, and false if it is not.
	 */
	public static boolean isBalanced(String s) {
		// Estan los caracteres '(', ')', '{', '}', '[' y ']'
		// contenidos en el String s equilibrados
		return isBalanced(s, 0, "");
	}

	/**
	 * 
	 * @param s
	 * @param n    = character en s de posicion n
	 * @param aux = se guarda "(", "[", "{" en el caso de haber encontrado uno en n
	 * @return
	 */
	private static boolean isBalanced(String s, int pos, String aux) {
		// Miro si el String esta vacio o si he llegado al final
		if (s.isEmpty() || pos >= s.length()) 
			return aux.isEmpty();
		
		char c = s.charAt(pos);
		// Si encuentro un simbolo de apertura lo incluyo en el string de openers y sigo
		// en la siguiente posicion
		if (opens(c)) 
			return isBalanced(s, pos + 1, c + aux);
		
		// Si es de cierre el simbolo compruebo si tenia previamente de apertura y si
		// ademas coinciden, en ese caso sigue la recurrencia quitando el ultimo simbolo
		// de apertura
		else if (closes(c)) 
			return !aux.isEmpty() && matches(aux.charAt(0), c) 
					&& isBalanced(s, pos + 1, aux.substring(1));
		
		// Si no es un simbolo de apertura ni cierre paso a la siguente posicion sin
		// modificar nada
		else 
			return isBalanced(s, pos + 1, aux);

	}

	private static boolean opens(char ch) {
		return (ch == '(') || (ch == '[') || (ch == '{');
	}

	private static boolean closes(char ch) {
		return (ch == ')') || (ch == ']') || (ch == '}');
	}

	private static boolean matches(char c1, char c2) {
		return ((c1 == '(') && (c2 == ')')) || 
				((c1 == '{') && (c2 == '}')) || 
				((c2 == ']') && (c1 == '['));
	}
}
