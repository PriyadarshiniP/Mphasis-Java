package com.mph.pauto;


import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

        @Autowired
        private SpellChecker spellChecker;
        public TextEditor() {
            System.out.println("inside text editor no args constructor");

        }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("inside set spell checker");
        this.spellChecker = spellChecker;
    }

    public void spellCheck(){
            spellChecker.checkSpelling();
        }
    }

