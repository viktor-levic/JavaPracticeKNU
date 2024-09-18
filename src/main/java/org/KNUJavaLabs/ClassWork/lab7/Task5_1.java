package org.KNUJavaLabs.ClassWork.lab7;

import org.KNUJavaLabs.ClassWork.lab7.Word;
import org.KNUJavaLabs.ClassWork.lab7.Text;

import java.util.ArrayList;
import java.util.List;

/*
LabsJava4 Task 5.1
 */
public class Task5_1 {
    public static void main(String[] args) {
        Word word1 = new Word("AAAAA");
        Word word2 = new Word("BBBBB");
        Word word3 = new Word("CCCCC");
        List<Word> words1 = new ArrayList<Word>() {
            {
                add(word1);
                add(word2);
                add(word3);
            }
        };
        Sentence sentence1 = new Sentence();
        sentence1.setSentence(words1);
        List<Word> sentence1_get = sentence1.getSentence();
        Word word4 = new Word("DDDDD");
        List<Word> words2 = new ArrayList<Word>() {
            {
                add(word1);
                add(word2);
                add(word3);
                add(word4);
            }
        };
        Sentence sentence2 = new Sentence(words2);
        Word word5 = new Word("EEEEE");
        List<Word> words3 = new ArrayList<Word>() {
            {
                add(word1);
                add(word2);
                add(word3);
                add(word4);
                add(word5);
            }
        };
        Sentence sentence3 = new Sentence(words3);
        List<Sentence> sentences = new ArrayList<Sentence>() {
            {
                add(sentence1);
                add(sentence2);
                add(sentence3);
            }
        };
        Text text = new Text(sentences);
        Sentence sentence4 = new Sentence(new Word("FFFFF"));
        text.addSentence(sentence4);
        for (Sentence sentence : text.getSentences()) {
            for (Word word : sentence.getSentence()) {
                System.out.print(word.getWord() + " ");
            }
            System.out.println();
        }
        System.out.println("The title of the text (1-st sentence of the text): ");
        for (Word word : text.getTitle().getSentence()) {
            System.out.print(word.getWord() + " ");
        }
    }
}
