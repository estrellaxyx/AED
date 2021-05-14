package aed.treesearch;

import java.util.Iterator;

import es.upm.aedlib.Position;
import es.upm.aedlib.set.*;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.tree.*;

public class TreeSearch {
	public static Set<Position<String>> search(Tree<String> t, PositionList<String> searchExprs) {
		Set<Position<String>> res = new PositionListSet<Position<String>>();
		// entro en la recursion si me han dado una expresion que empiece por la raiz
		// o por "*"
		Position<String> primeroLista = searchExprs.first();
		if (primeroLista.element().equals("*") || t.root().element().equals(primeroLista.element()))
			search(t, searchExprs, t.root(), searchExprs.next(primeroLista), res);
		return res;
	}

	private static void search(Tree<String> t, PositionList<String> searchExprs, Position<String> treePos,
			Position<String> cursor, Set<Position<String>> res) {
		if (cursor == null) {
			// si he terminado la lista, meto en el set la posicion en la que me encuentro
			res.add(treePos);
			return;
		}
		if (cursor.element().equals("*")) {
			// miro todos los hijos
			for (Position<String> child : t.children(treePos)) {
				search(t, searchExprs, child, searchExprs.next(cursor), res);
			}
		} else {
			// miro solo en los hijos que tengan el mismo elemento
			for (Position<String> child : t.children(treePos)) {
				if (child.element().equals(cursor.element()))
					search(t, searchExprs, child, searchExprs.next(cursor), res);
			}
		}

	}

	public static Tree<String> constructDeterministicTree(Set<PositionList<String>> paths) {
		GeneralTree<String> t = new LinkedGeneralTree<String>();
		for (PositionList<String> list : paths) {
			// Recorremos cada lista de los caminos.
			if (!list.isEmpty()) {
				Position<String> cursor = list.first();
				if (t.root() == null)
					t.addRoot(cursor.element());
				cursor = list.next(cursor);
				Position<String> treePos = t.root();
				while (cursor != null) {
					//si no hemos acabado la lista
					String elem = cursor.element();
					//si el nodo no tiene hijos entonces lo anado
					if (t.isExternal(treePos))
						treePos = t.addChildLast(treePos, elem);
					else {
						boolean esta = false;
						Position<String> aux = null;
						for (Position<String> child : t.children(treePos)) {
							//recorremos los hijos de cada nodo y 
							//si el nodo de la lista ya existe en el arbol,
							//salgo del bucle
							if (child.element().equals(elem)) {
								esta = true;
								aux = child;
							}
						}
						//muevo treePos a la nueva
						treePos = (esta) ? aux : t.addChildLast(treePos, elem);
					}
					cursor = list.next(cursor);
				}
			}
		}
		return t;
	}
}
