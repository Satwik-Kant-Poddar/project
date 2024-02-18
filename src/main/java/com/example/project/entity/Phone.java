package com.example.project.entity;

import jakarta.persistence.*;

@Entity(name="phone")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "display")
    private String display;

    @Column(name = "os")
    private String os;

    @Column(name = "body_type")
    private String body_type;

    @Column(name = "memory")
    private String memory;

    @Column(name = "camera")
    private String camera;

    @Column(name = "sound")
    private String sound;

    @Column(name = "battery")
    private String battery;

    @Column(name = "charing")
    private String charing;

    @Column(name = "launch_date")
    private String launch_date;

    public Phone() {
    }

    public Phone(int id, String name, String display, String os, String body_type, String memory, String camera, String sound, String battery, String charing, String launch_date) {
        this.id = id;
        this.name = name;
        this.display = display;
        this.os = os;
        this.body_type = body_type;
        this.memory = memory;
        this.camera = camera;
        this.sound = sound;
        this.battery = battery;
        this.charing = charing;
        this.launch_date = launch_date;
    }

    public Phone(String name, String display, String os, String body_type, String memory, String camera, String sound, String battery, String charing, String launch_date) {
        this.name = name;
        this.display = display;
        this.os = os;
        this.body_type = body_type;
        this.memory = memory;
        this.camera = camera;
        this.sound = sound;
        this.battery = battery;
        this.charing = charing;
        this.launch_date = launch_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBody_type() {
        return body_type;
    }

    public void setBody_type(String body_type) {
        this.body_type = body_type;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getCharing() {
        return charing;
    }

    public void setCharing(String charing) {
        this.charing = charing;
    }

    public String getLaunch_date() {
        return launch_date;
    }

    public void setLaunch_date(String launch_date) {
        this.launch_date = launch_date;
    }

    @Override
    public String toString() {
        return "phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", display='" + display + '\'' +
                ", os='" + os + '\'' +
                ", body_type='" + body_type + '\'' +
                ", memory='" + memory + '\'' +
                ", camera='" + camera + '\'' +
                ", sound='" + sound + '\'' +
                ", battery='" + battery + '\'' +
                ", charing='" + charing + '\'' +
                ", launch_date='" + launch_date + '\'' +
                '}';
    }

}
