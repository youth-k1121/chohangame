package com.example.cho_han_game.navigation

object NavigationRegistry {

    private val _navigationSet = mutableSetOf<Navigation>()
    val navigationSet: Set<Navigation>
        get() = _navigationSet

    fun <T: Navigation> add(nav: Navigation, clazz: Class<T>) {
        if (navigationSet.filterIsInstance(clazz).isNotEmpty()) {
            error("${clazz.simpleName} is already added")
        }
        _navigationSet.add(nav)
    }

    fun clear() {
        _navigationSet.clear()
    }

    inline fun <reified T : Navigation> of(): T = navigationSet.filterIsInstance<T>().first()

}

interface Navigation