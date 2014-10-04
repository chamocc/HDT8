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
    private TreeMap arbol;
    
    public TreeMapSet(){
        arbol=new TreeMap();
    }

    @Override
    public void add(Word wordObject) {
       arbol.put(wordObject, wordObject);
    }

    @Override
    public Word get(Word word) {
        return (Word) arbol.get(word);
    }
}
