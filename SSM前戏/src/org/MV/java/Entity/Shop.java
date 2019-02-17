package org.MV.java.Entity;

public class Shop {
    private int shopID;
    private String shopName;

    public Shop() {
    }

    public Shop(int shopID, String shopName) {
        this.shopID = shopID;
        this.shopName = shopName;
    }

    public int getShopID() {
        return shopID;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopID=" + shopID +
                ", shopName='" + shopName + '\'' +
                '}';
    }
}
