package com.mph.pa2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TextEditor {

        @Autowired
        @Qualifier("spellChecker2")
        private SpellChecker spellChecker;

        public TextEditor(SpellChecker spellChecker) {
            System.out.println("Inside TextEditor constructor." );
            this.spellChecker = spellChecker;
        }


        public TextEditor() {
            System.out.println("Inside noargs TextEditor constructor." );
        }

        public SpellChecker getSpellChecker() {
            return spellChecker;
        }

        public void setSpellChecker(SpellChecker spellChecker) {
            System.out.println("Inside setSpellChecker");
            this.spellChecker = spellChecker;
        }

        public void spellCheck() {
            spellChecker.checkSpelling();
        }

    @PostConstruct
    public void init(){
        System.out.println("Bean is going through init.");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }


    }