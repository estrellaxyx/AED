package aed.hashtables;

import es.upm.aedlib.Position;
import java.util.Iterator;
import es.upm.aedlib.Entry;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.map.Map;

/**
 * Implements the Map interface using a hashtable with separate chaining.
 */
public class HashTable<K, V> implements Map<K, V> {
	private NodePositionList<Entry<K, V>>[] table;
	private int size;

	/**
	 * Creates a hash table with the (not modifiable) number of buckets specified by
	 * the <code>tableSize</code> parameter.
	 */
	@SuppressWarnings("unchecked")
	public HashTable(int tableSize) {
		NodePositionList<Entry<K, V>>[] table = (NodePositionList<Entry<K, V>>[]) new NodePositionList<?>[tableSize];
		for (int i = 0; i < tableSize; i++)
			table[i] = new NodePositionList<Entry<K, V>>();
		this.table = table;
	}

	private int index(Object key) {
		//metodo auxiliar para obtener el indice del key especificado en hashtable
		// index(key) == abs(key.hashCode()) modulo tamano(table)
		return Math.abs(key.hashCode() % table.length);
	}

	/**
	 * Is the table empty?
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Returns the size (the number of entries) of the table.
	 */
	public int size() {
		return size;
	}

	/**
	 * Checks if the map contains an entry with key. Returns true if the map
	 * contains an entry with key, and false otherwise.
	 */
	public boolean containsKey(Object key) {
		PositionList<Entry<K, V>> lista = table[index(key)];
		Position<Entry<K, V>> cursor = cursor(lista,(K) key);
		//true si el cursor apunta a alguna posicion
		return cursor != null;
	}

	/**
	 * Stores a key-value entry. Returns the value of the previous entry with the
	 * specified key, or null if no such entry existed.
	 */
	public V put(K key, V value) {
		V res = null;
		Entry<K, V> entry = new HashEntry<K, V>(key, value);
		PositionList<Entry<K, V>> lista = table[index(key)];
		Position<Entry<K, V>> cursor = cursor(lista,key);
		if (cursor == null) {
			//si no se encuentra dicho key entonces 
			//anadimos el entry de dicho key a table
			table[index(key)].addLast(entry);
			size++;
		} else {
			Entry<K, V> elem = lista.set(cursor, entry);
			res = elem == null ? null : elem.getValue();
		}
		return res;

	}

	/**
	 * Returns the value associated with the specified key, or null if there is no
	 * entry with the key in the map.
	 */
	public V get(K key) {
		PositionList<Entry<K, V>> lista = table[index(key)];
		Position<Entry<K, V>> cursor = cursor(lista,key);
		if (cursor != null)
			return cursor.element().getValue();
		return null;
	}

	/**
	 * Removes the key-value entry with the specified key. Returns the value of the
	 * removed entry, or null if no such entry existed.
	 */
	public V remove(K key) {
		V valor = null;
		PositionList<Entry<K, V>> lista = table[index(key)];
		Position<Entry<K, V>> cursor = cursor(lista,key);
		if (cursor != null) {
			valor = lista.remove(cursor).getValue();
			size--;
		}
		return valor;
	}

	/**
	 * Returns an iterable object containing all the keys in entries in the map.
	 */
	public Iterable<K> keys() {
		PositionList<K> res = new NodePositionList<K>();
		for (Entry<K, V> entry : entries()) {
			res.addLast(entry.getKey());
		}
		return res;
	}

	/**
	 * Returns an iterable object containing all the entries in the map.
	 */
	public Iterable<Entry<K, V>> entries() {
		PositionList<Entry<K, V>> res = new NodePositionList<Entry<K, V>>();
		for (NodePositionList<Entry<K, V>> lista : table) {
			for (Entry<K, V> entry : lista) {
				res.addLast(entry);
			}
		}
		return res;
	}
	/**
	 * Metodo auxiliar para recorrer la lista,
	 * si hay dicho key especificado, entonces devuelve su posicion,
	 * si no, devuelve null
	 * @param lista
	 * @param key
	 * @return la posicion de dicho key especificado
	 */
	private Position<Entry<K,V>> cursor(PositionList<Entry<K, V>> lista, K key){
		Position<Entry<K, V>> res = lista.first();
		while (res != null && !res.element().getKey().equals(key)) {
			res = lista.next(res);
		}
		return res;
	}

	@Override
	public Iterator<Entry<K, V>> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
