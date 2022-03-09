package kMarket.data.User


/**
 *
 * Admin class.
 */
class Administrator(): User() {
    init{
        userID = "admin"
        userPassword = "alpine"
        userContact = null
        address = null
        balance = null
        sudo = true
    }
}
