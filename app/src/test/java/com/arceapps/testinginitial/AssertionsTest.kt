package com.arceapps.testinginitial

import org.junit.Assert.*
import org.junit.Test

/**
 * Created by ArceApps on 13/08/2023.
 * Project name: TestingInitial.
 */
class AssertionsTest {
    @Test
    fun getArrayTest() {
        val assertions = Assertions()
        // expected value
        val array = arrayOf(21, 34, 78)
        assertArrayEquals("Mensaje de error personalizado", array, assertions.getLuckyNumbers())
    }

    @Test
    fun getNameTest() {
        val assertions = Assertions()
        val name = "Oscar"
        val otherName: String = "Pedro"
        assertEquals(name, assertions.getName())
        assertNotEquals(otherName, assertions.getName())
    }

    @Test
    fun checkHumanTest() {
        val assertions = Assertions()
        val bot: User = User("Bot", 0, false)
        val human: User = User("Human", 30, true)

        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(human))
    }

    @Test
    fun checkNullUserTest() {
        val user = null
        assertNull(user)
        val assertions: Assertions = Assertions()
        assertNull(assertions.checkHuman(user))
    }

    @Test
    fun checkUserNoNullTest() {
        val human = User("Human", 30, true)
        assertNotNull("Esto es un usuario que no es null", human)
    }
}