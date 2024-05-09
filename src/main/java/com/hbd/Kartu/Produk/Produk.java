package com.hbd.Kartu.Produk;

import com.hbd.Kartu.Kartu;

public class Produk extends Kartu {
    private final int harga;
    private final int tambahanBerat;

    public Produk(String nama, int harga, int tambahanBerat) {
        super(nama);
        this.harga = harga;
        this.tambahanBerat = tambahanBerat;
    }

    public int getHarga() {
        return this.harga;
    }

    public int getTambahanBerat() {
        return this.tambahanBerat;
    }
}
