package com.hyq;


public class TKey implements TKeyInter{

  private String keyid;
  private String key;

  public TKey() {
  }

  @Override
  public String toString() {
    return "TKey{" +
            "keyid='" + keyid + '\'' +
            ", key='" + key + '\'' +
            '}';
  }

  public TKey(String keyid, String key) {
    this.keyid = keyid;
    this.key = key;
  }

  public String getKeyid() {
    return keyid;
  }

  public void setKeyid(String keyid) {
    this.keyid = keyid;
  }


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

}
interface TKeyInter{
  String getKeyid();
  void setKeyid(String keyid);
  String getKey();
  void setKey(String key);
}
