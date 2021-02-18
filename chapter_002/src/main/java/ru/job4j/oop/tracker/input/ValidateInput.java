package ru.job4j.oop.tracker.input;

public class ValidateInput extends ConsoleInput {
    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question);
                invalid = false;
            /*} catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again.");*/
            } catch (ArrayIndexOutOfBoundsException aio) {
                System.out.println("Please enter validate number of action");
            }
        } while (invalid);
        return value;
    }
}
