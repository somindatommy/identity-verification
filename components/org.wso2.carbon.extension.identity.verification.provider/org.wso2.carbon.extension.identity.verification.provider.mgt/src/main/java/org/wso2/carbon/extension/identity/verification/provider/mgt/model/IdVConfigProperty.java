package org.wso2.carbon.extension.identity.verification.provider.mgt.model;

public class IdVConfigProperty {

    private String name;
    private String value;

    public String getValue() {

        return value;
    }

    public void setValue(String value) {

        this.value = value;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

}