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
    private RedlackTree arbol;
    
    public RedLackTreeSet(){
        arbol=new RedlackTree();
    }

    @Override
    public void add(Word wordObject) {
       arbol.insert(wordObject);
    }

    @Override
    public Word get(Word word) {
        return (Word) arbol.find(word);
    }
    
}