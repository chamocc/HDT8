/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class RedBlackTreeSet implements WordSet {
    private RedBlackTree arbol;
    
    public RedBlackTreeSet(){
        arbol=new RedBlackTree();
    }

    @Override
    public void add(Word wordObject) {
       arbol.incertarDato(wordObject);
    }

    @Override
    public Word get(Word word) {
        return arbol.buscarDato(word);
    }
    
}
