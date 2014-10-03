/*
UVG
Algoritmos y Estructuras de Datos - 2011
Hoja de trabajo 7 
Autor: Eduardo Castellanos

Descripci�n: WordSetFactory. Clase  utilizada para instanciar los diferentes tipos de sets. 
*/
import java.util.HashMap;
import java.util.*;
import java.util.TreeMap;
class WordSetFactory {
	
	// Metodo que genera un objeto que implementa WordSet
	// parametro tipo: 1 = SimpleSet
	//                         2 = implementado con Red black tree
	//                         3 = implementado con Splay Tree
	//                         4 = implementado con Hash Table
	//                         5 = implementado con TreeMap (de Java Collection Framework)
	
	public static WordSet generateSet(int tipo)
	{
	    if (tipo == 1)
		return new SimpleSet();
            if (tipo == 2)
                return new RedBlacktree();
            if (tipo == 3)
                return new SplayTree();
            if (tipo == 4)
                return (WordSet) new HashMap();
            if (tipo == 5)
                return (WordSet) new TreeMap();
            
            else
			
			return new SimpleSet(); // nunca llega aqui
	}
	
	
}