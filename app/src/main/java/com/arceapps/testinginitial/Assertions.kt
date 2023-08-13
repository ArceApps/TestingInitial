package com.arceapps.testinginitial

/**
 * Created by ArceApps on 13/08/2023.
 * Project name: TestingInitial.
 */
class Assertions {
    private val user = User("Oscar", 30)

    fun getLuckyNumbers(): Array<Int> {
        return arrayOf(21, 34, 78)
    }

    fun getName(): String {
        return user.name
    }

    fun checkHuman(user: User) : Boolean {
        return user.isHuman
    }

    fun checkHuman(user: User? = null) : Boolean? {
        if (user == null) return null
        return user.isHuman
    }

    fun isAdult(user: User) : Boolean {
        if (!user.isHuman) return true
        return user.age >= 18
    }
}