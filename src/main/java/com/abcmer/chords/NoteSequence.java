package com.abcmer.chords;

import java.util.ArrayList;

abstract class NoteSequence {

    ArrayList<Note> notes;

    abstract void setNotes();
    abstract void getNotes();
}
