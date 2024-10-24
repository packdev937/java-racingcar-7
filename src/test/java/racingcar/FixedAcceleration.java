package racingcar;

import racingcar.domain.acceleration.Acceleration;

public class FixedAcceleration implements Acceleration {

    private final int fixedCriterion;

    public FixedAcceleration(int fixedCriterion) {
        this.fixedCriterion = fixedCriterion;
    }

    @Override
    public int generateForwardCriterion() {
        return fixedCriterion;
    }
}
