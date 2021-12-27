package com.abcmer.chords;

import java.util.ArrayList;

public class Ionian extends Mode {

    void Ionian() {
        this.setStepIntervals();
    }

    ArrayList<StepInterval> getStepIntervals = super.getStepIntervals();

    void setStepIntervals() {
        stepIntervals.add(StepInterval.WHOLE);
        stepIntervals.add(StepInterval.WHOLE);
        stepIntervals.add(StepInterval.HALF);
        stepIntervals.add(StepInterval.WHOLE);
        stepIntervals.add(StepInterval.WHOLE);
        stepIntervals.add(StepInterval.WHOLE);
        stepIntervals.add(StepInterval.HALF);
    }
}
