package com.example.Monitor;

import java.util.List;
import java.util.Optional;

public interface IService {
    public List<Product> getProducts();
    public List<Product> getProductsAccParameters(boolean touchscreen,int size, String category,boolean transportMonitor);
    public Optional<Product> getProductsById(int pid);
    public Product addProduct(Product b);
    public Product updateProduct(Product b);
    public String deleteProductById(int pid);



}
