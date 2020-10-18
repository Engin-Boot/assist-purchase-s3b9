package com.example.Monitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@org.springframework.stereotype.Service
public class ServiceImpl implements IService {
    @Autowired
    mydaoRepository dao;


    @Override
    public List<Product> getProducts() {
        return dao.findAll();
    }

    public Iterable<Product> save(List<Product> products) {
        return dao.saveAll(products);
        //return dao.save(products);
    }

    @Override
    public List<Product> getProductsAccParameters(boolean touchscreen, String weight, int size, String category, boolean transportMonitor, boolean waterproof) {
        List<Product> lprod=getProducts();
        List<Product> userRequestedProd=new ArrayList<>();
        for(int i=0;i<lprod.size();i++){
            if(lprod.get(i).isTouchscreen()==touchscreen && lprod.get(i).getSize()==size && lprod.get(i).isTransportMonitor()==transportMonitor && lprod.get(i).isWaterproof()==waterproof && lprod.get(i).getCategory().equals(category) && lprod.get(i).getWeight().equals(weight)){
                userRequestedProd.add(lprod.get(i));
            }
        }
        return userRequestedProd;
    }

    @Override
    public Optional<Product> getProductsById(int pid) {
        return dao.findById(pid);
    }

    @Override
    public Product addProduct(Product b) {
        return dao.save(b);
    }

    @Override
    public Product updateProduct(Product b) {
        return dao.save(b);
    }

    @Override
    public String deleteProductById(int pid) {
        dao.deleteById(pid);
        return("Product is deleted successsfully");
    }
}
