package com.example.demo_user.dto;

import lombok.Data;

@Data
public class NewDto extends BaseDto<NewDto> {
    private  String title;
    private  String comtent;
    private  String shortDescription;
    private  String categoryCode;
    private  String thumbnall;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComtent() {
        return comtent;
    }

    public void setComtent(String comtent) {
        this.comtent = comtent;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getThumbnall() {
        return thumbnall;
    }

    public void setThumbnall(String thumbnall) {
        this.thumbnall = thumbnall;
    }

    public void setShortdescription(String shortDescription) {
        
    }

    public void setCategorycode(String categoryCode) {
    }
}
