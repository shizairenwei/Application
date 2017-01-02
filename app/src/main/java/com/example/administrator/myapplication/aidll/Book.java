package com.example.administrator.myapplication.aidll;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2016/12/7.
 */
public class Book implements Parcelable{

  private int id;
    private String name;

    public Book(int id,String name) {
        this.id = id;
        this.name=name;
    }
 private Book(Parcel source) {
      this.id=source.readInt();
     this.name=source.readString();
 }    public void setId(int id) {
        this.id = id;
    }

    public int getId() {

        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
  dest.writeInt(id);
        dest.writeString(name);
    }
   public static final Parcelable.Creator<Book>  CREATOR =new Parcelable.Creator<Book>() {
       @Override
       public Book createFromParcel(Parcel source) {
           return new Book(source);
       }

       @Override
       public Book[] newArray(int size) {
           return new Book[size];
       }

   };
}
