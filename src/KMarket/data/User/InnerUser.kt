package kMarket.data.User

public class InnerUser(val uid:String,val up:String,val uc:String,val ad:String,val ba:Double,val sud:Boolean): User() {
    init{
        userID = uid
        userPassword = up
        userContact = uc
        address = ad
        balance = ba
        sudo = sud
    }
}