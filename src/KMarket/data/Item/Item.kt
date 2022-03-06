package kMarket.Item

class Item(val iid:String,val iname:String,val iprice:Double,val descr:String,val sid:String,val utime:String,status: Int){
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