package com.example.converter;

import android.view.View;
import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.espresso.assertion.ViewAssertions;
import org.junit.Before;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest {

    @Before
    public void setUp() {
        // Launch the MainActivity for each test
        ActivityScenario.launch(MainActivity.class);
    }

    @Test
    public void testCelsiusToFahrenheitConversion() {
        // Simulate entering value "25" in the input field
        onView(withId(R.id.inputValue)).perform(typeText("25"));

        // Simulate selecting the "Celsius to Fahrenheit" conversion
        onView(withId(R.id.unitTypeSpinner)).perform(ViewActions.scrollTo(), click());
        onView(withText("Celsius to Fahrenheit")).perform(click());

        // Simulate clicking the "Convert" button
        onView(withId(R.id.convertButton)).perform(click());

        // Check if the result is correct (result should be 77.0)
        onView(withId(R.id.resultTextView)).check(ViewAssertions.matches(withText("Result: 77.0")));
    }

    @Test
    public void testKilometersToMilesConversion() {
        // Test the conversion from Kilometers to Miles
        onView(withId(R.id.inputValue)).perform(typeText("10"));

        onView(withId(R.id.unitTypeSpinner)).perform(ViewActions.scrollTo(), click());
        onView(withText("Kilometers to Miles")).perform(click());

        onView(withId(R.id.convertButton)).perform(click());

        onView(withId(R.id.resultTextView)).check(ViewAssertions.matches(withText("Result: 6.21371")));
    }
}
