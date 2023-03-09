package com.example.uitestyt

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{
    @get:Rule
    var activityScenarioRule= activityScenarioRule<MainActivity>()

    @Test//тест на проверку открытия Main Activity
    fun checkActivityVisibility(){
        onView(withId(R.id.layout_mainActivity))
            .check(matches(isDisplayed()))
    }

    @Test//  проверка наличия текста и кнопки  на Main Activity
    fun checkingTextVisibility(){
        onView(withId(R.id.tvMainActivity))
            .check(matches(isDisplayed()))

        onView(withId((R.id.btnMainActivity)))
            .check(matches(isDisplayed()))

    }
    @Test// проверка на соотвествие текста
    fun testTestIsMainActivity (){
        onView(withId(R.id.tvMainActivity))
            .check(
                matches
                (withText(
                R.string.main_activity
            )))

    }
    @Test// переход на вторую активити
    fun clickTestOnMainButton(){
        onView(withId(R.id.btnMainActivity))
            .perform((click()))

        onView(withId(R.id.second_activity_view))
            .check(matches(isDisplayed()))

    }
}