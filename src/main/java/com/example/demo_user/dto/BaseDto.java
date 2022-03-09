package com.example.demo_user.dto;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class BaseDto<T> {
    private long id;
    private String createdBy;
    private Data createdData;
    private String modifiedBy;
    private Data modifiedData;
    private List<T> listResult = new ArrayList<>();

    public List<T> getListResult() {
        return listResult;
    }

    public void setListResult(List<T> listResult) {
        this.listResult = listResult;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Data getCreatedData() {
        return createdData;
    }

    public void setCreatedData(Data createdData) {
        this.createdData = createdData;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Data getModifiedData() {
        return modifiedData;
    }

    public void setModifiedData(Data modifiedData) {
        this.modifiedData = modifiedData;
    }
}
