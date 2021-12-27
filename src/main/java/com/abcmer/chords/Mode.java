package com.abcmer.chords;

import java.util.ArrayList;

abstract class Mode {
    ArrayList<StepInterval> stepIntervals;

    ArrayList<StepInterval> getStepIntervals() {
        return this.stepIntervals;
    }
}
