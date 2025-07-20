package com.eld_project.lessons.Draft.mobilePhone;

public enum Made_In {
    VIETNAM ("Made in vietnam"),
    CHINA ("Made in vietnam"),
    INDIA ("Made in vietnam");

    String value;

    Made_In(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
