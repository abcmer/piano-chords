package com.abcmer.chords;

public class Note {
    NaturalNote note;
    Boolean isSharp = false;
    Boolean isFlat = false;

    public Note(NaturalNote note, Boolean isSharp, Boolean isFlat) {
        if (isSharp && isFlat) {
            throw new RuntimeException("Note cannot be both sharp and flat");
        } else {
            this.note = note;
            this.isSharp = isSharp;
            this.isFlat = isFlat;
        }
    }

    public String toString() {
        if (this.isSharp) {
            return this.note.toString() + '♯';
        } else if (this.isFlat) {
            return this.note.toString() + '♭';
        } else {
            return this.note.toString();
        }

    }

}
