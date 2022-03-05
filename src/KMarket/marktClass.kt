package kMarket
/**
    * User Class.
    *
    * */
open class User {

    var userid: String = ""
    var upswd: String = ""
    var usercont: String? = ""
    var address: String? = ""
    var balance: Double? = 0.0
    var sudo: Boolean = false

    public fun printself() {
        println(userid + " " + upswd)
    }
}

/**
 *
 * Admin class.
 */
class admin(): User() {
    init{
        userid = "admin"
        upswd = "Administrator"
        usercont = null
        address = null
        balance = null
        sudo = true
    }
}

class nUser(uid:String,username:String,pswd:String,ucont:String,addr:String): User(){
    init{
        userid = uid
        upswd = pswd
        usercont = ucont
        address = addr
    }
}

class item(val iid:String,val iname:String,val iprice:Double,val descr:String,val sid:String,val utime:String,status: Int){
    init{
        val itemID = iid
        val itemName = iname
        var itemPrice = iprice
        var itemDescrption = descr
        val sellerID = sid
        val uploadTime = utime
        var itemStatus = status
    }

    /**
     * The entrance of Item property change.
     *
     * @param [pkind] property kind: 1 for description and 2 for price
     *
     * @return None.
     */
    public fun itemEdit(pkind:Int){
        if(pkind == 1){
            //function doing description change
            return;
        }
        if(pkind == 2){
            //function doing price change
            return;
        }
        println("Property not found.");
        return;
    }
}

data class info(val tid:String,val itid:String,val tcost:Float,val ttime:String,val sid:String,val bid:String){
    init{
        val tradeId =  tid
        val itemId = itid
        val tradeCost = tcost
        val tradeTime = ttime
        val sellerId = sid
        val buyerId = bid
    }
}
