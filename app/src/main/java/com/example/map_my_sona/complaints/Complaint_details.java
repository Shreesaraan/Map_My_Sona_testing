package com.example.map_my_sona.complaints;

public class Complaint_details {
    private String com_by_name;
    private String com_by_mob;
    private String com_by_dep;
    private String com_txt;
    private String sn_no;
    private String make;
    private String model;
    private String procurement;
    private String power_rating;
    private String wperiod;
    private String wexpiry;
    private String ins_by;
    private String ins_date;
    private String mob;
    private String date;
    private String time;
    private String key;
    private String UniqueId;
    private String status;

    public Complaint_details(String com_by_name, String com_by_mob, String com_by_dep, String com_txt, String sn_no, String make, String model, String procurement, String power_rating, String wperiod, String wexpiry, String ins_by, String ins_date, String mob, String date, String time, String key, String uniqueId, String status) {
        this.com_by_name = com_by_name;
        this.com_by_mob = com_by_mob;
        this.com_by_dep = com_by_dep;
        this.com_txt = com_txt;
        this.sn_no = sn_no;
        this.make = make;
        this.model = model;
        this.procurement = procurement;
        this.power_rating = power_rating;
        this.wperiod = wperiod;
        this.wexpiry = wexpiry;
        this.ins_by = ins_by;
        this.ins_date = ins_date;
        this.mob = mob;
        this.date = date;
        this.time = time;
        this.key = key;
        UniqueId = uniqueId;
        this.status = status;
    }

    public Complaint_details() {
    }

    public String getCom_by_name() {
        return com_by_name;
    }

    public void setCom_by_name(String com_by_name) {
        this.com_by_name = com_by_name;
    }

    public String getCom_by_mob() {
        return com_by_mob;
    }

    public void setCom_by_mob(String com_by_mob) {
        this.com_by_mob = com_by_mob;
    }

    public String getCom_by_dep() {
        return com_by_dep;
    }

    public void setCom_by_dep(String com_by_dep) {
        this.com_by_dep = com_by_dep;
    }

    public String getCom_txt() {
        return com_txt;
    }

    public void setCom_txt(String com_txt) {
        this.com_txt = com_txt;
    }

    public String getSn_no() {
        return sn_no;
    }

    public void setSn_no(String sn_no) {
        this.sn_no = sn_no;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcurement() {
        return procurement;
    }

    public void setProcurement(String procurement) {
        this.procurement = procurement;
    }

    public String getPower_rating() {
        return power_rating;
    }

    public void setPower_rating(String power_rating) {
        this.power_rating = power_rating;
    }

    public String getWperiod() {
        return wperiod;
    }

    public void setWperiod(String wperiod) {
        this.wperiod = wperiod;
    }

    public String getWexpiry() {
        return wexpiry;
    }

    public void setWexpiry(String wexpiry) {
        this.wexpiry = wexpiry;
    }

    public String getIns_by() {
        return ins_by;
    }

    public void setIns_by(String ins_by) {
        this.ins_by = ins_by;
    }

    public String getIns_date() {
        return ins_date;
    }

    public void setIns_date(String ins_date) {
        this.ins_date = ins_date;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUniqueId() {
        return UniqueId;
    }

    public void setUniqueId(String uniqueId) {
        UniqueId = uniqueId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}