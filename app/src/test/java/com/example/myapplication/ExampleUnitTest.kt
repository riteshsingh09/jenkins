package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(SplashActivity.isValidEmail("name@email.com"))
    }

    @Test
    fun userValidator_ReturnsFalse() {
        assertTrue(SplashActivity.isValidUser("name"))
    }


    @Test
    fun passwordValidator_ReturnsTrue() {
        assertTrue(SplashActivity.isValidPassword(""))
    }

    @Test
    fun passwordValidator() {
        assertEquals(false,SplashActivity.isValidPassword(""))
    }
}
