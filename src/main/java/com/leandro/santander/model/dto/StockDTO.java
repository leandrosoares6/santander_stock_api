package com.leandro.santander.model.dto;

import java.time.LocalDate;

public class StockDTO {
  private String id;
  private String name;
  private Double price;
  private LocalDate date;
  private Double variation;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Double getVariation() {
    return variation;
  }

  public void setVariation(Double variation) {
    this.variation = variation;
  }
}
