package com.abcmer.chords;

public enum StepInterval {
    HALF (.5),
    WHOLE (1)
    ;

    private final double stepValue;
    private StepInterval(double stepValue) {
        this.stepValue = stepValue;
    }
}
