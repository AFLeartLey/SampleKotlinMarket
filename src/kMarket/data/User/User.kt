package kMarket.data.User

open class User {

    var userID: String = ""
    var userPassword: String = ""
    var userContact: String? = ""
    var address: String? = ""
    protected var balance: Double? = 0.0
    protected var sudo: Boolean = false

    fun printself() {
        println(userID + " " + userPassword)
    }
}