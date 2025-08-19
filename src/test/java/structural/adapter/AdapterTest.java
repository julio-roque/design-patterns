package structural.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Adapter Design Pattern")
class AdapterTest {
    RoundHole hole;
    RoundPeg roundPeg;
    SquarePeg smallSquarePeg;
    SquarePeg largeSquarePeg;

    @BeforeEach
    void setUp() {
        hole = new RoundHole(5);
        roundPeg = new RoundPeg(5);
        smallSquarePeg = new SquarePeg(2);
        largeSquarePeg = new SquarePeg(20);

    }

    @Test
    @DisplayName("Fit Round peg and Round hole")
    void fitRoundPegAndRoundHole() {

        // Test round peg
        Assertions.assertTrue(hole.fits(roundPeg), "Round peg should fit in the round hole");

        // Test square pegs
        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        assert hole.fits(smallSquarePegAdapter) : "Small square peg should fit in the round hole";

        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);
        assert !hole.fits(largeSquarePegAdapter) : "Large square peg should not fit in the round hole";
    }

    @Test
    @DisplayName("Fit Square peg and Round hole")
    void fitSquarePegAndRoundHole() {
        // Test square pegs
        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        Assertions.assertTrue(hole.fits(smallSquarePegAdapter), "Small square peg should fit in the round hole");

        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);
        Assertions.assertFalse(hole.fits(largeSquarePegAdapter), "Large square peg should not fit in the round hole");
    }


}
