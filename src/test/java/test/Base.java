package test;

import static org.junit.Assert.*;
import org.junit.internal.AssumptionViolatedException;

class Base {

    protected void run() {
        double r = Math.random();
        if (r < 0.4) {
            fail("oops");
        } else if (r < 0.5) {
            throw new AssumptionViolatedException("skipping");
        }
    }

}
