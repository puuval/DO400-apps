package com.redhat.shipping;

import org.junit.jupiter.api.Test;

import com.redhat.shipping.ShippingCalculator.RegionNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class ShippingCalculatorTest {
/* 
    @Test
    public void canCalculateTheCostForARegion() throws RegionNotFoundException {
        ShippingCalculator calculator = new ShippingCalculator();
            assertEquals(0, calculator.costForRegion("A Region"));
    }
*/
    @Test
    public void onNARegionTheCostIs100() throws RegionNotFoundException {
        assertEquals(100, (new ShippingCalculator()).costForRegion("NA"));
    }

    @Test
    public void onLATAMRegionTheCostIs200() throws RegionNotFoundException {
        assertEquals(200, (new ShippingCalculator()).costForRegion("LATAM"));
    }

    @Test
    public void onEMEARegionTheCostIs300() throws RegionNotFoundException {
        assertEquals(300, (new ShippingCalculator()).costForRegion("EMEA"));
    }

    @Test
    public void onAPACRegionTheCostIs400() throws RegionNotFoundException {
        assertEquals(400, (new ShippingCalculator()).costForRegion("APAC"));
    }

    @Test
    public void onNonSupportedRegionARegionNotFoundExceptionIsRaised() {
        ShippingCalculator calculator = new ShippingCalculator();
            assertThrows( RegionNotFoundException.class, () -> calculator.costForRegion("Unknown Region"));
    }
}