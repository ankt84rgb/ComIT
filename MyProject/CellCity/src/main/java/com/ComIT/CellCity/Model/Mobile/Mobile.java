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
    private Long price;
    private double screenSize;
    private Integer ramSize;
    private Integer storageSize;
    private Boolean isMemoryCardSupported;
    private Boolean isWirelessChargingSupported;
    private String imageFilePath;

    public Mobile () { }

    public Mobile(String brand, Long price, double screenSize, Integer ramSize, Integer storageSize, Boolean isMemoryCardSupported, Boolean isWirelessChargingSupported, String imageFilePath) {
        this.brand = brand;
        this.price = price;
        this.screenSize = screenSize;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.isMemoryCardSupported = isMemoryCardSupported;
        this.isWirelessChargingSupported = isWirelessChargingSupported;
        this.imageFilePath = imageFilePath;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
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

    public Boolean getMemoryCardSupported() {
        return isMemoryCardSupported;
    }

    public void setMemoryCardSupported(Boolean memoryCardSupported) {
        isMemoryCardSupported = memoryCardSupported;
    }

    public Boolean getWirelessChargingSupported() {
        return isWirelessChargingSupported;
    }

    public void setWirelessChargingSupported(Boolean wirelessChargingSupported) {
        isWirelessChargingSupported = wirelessChargingSupported;
    }

    public String getImageFilePath() {
        return imageFilePath;
    }

    public void setImageFilePath(String imageFilePath) {
        this.imageFilePath = imageFilePath;
    }
}
