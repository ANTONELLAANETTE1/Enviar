package com.example.enviar;

import android.os.Parcel;
import android.os.Parcelable;

public class Persona implements Parcelable {

    private String nombre;
    private String sexo;

    public Persona() {
    }

    public Persona(String nombre, String sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nombre);
        dest.writeString(this.sexo);
    }

    public void readFromParcel(Parcel source) {
        this.nombre = source.readString();
        this.sexo = source.readString();
    }

    protected Persona(Parcel in) {
        this.nombre = in.readString();
        this.sexo = in.readString();
    }

    public static final Creator<Persona> CREATOR = new Creator<Persona>() {
        @Override
        public Persona createFromParcel(Parcel source) {
            return new Persona(source);
        }

        @Override
        public Persona[] newArray(int size) {
            return new Persona[size];
        }
    };
}
