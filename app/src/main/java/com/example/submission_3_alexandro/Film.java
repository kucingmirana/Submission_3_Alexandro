package com.example.submission_3_alexandro;

import android.os.Parcel;
import android.os.Parcelable;

public class Film implements Parcelable {
    private String Name;
    private String Detail;
    private String Duration;
    private String ReleaseDate;
    private int photo;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        ReleaseDate = releaseDate;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    protected Film(Parcel in) {
        Name = in.readString();
        Detail = in.readString();
        Duration = in.readString();
        ReleaseDate = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Film> CREATOR = new Creator<Film>() {
        @Override
        public Film createFromParcel(Parcel in) {
            return new Film(in);
        }

        @Override
        public Film[] newArray(int size) {
            return new Film[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Name);
        dest.writeString(Detail);
        dest.writeString(Duration);
        dest.writeString(ReleaseDate);
        dest.writeInt(photo);
    }
}
