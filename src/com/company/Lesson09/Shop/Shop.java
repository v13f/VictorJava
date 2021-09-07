package com.company.Lesson09.Shop;


import java.util.*;

public class Shop  {
    List<Product> listProducts = new ArrayList<>();


    public void sortPriseUp(){
        listProducts.sort(Comparator.comparing(Product::getPrice).reversed());
        viewListProducts();
    }

    public void sortPriseDown(){
        listProducts.sort(Comparator.comparing(Product::getPrice));
        viewListProducts();
    }

    public void viewListProducts() {
        System.out.println(listProducts);
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

    public boolean delete(int index) {
        if (index < listProducts.size()) {
            listProducts.remove(index);
            return true;
        } else {
            System.out.println("Такого продукта не существует");
            return false;
        }
    }



}




