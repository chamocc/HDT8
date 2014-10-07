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
    private TreeMap <String, String> arbol;
    
    public TreeMapSet(){
        arbol=new TreeMap();
    }

    @Override
    public void add(Word wordObject) {
       arbol.put(wordObject.getWord() , wordObject.getType());
    }

    @Override
    public Word get(Word word) {
        if (!(arbol.containsKey(word.getWord())))
            return null;
        return new Word(word.getWord(),arbol.get(word.getWord()));
    }
}
