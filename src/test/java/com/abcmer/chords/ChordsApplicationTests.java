package com.abcmer.chords;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ChordsApplicationTests {

	@Test
	void createSharpNotes() {

		Note c = new Note(NaturalNote.C, true, false);
		assert c.toString().equals("C♯");

		Note d = new Note(NaturalNote.D, true, false);
		assert d.toString().equals("D♯");

		Note e = new Note(NaturalNote.E, true, false);
		assert e.toString().equals("E♯");

		Note f = new Note(NaturalNote.F, true, false);
		assert f.toString().equals("F♯");

		Note g = new Note(NaturalNote.G, true, false);
		assert g.toString().equals("G♯");

		Note a = new Note(NaturalNote.A, true, false);
		assert a.toString().equals("A♯");

		Note b = new Note(NaturalNote.B, true, false);
		assert b.toString().equals("B♯");
	}

	@Test
	void createFlatNotes() {

		Note c = new Note(NaturalNote.C, false, true);
		assert c.toString().equals("C♭");

		Note d = new Note(NaturalNote.D, false, true);
		assert d.toString().equals("D♭");

		Note e = new Note(NaturalNote.E, false, true);
		assert e.toString().equals("E♭");

		Note f = new Note(NaturalNote.F, false, true);
		assert f.toString().equals("F♭");

		Note g = new Note(NaturalNote.G, false, true);
		assert g.toString().equals("G♭");

		Note a = new Note(NaturalNote.A, false, true);
		assert a.toString().equals("A♭");

		Note b = new Note(NaturalNote.B, false, true);
		assert b.toString().equals("B♭");
	}

	@Test
	void createNaturalNotes() {

		Note c = new Note(NaturalNote.C, false, false);
		assert c.toString().equals("C");

		Note d = new Note(NaturalNote.D, false, false);
		assert d.toString().equals("D");

		Note e = new Note(NaturalNote.E, false, false);
		assert e.toString().equals("E");

		Note f = new Note(NaturalNote.F, false, false);
		assert f.toString().equals("F");

		Note g = new Note(NaturalNote.G, false, false);
		assert g.toString().equals("G");

		Note a = new Note(NaturalNote.A, false, false);
		assert a.toString().equals("A");

		Note b = new Note(NaturalNote.B, false, false);
		assert b.toString().equals("B");
	}

	@Test
	void createInvalidNotes() {

		try {
			Note c = new Note(NaturalNote.C, true, true);
			assert c.toString().equals("C");
		} catch (RuntimeException e) {
			System.out.println(e);
			assert e.toString().equals("java.lang.RuntimeException: Note cannot be both sharp and flat");
		}
	}

//	@Test
//	void CIonian() {
//
//		Ionian CIonian = new Ionian();
//		assert CIonian.getStepIntervals().get(0) == StepInterval.WHOLE;
//		assert CIonian.getStepIntervals().get(1) == StepInterval.WHOLE;
//		assert CIonian.getStepIntervals().get(2) == StepInterval.HALF;
//		assert CIonian.getStepIntervals().get(3) == StepInterval.WHOLE;
//		assert CIonian.getStepIntervals().get(4) == StepInterval.WHOLE;
//		assert CIonian.getStepIntervals().get(5) == StepInterval.WHOLE;
//		assert CIonian.getStepIntervals().get(6) == StepInterval.HALF;
	}


}
