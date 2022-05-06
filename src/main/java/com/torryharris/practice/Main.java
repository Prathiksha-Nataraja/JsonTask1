package com.torryharris.practice;

import io.vertx.core.json.JsonObject;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {


  public static void json(){
    JsonObject js =new JsonObject();
    js.put("fullname","Kathleen Brown");
    Map m1 = new LinkedHashMap(2);
    m1.put("street","23505 Stewart Track");
    m1.put("city","Mandiana");
    js.put("address",m1);
    System.out.println(js.encodePrettily());
  }
  public static void main(String[] args){
    Main main = new Main();
    json();
  }

}
