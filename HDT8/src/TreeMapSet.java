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
    private int x;
    
    public TreeMapSet(){
        arbol=new TreeMap();
        x = 0;
    }

    @Override
    public void add(Word wordObject) {
       arbol.put(wordObject, wordObject);
       x++;
    }

    @Override
    public Word get(Word word) {
        return (Word) arbol.get(word);
    }
}
