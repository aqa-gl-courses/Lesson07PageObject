package com.aqacourses.pageobject.utils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Data {

    @XmlElement private String url;

    @XmlElement private String email;

    @XmlElement private String password;

    /**
     * Get URL from xml file
     *
     * @return String represents URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * Get email from xml file
     *
     * @return String represents email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Get password from xml file
     *
     * @return String represents password
     */
    public String getPassword() {
        return password;
    }
}
