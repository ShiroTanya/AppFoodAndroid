package com.example.lib.common;

public class Url {
    private static String STAND_URL = "192.168.1.8";

    //CALL Retrofit IPv4
    public static final String AppFood_Url = "http://192.168.1.8/AppFood/";


    public static final String postUserInfo= "http://"+ STAND_URL +"/AppFood/thongtinkhachhang.php";
    public static final String postBillDetail = "http://"+ STAND_URL +"/AppFood/chitietdonhang.php";


    //CALL API NODE JSON
//    public static final String BASE_URL = "http://192.168.1.8:3000/";
    public static final String BASE_URL = "http://10.0.2.2:3000/";
}