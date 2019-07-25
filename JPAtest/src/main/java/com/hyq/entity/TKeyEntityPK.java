package com.hyq.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * PROJECT springboottest
 *
 * @author hyq
 * @version 1.0
 * @date 2019/7/22 10:55
 */
public class TKeyEntityPK implements Serializable {
    private String keyid;
    private String key;

    @Column(name = "keyid")
    @Id
    public String getKeyid() {
        return keyid;
    }

    public void setKeyid(String keyid) {
        this.keyid = keyid;
    }

    @Column(name = "key")
    @Id
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TKeyEntityPK that = (TKeyEntityPK) o;
        return Objects.equals(keyid, that.keyid) &&
                Objects.equals(key, that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyid, key);
    }
}
