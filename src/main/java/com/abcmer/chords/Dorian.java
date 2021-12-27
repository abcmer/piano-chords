package com.abcmer.chords;

public class Dorian extends Mode {

    void Dorian() {
        this.setStepIntervals();
    }

    void setStepIntervals() {
        stepIntervals.add(StepInterval.WHOLE);
        stepIntervals.add(StepInterval.HALF);
        stepIntervals.add(StepInterval.WHOLE);
        stepIntervals.add(StepInterval.WHOLE);
        stepIntervals.add(StepInterval.WHOLE);
        stepIntervals.add(StepInterval.HALF);
        stepIntervals.add(StepInterval.WHOLE);
    }

}
