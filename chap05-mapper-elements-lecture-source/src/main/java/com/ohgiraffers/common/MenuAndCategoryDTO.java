package com.ohgiraffers.common;

public class MenuAndCategoryDTO implements java.io.Serializable {

    private int code;
    private String name;
    private int price;
    private CategoryDTO category;
    private String orderableStatus;

    public MenuAndCategoryDTO() {}

    public MenuAndCategoryDTO(int code, String name, int price, CategoryDTO category, String orderableStatus) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.category = category;
        this.orderableStatus = orderableStatus;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CategoryDTO getCatogory() {
        return category;
    }

    public void setCatogory(CategoryDTO catogory) {
        this.category = catogory;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }

    @Override
    public String toString() {
        return "MenuAndCategoryDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", catogory=" + category +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
    }
}
