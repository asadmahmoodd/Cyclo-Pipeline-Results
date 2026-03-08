import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PlanWarehouseHeatTest {

    private final PlanWarehouseHeat sut = new PlanWarehouseHeat();

    @Test
    void testOuterElseFlagFalseWhileTrue() {
        int actual = sut.planWarehouseHeat(0, 5, 0L, false, 'A');
        int repeat = sut.planWarehouseHeat(0, 5, 0L, false, 'A');
        assertEquals(repeat, actual);

        int different = sut.planWarehouseHeat(1, 5, 0L, false, 'A');
        assertNotEquals(actual, different);
    }

    @Test
    void testOuterTrueFlagTrueWhileElse() {
        int actual = sut.planWarehouseHeat(10, 0, 7L, true, 'Z');
        int repeat = sut.planWarehouseHeat(10, 0, 7L, true, 'Z');
        assertEquals(repeat, actual);

        int toggledFlag = sut.planWarehouseHeat(10, 0, 7L, false, 'Z');
        assertNotEquals(actual, toggledFlag);
    }

    @Test
    void testMixedOuterBranchesGradeLow() {
        int actual = sut.planWarehouseHeat(1, 1, 2L, false, 'B');
        int repeat = sut.planWarehouseHeat(1, 1, 2L, false, 'B');
        assertEquals(repeat, actual);

        int gradeHigh = sut.planWarehouseHeat(1, 1, 2L, false, 'N');
        assertNotEquals(actual, gradeHigh);
    }

    @Test
    void testDivisibleByThreePathAndPositiveB() {
        int actual = sut.planWarehouseHeat(6, 2, 13L, false, 'M');
        int repeat = sut.planWarehouseHeat(6, 2, 13L, false, 'M');
        assertEquals(repeat, actual);

        int negativeB = sut.planWarehouseHeat(6, -2, 13L, false, 'M');
        assertNotEquals(actual, negativeB);
    }

    @Test
    void testOffsetThreeConditionWithLowGradeAndQuotaMultipleOf53() {
        int actual = sut.planWarehouseHeat(2, 5, 53L, true, 'L');
        int repeat = sut.planWarehouseHeat(2, 5, 53L, true, 'L');
        assertEquals(repeat, actual);

        int gradeHigh = sut.planWarehouseHeat(2, 5, 53L, true, 'Z');
        assertNotEquals(actual, gradeHigh);
    }

    @Test
    void testNegativeInputsAndComparison() {
        int actual = sut.planWarehouseHeat(-1, -1, 4L, false, 'A');
        int repeat = sut.planWarehouseHeat(-1, -1, 4L, false, 'A');
        assertEquals(repeat, actual);

        int differentB = sut.planWarehouseHeat(-1, 2, 4L, false, 'A');
        assertNotEquals(actual, differentB);
    }
}