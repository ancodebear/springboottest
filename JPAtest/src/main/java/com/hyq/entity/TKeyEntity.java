package com.hyq.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * PROJECT springboottest
 *
 * @author hyq
 * @version 1.0
 * @date 2019/7/22 10:55
 */
@Entity
@Table(name = "t_key", schema = "qrdb", catalog = "")
@IdClass(TKeyEntityPK.class)
public class TKeyEntity {
    private String keyid;
    private String key;

    @Id
    @Column(name = "keyid")
    public String getKeyid() {
        return keyid;
    }

    public void setKeyid(String keyid) {
        this.keyid = keyid;
    }

    @Id
    @Column(name = "key")
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
        TKeyEntity that = (TKeyEntity) o;
        return Objects.equals(keyid, that.keyid) &&
                Objects.equals(key, that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyid, key);
    }
}
