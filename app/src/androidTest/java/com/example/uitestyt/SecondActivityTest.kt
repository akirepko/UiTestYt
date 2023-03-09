package com.example.uitestyt

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
class SecondActivityTest{
    @get:Rule var activityScenarioRule= activityScenarioRule<SecondActivity>()
    @Test
    fun checkingActivity(){
        onView(withId(R.id.second_activity_view))
            .check(matches(isDisplayed()))
    }
    @Test
    fun test_visibility_of_TextView_and_button(){
        onView(withId(R.id.tvSecondActivity))
            .check(matches(isDisplayed()))

        onView(withId(com.example.uitestyt.R.id.btnSecondActivity))
            .check(matches(isDisplayed()))
    }
    @Test
    fun test_visibillity_textView(){
        onView(withId(R.id.tvSecondActivity))
            .check(matches(
                withText(R.string.second_activity)
            ))
    }

}