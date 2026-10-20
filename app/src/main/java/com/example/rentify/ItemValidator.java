package com.example.rentify;

public final class ItemValidator {

    private ItemValidator() {}

    public static boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    public static boolean isValidCategory(String category) {
        return category != null && !category.trim().isEmpty();
    }

    public static boolean isValidFee(String fee) {
        Float value = parse(fee);
        return value != null && value >= 0;
    }

    public static boolean isValidTime(String time) {
        Float value = parse(time);
        return value != null && value > 0;
    }

    /** Returns an error message, or null if everything is valid. */
    public static String validate(String name, String category, String fee, String time) {
        if (!isValidName(name)) return "Please enter a name";
        if (!isValidCategory(category)) return "Please select a category";
        if (!isValidFee(fee)) return "Please enter a valid fee";
        if (!isValidTime(time)) return "Please enter a valid rental time";
        return null;
    }

    private static Float parse(String text) {
        if (text == null) return null;
        try {
            float value = Float.parseFloat(text.trim());
            return (Float.isNaN(value) || Float.isInfinite(value)) ? null : value;
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
