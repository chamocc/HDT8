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
    private HashMap<String, String> arbol;
    
    public HashMapSet(){
        arbol=new HashMap();
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
