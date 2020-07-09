package com.qnszt.udpandroidqnszn;

public class Measurement {
    static String Name;
    static Integer Duration;
    static Integer Delay;

    public static String getName() {
        return Name;
    }

    public static void setName(String name) {
        Name = name;
    }

    public static Integer getDuration() {
        return Duration;
    }

    public static void setDuration(String duration) {
        setDuration(Integer.parseInt(duration));
    }

    public static void setDuration(Integer duration) {
        Duration = duration;
    }

    public static Integer getDelay() {
        return Delay;
    }

    public static void setDelay(String delay) {
        setDelay(Integer.parseInt(delay));
    }

    public static void setDelay(Integer delay) {
        Delay = delay;
    }
}
