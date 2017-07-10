package com.acme.a3csci3130;

import com.google.firebase.database.Exclude;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Class that defines how the data will be stored in the
 * Firebase databse. This is converted to a JSON format
 */

public class Business implements Serializable {

    public String b_num; //business number
    public String name; //business name
    public String p_bus; //primary business
    public String address; //business address
    public String province_territory; //province or territory of business

    public Business() {
        // Default constructor required for calls to DataSnapshot.getValue
    }

    public Business(String b_num, String name, String p_bus, String address, String province_territory){
        this.b_num= b_num;
        this.name = name;
        this.p_bus = p_bus;
        this.address = address;
        this.province_territory = province_territory;
    }

    @Exclude
    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("b_num", b_num);
        result.put("name", name);
        result.put("p_bus", p_bus);
        result.put("address", address);
        result.put("province_territory", province_territory);

        return result;
    }
}
