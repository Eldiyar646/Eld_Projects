package com.eld_project.lessons.Draft.mobilePhone;

public interface Mobile_Phone_Interface {

    void addPhone(String name, String model, Phone_Options phone_options, Made_In madeIn);

    void listPhoneByName(String name);

    void countPhoneByName(String name);


}