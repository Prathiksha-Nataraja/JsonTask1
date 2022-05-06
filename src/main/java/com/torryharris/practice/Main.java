package com.torryharris.practice;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {


  public static void json() {
    JsonObject js = new JsonObject();
      js.put("fullname", "Kathleen Brown");
      Map m1 = new LinkedHashMap(2);
      m1.put("street", "23505 Stewart Track");
      m1.put("city", "Mandiana");
      js.put("address", m1);
    Map m2 = new LinkedHashMap(3);
    m2.put("PAN", "AMJXH1456H");
    m2.put("Adhar", "8889 8856 3338 2234");
    m2.put("employee id", "[\"123\",\"234\",\"567\"]");

    js.put("ids", m2);
    for(int i=0;i<js.size() ;i++) {
      System.out.println(js.encodePrettily());
    }
    }

  public static void main(String[] args){
    Main main = new Main();
    json();
  }

}
