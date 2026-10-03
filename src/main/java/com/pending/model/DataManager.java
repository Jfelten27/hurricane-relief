package com.pending.model;

import java.io.Serializable;

public class DataManager<T extends Serializable> {
    private String filename;

    public DataList<T> read() {
        return null;
    }

    public DataList<T> readUUIDList() {
        return null;
    }

    public void write(DataList<T> dataList) {

    }
}
