package org.KNUJavaLabs.ClassWork.lab7;

import java.util.ArrayList;
import java.util.List;

/*
LabsJava4 Task 5.1
 */
public class Text {
    private List<Sentence> sentences;

    Text() {
        this.sentences = new ArrayList<Sentence>();
    }

    Text(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void addSentence(Sentence sentence) {
        this.sentences.add(sentence);
    }

    public Sentence getTitle() {
        return this.sentences.get(0);
    }

    @Override
    public String toString() {
        String output = "";
        for (Sentence sentence : sentences) {
            output += sentence;

        }
        return output;
    }
}
