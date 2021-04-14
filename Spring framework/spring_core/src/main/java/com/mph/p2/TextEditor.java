package com.mph.p2;



public class TextEditor {

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

