/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ed. Chamo
 */
import java.util.HashMap;
public class HashMapSet implements WordSet {
    private HashMap arbol;
    
    public HashMapSet(){
        arbol=new HashMap();
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
