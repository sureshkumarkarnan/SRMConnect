package com.srm.tasks.model;

import lombok.Data;

@Data
public class Task{
  private String id;
  private String userId;
  private String productName;
  private String TaskType;

 
  public Task withId(String id){
    this.setId( id );
    return this;
  }

  public Task withuserId(String userId){
    this.setUserId(userId);
    return this;
  }

  public Task withProductName(String productName){
    this.setProductName(productName);
    return this;
  }

  public Task withTaskType(String TaskType){
    this.setTaskType(TaskType);
    return this;
  }



}
