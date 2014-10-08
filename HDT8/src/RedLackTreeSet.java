/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ed. Chamo
 */
public class RedLackTreeSet implements WordSet {
    private RedBlackBST<Word,Word> arbol;
    
    public RedLackTreeSet(){
        arbol=new RedBlackBST<Word,Word>();
    }

    @Override
    public void add(Word wordObject) {
       arbol.put(wordObject, wordObject);
	   
    }

    @Override
    public Word get(Word word) {
        if(arbol.contains(word)){
			return arbol.get(word);
		}else{
			return null;
		}
    }
    
}