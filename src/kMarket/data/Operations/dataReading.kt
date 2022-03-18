package kMarket.data.Operations

import kMarket.data.User.*
import java.io.*;

/**
 * function read userdata from userdata.txt file
 *
 * @return array of users in inner class for system identify
 */
public fun readUserData(): Array<InnerUser> {
    var ret = emptyArray<InnerUser>()
    val userFile = File(".\\Userdata\\User.txt")
    val DIS = DataInputStream(FileInputStream(userFile))
    val d = BufferedReader(InputStreamReader(DIS))
    while(true){
        try {
            val rawUserData: String = d.readLine()
            val n = rawUserData.split(" ");
            val bal = n[4].toDouble();
            val sudo = n[5].toBoolean();
            val nret: kMarket.data.User.InnerUser = kMarket.data.User.InnerUser(n[0], n[1], n[2], n[3], bal, sudo);
            ret = ret + nret
        }
        catch(e: NullPointerException){
            return ret
        }
    }
}

/**
 * WARNING: this function may make userdata empty--use carefully.
 * @param inp array of userdata being written to the userfile.
 */
public fun writeUserData(inp:Array<InnerUser>){
    val userFile = File(".\\Userdata\\User.txt")
    val DOS = DataOutputStream(FileOutputStream(userFile))
    val w = BufferedWriter(OutputStreamWriter(DOS))
    for(u in inp){
        //to do: clear original file and write updated data
    }
}