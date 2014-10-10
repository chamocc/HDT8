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
    private RedBlackBST<String,Word> arbol;
    
    public RedLackTreeSet(){
        arbol=new RedBlackBST<String,Word>();
    }

    @Override
    public void add(Word wordObject) {
		String llave=wordObject.getWord();
       arbol.put(llave, wordObject);
	   
    }

    @Override
    public Word get(Word word) {
        if(arbol.contains(word.getWord())){
			return arbol.get(word.getWord());
		}else{
			return null;
		}
    }
    
}