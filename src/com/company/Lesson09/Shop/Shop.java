package com.company.Lesson09.Shop;


import java.util.*;

public class Shop {
    List<Product> listProducts = new ArrayList<>();

    public void correctionProductId(int id, String name, int price) {
        for (Product p : listProducts) {
            if (id == p.getId()) {
                p.setName(name);
                p.setPrice(price);
                return;
            }else {
                System.err.println("Продукта с таким id нету");
            }
        }
    }


    public void sortPriseUp() {
        listProducts.sort(Comparator.comparing(Product::getPrice).reversed());
        viewListProducts();
    }

    public void sortPriseDown() {
        listProducts.sort(Comparator.comparing(Product::getPrice));
        viewListProducts();
    }

    public void viewListProducts() {
        System.out.println(listProducts);
    }

    public void sortNew() {
        listProducts.sort(Comparator.comparing(Product::getIndex).reversed());
        viewListProducts();
    }

    public void sortOld() {
        listProducts.sort(Comparator.comparing(Product::getIndex));
        viewListProducts();
    }

    public void senIndexProduct (){
        int index=0;
        for (Product p : listProducts){
            p.setIndex(index);
            index++;
        }
    }

    public void addProduct(Product p) {
        for (Product product : listProducts) {
            if (product.getId() == p.getId()) {
                System.out.println("такой id занят");
                return;
            }
        }
        listProducts.add(p);
    }

    public boolean delete(int id) {
        if (id < listProducts.size()) {
            listProducts.remove(id);
            return true;
        } else {
            System.out.println("Такого продукта не существует");
            return false;
        }
    }

    public Integer indexId(int id) {
        int index = 0;
        for (Product p : listProducts) {
            if (id == p.getId()) {
                return index;
            }
            index++;
        }
        return null;
    }


}




