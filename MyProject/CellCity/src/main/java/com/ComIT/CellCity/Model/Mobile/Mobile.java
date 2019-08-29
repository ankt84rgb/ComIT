package com.ComIT.CellCity.Model.Mobile;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mobile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String brand;
    private Integer price;
    private Integer screenSize;
    private Integer ramSize;
    private Integer storageSize;
    private Character isMemoryCardSupported;
    private Character isWirelessChargingSupported;
//    private String imageFilePath;

    public Mobile () { }

    public Mobile(String brand, Integer price, Integer screenSize, Integer ramSize, Integer storageSize, Character isMemoryCardSupported, Character isWirelessChargingSupported) {
        this.brand = brand;
        this.price = price;
        this.screenSize = screenSize;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.isMemoryCardSupported = isMemoryCardSupported;
        this.isWirelessChargingSupported = isWirelessChargingSupported;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Integer screenSize) {
        this.screenSize = screenSize;
    }

    public Integer getRamSize() {
        return ramSize;
    }

    public void setRamSize(Integer ramSize) {
        this.ramSize = ramSize;
    }

    public Integer getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(Integer storageSize) {
        this.storageSize = storageSize;
    }

    public Character getIsMemoryCardSupported() {
        return isMemoryCardSupported;
    }

    public void setIsMemoryCardSupported(Character isMemoryCardSupported) {
        this.isMemoryCardSupported = isMemoryCardSupported;
    }

    public Character getIsWirelessChargingSupported() {
        return isWirelessChargingSupported;
    }

    public void setIsWirelessChargingSupported(Character isWirelessChargingSupported) {
        this.isWirelessChargingSupported = isWirelessChargingSupported;
    }
}

