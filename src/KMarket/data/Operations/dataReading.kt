package kMarket.data.Operations

import kMarket.data.User.*
import java.io.*;

public fun UserRead(): InnerUser{
    val userFile: File = File(".\\Userdata\\User.txt")
    val DIS: DataInputStream = DataInputStream(FileInputStream(userFile))
    val d: BufferedReader = BufferedReader(InputStreamReader(DIS))
    var rawUserData:String = d.readLine()
    val n = rawUserData.split(" ");
    val bal = n[4].toDouble();
    val sudo = n[5].toBoolean();
    val ret:kMarket.data.User.InnerUser = kMarket.data.User.InnerUser(n[0],n[1],n[2],n[3],bal,sudo);
    return ret
}

public fun ReadUserData(): Array<InnerUser> {
    var ret: Array<InnerUser>;
    try{
        val nReadUser:InnerUser = UserRead()
    }
    return ret
}

//to do:
//change user read into user array
//do userdata writing