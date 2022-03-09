package com.example.demo_user.converter;

import com.example.demo_user.dto.NewDto;
import com.example.demo_user.entities.NewEntity;
import org.springframework.stereotype.Component;

@Component //lưu NewConverter vào Newservice
public class NewConverter {
    public NewEntity toEntituy(NewDto dto){
        NewEntity entity = new NewEntity();
        entity.setTitle(dto.getTitle());
        entity.setComtent(dto.getComtent());
        entity.setShortdescription(dto.getShortDescription());
        entity.setThumbnall(dto.getThumbnall());
        return entity;
    }

    public NewDto toDto(NewEntity entity){
        NewDto dto = new NewDto();
        dto.setTitle(entity.getTitle());
        dto.setComtent(entity.getComtent());
        dto.setShortdescription(entity.getShortDescription());
        dto.setThumbnall(entity.getThumbnall());
        return dto;
    }

    public NewEntity toEntituy(NewDto dto, NewEntity entity){
        entity.setTitle(dto.getTitle());
        entity.setComtent(dto.getComtent());
        entity.setShortdescription(dto.getShortDescription());
        entity.setThumbnall(dto.getThumbnall());
        return entity;
    }
}
