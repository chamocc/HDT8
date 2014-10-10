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
    private HashMap<String, Word> arbol;
    
    public HashMapSet(){
        arbol=new HashMap<String, Word>();
    }

    @Override
    public void add(Word wordObject) {
		String llave=wordObject.getWord();
        arbol.put(llave, wordObject);
    }

    @Override
    public Word get(Word word) {
        if (!(arbol.containsKey(word.getWord())))
            return null;
		//System.out.println(arbol.get(word).getWord()+" palabra retornada");
        return arbol.get(word.getWord());
    }
    
}
