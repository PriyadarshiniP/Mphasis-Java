package com.mph.p1;



public class TextEditor {

    private SpellChecker spellChecker;
    public TextEditor(SpellChecker spellChecker){
        System.out.println("inside text editor constructor");

        this.spellChecker = spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
