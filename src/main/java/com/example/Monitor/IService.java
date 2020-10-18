package com.example.Monitor;

import java.util.List;
import java.util.Optional;

public interface IService {
    public List<Product> getProducts();
    public List<Product> getProductsTouchScreen(boolean touchscreen);
    public List<Product> getProductsSize(int size);
    public List<Product> getProductsCategory(String category);
    public List<Product> getProductsTransportMonitor(boolean transportMonitor);
    public List<Product> getProductUserChoices(List<Product> touchscreenList,List<Product> sizeList, List<Product> categoryList, List<Product> transportMonitorList);
    public Optional<Product> getProductsById(int pid);
    public Product addProduct(Product b);
    public Product updateProduct(Product b);
    public String deleteProductById(int pid);



}
