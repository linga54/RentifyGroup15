package com.example.rentify;

import static org.junit.Assert.*;
import org.junit.Test;

public class ItemValidatorTest {

    @Test public void name_normal_isValid() { assertTrue(ItemValidator.isValidName("bike")); }
    @Test public void name_blank_isInvalid() { assertFalse(ItemValidator.isValidName("   ")); }
    @Test public void name_null_isInvalid() { assertFalse(ItemValidator.isValidName(null)); }

    @Test public void category_empty_isInvalid() { assertFalse(ItemValidator.isValidCategory("")); }
    @Test public void category_normal_isValid() { assertTrue(ItemValidator.isValidCategory("clothing")); }

    @Test public void fee_decimal_isValid() { assertTrue(ItemValidator.isValidFee("12.50")); }
    @Test public void fee_zero_isValid() { assertTrue(ItemValidator.isValidFee("0")); }
    @Test public void fee_negative_isInvalid() { assertFalse(ItemValidator.isValidFee("-5")); }
    @Test public void fee_text_isInvalid() { assertFalse(ItemValidator.isValidFee("abc")); }
    @Test public void fee_empty_isInvalid() { assertFalse(ItemValidator.isValidFee("")); }
    @Test public void fee_NaN_isInvalid() { assertFalse(ItemValidator.isValidFee("NaN")); }

    @Test public void time_zero_isInvalid() { assertFalse(ItemValidator.isValidTime("0")); }
    @Test public void time_positive_isValid() { assertTrue(ItemValidator.isValidTime("4")); }

    @Test public void validate_allGood_returnsNull() {
        assertNull(ItemValidator.validate("bike", "sports", "56", "4"));
    }

    @Test public void validate_emptyFee_returnsMessage() {
        assertEquals("Please enter a valid fee",
                ItemValidator.validate("bike", "sports", "", "4"));
    }

    @Test public void validate_missingName_reportedFirst() {
        assertEquals("Please enter a name",
                ItemValidator.validate("", "", "", ""));
    }
}