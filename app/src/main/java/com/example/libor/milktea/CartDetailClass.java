package com.example.libor.milktea;

import java.io.Serializable;

public class CartDetailClass implements Serializable {

    private int teaNo;
    private int Size;
    private int Sugar;
    private int Qty;
    private boolean Order;

    public int getTeaNo() {
        return teaNo;
    }

    public void setTeaNo(int teaNo) {
        this.teaNo = teaNo;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        this.Size = size;
    }

    public int getSugar() {
        return Sugar;
    }

    public void setSugar(int sugar) {
        this.Sugar = sugar;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int qty) {
        this.Qty = qty;
    }

    public boolean isOrder() {
        return Order;
    }

    public void setOrder(boolean order) {
        this.Order = order;
    }
}
