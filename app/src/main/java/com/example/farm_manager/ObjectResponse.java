package com.example.farm_manager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ObjectResponse<T> {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("first_name")
    @Expose
    private String first_name;
    @SerializedName("last_name")
    @Expose
    private String last_name;
    @SerializedName("member_number")
    @Expose
    private String member_number;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("phone_number")
    @Expose
    private String phone_number;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("farms")
    @Expose
    private String farms;
    @SerializedName("completed")
    @Expose
    private boolean completed;

    public int getId() {
        return id;
    }

    public String getFirst_name() { return first_name;}

    public String getLast_name() {
        return last_name;
    }
    public  String getMember_number(){return member_number;}
    public String getGender(){return gender;}
    public String getPhone_number(){return phone_number;}
    public String getEmail(){return email;}
    public String getFarms(){return farms;}

    public boolean isCompleted() {
        return completed;
    }
}


