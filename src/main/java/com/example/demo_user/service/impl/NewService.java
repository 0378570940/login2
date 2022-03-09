package com.example.demo_user.service.impl;

import com.example.demo_user.converter.NewConverter;
import com.example.demo_user.dto.NewDto;
import com.example.demo_user.entities.CategoryEntity;
import com.example.demo_user.entities.NewEntity;
import com.example.demo_user.repositories.CategoryRepositories;
import com.example.demo_user.repositories.NewRepositories;
import com.example.demo_user.service.iNewservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //làm logic trong service
public class NewService implements iNewservice {

    @Autowired //nhúng tát cả newRepositories
    private NewRepositories newRepositories;

    @Autowired //nhúng tát cả newRepositories
    private CategoryRepositories categoryRepositories;

    @Autowired //nhúng tất cả newConverter
    private NewConverter newConverter;

    @Override
    public NewDto save(NewDto newDto){
    CategoryEntity categoryEntity = categoryRepositories.findOneByCode(newDto.getCategoryCode());
    NewEntity newEntity =newConverter.toEntituy(newDto);
        NewEntity.setCategory(categoryEntity);
    newEntity =newRepositories.save(newEntity);
        return newConverter.toDto(newEntity);

//        NewEntity newEntity = new NewEntity();
//        if(newDto.getId() != null   ){
//            NewEntity oldNewEntity = newRepositories.findOne(newDto.getId());
//            newEntity = newConverter.toEntituy(newDto, oldNewEntity);
//        }else {
//            newEntity =newConverter.toEntituy(newDto);
//        }
//        CategoryEntity categoryEntity = categoryRepositories.findOneByCode(newDto.getCategoryCode());
//        NewEntity.setCategory(categoryEntity);
//        newEntity =newRepositories.save(newEntity);
//        return newConverter.toDto(newEntity);
    }
    //code ban đầu của save
//    CategoryEntity categoryEntity = categoryRepositories.findOneByCode(newDto.getCategoryCode());
//    NewEntity newEntity =newConverter.toEntituy(newDto);
//        NewEntity.setCategory(categoryEntity);
//    newEntity =newRepositories.save(newEntity);
//        return newConverter.toDto(newEntity);


    @Override
    public NewDto update(NewDto newDto) {
        NewEntity oldNewEntity = newRepositories.findOne(newDto.getId());
        NewEntity newEntity = newConverter.toEntituy(newDto, oldNewEntity);
        CategoryEntity categoryEntity = categoryRepositories.findOneByCode(newDto.getCategoryCode());
        NewEntity.setCategory(categoryEntity);
        newEntity =newRepositories.save(newEntity);
        return newConverter.toDto(newEntity);
    }
}
