/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ed. Chamo
 */

import java.util.TreeMap;

public class TreeMapSet implements WordSet {
    private TreeMap <String, Word> arbol;
    
    public TreeMapSet(){
        arbol=new TreeMap<String, Word>();
    }

    @Override
    public void add(Word wordObject) {
		String llave=wordObject.getWord();
        arbol.put(llave, wordObject);
    }

    @Override
    public Word get(Word word) {
        if (arbol.containsKey(word.getWord())){
			//System.out.println(arbol.get(word).getWord()+" palabra retornada");
			return arbol.get(word.getWord());
			}
        return null;
    }
}
