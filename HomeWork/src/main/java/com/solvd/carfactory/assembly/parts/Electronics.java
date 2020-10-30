package com.solvd.carfactory.assembly.parts;

public class Electronics {
    private boolean gps;
    private boolean autoDrive;

    public Electronics(boolean gps, boolean autoDrive) {
        this.autoDrive = autoDrive;
        this.gps = gps;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isAutoDrive() {
        return autoDrive;
    }

    public void setAutoDrive(boolean autoDrive) {
        this.autoDrive = autoDrive;
    }


}
