package com.example.idrisadrien.tp7b2;

/**
 * Created by idrisadrien on 11/10/2017.
 */

public class VraiFaux {

    private int mQuestion;
    private boolean mVraieQuestion;

    public int getQuestion(){
        return mQuestion;
    }

    // Affectation de la question et de la réponse correct

    public VraiFaux(int question, boolean questionVraie){
        mQuestion = question;
        mVraieQuestion = questionVraie;
    }


    public void setQuestion(int question){
        mQuestion = question;
    }


    // Méthode vérifiant si la réponse est correcte
    public boolean isQuestionVraie(){
        return mVraieQuestion;
    }

    public void setQuestionVraie(boolean questionVraie){
        mVraieQuestion = questionVraie;
    }


}
