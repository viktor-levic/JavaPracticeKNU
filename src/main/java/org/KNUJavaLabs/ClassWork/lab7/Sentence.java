package org.KNUJavaLabs.ClassWork.lab7;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/*
LabsJava4 Task 5.1
 */

public class Sentence {
    List<Word> sentence;

    Sentence() {
        this.sentence = new ArrayList<>();
    }

    Sentence(Word word) {
        this.sentence = new ArrayList<Word>();
        this.sentence.add(word);
    }

    Sentence(List<Word> words) {
        this.sentence = words;
    }

    public void setSentence(List<Word> sentence) {
        this.sentence = sentence;
    }

    public List<Word> getSentence() {
        return sentence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence1 = (Sentence) o;
        return Objects.equals(sentence, sentence1.sentence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentence);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "sentence=" + sentence +
                '}';
    }
}
