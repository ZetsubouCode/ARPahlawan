package com.tugasakhir.arpan;

import android.os.Parcel;
import android.os.Parcelable;

public class Pahlawan implements Parcelable {
    private String name;
    private String detail;
    private String details;
    private int photo;

    public Pahlawan() {

    }

    protected Pahlawan(Parcel in) {
        name = in.readString();
        detail = in.readString();
        details = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Pahlawan> CREATOR = new Creator<Pahlawan>() {
        @Override
        public Pahlawan createFromParcel(Parcel in) {
            return new Pahlawan(in);
        }

        @Override
        public Pahlawan[] newArray(int size) {
            return new Pahlawan[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDetails() { return details; }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(detail);
        dest.writeString(details);
        dest.writeInt(photo);
    }
}
