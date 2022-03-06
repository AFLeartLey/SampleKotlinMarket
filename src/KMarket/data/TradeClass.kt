package kMarket.data;
data class Trade(val tid:String,val itid:String,val tcost:Float,val ttime:String,val sid:String,val bid:String){
    init{
        val tradeId =  tid
        val itemId = itid
        val tradeCost = tcost
        val tradeTime = ttime
        val sellerId = sid
        val buyerId = bid
    }
}