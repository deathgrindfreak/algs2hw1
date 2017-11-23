package com.deathgrindfreak;

public class WordNet {
    // constructor takes the name of the two input files
    public WordNet(String synsets, String hypernyms) {
        nullCheck(synsets, hypernyms);
    }

    // returns all WordNet nouns
    public Iterable<String> nouns() {
        return null;
    }

    // is the word a WordNet noun?
    public boolean isNoun(String word) {
        nullCheck(word);
        return false;
    }

    // distance between nounA and nounB (defined below)
    public int distance(String nounA, String nounB) {
        nullCheck(nounA, nounB);
        return 0;
    }

    // a synset (second field of synsets.txt) that is the common ancestor of nounA and nounB
    // in a shortest ancestral path (defined below)
    public String sap(String nounA, String nounB) {
        nullCheck(nounA, nounB);
        return "";
    }

    // do unit testing of this class
    public static void main(String[] args) {
    }

    private void nullCheck(Object... args) {
        for (Object a: args) {
            if (a == null) throw new IllegalArgumentException("Argument cannot be null!");
        }
    }
}
