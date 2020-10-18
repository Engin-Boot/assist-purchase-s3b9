package com.example.Monitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@org.springframework.stereotype.Service
public class ServiceImpl implements IService {
    List<Product> touchscreenList=new ArrayList<>();
    List<Product> sizeList=new ArrayList<>();
    List<Product> categoryList=new ArrayList<>();
    List<Product> transportMonitorList=new ArrayList<>();
    MydaoRepository dao;
    @Autowired
    public void setdao(MydaoRepository dao)
    {
        this.dao = dao;
    }

    @Override
    public List<Product> getProducts() {
        return dao.findAll();
    }

    public Iterable<Product> save(List<Product> products) {
        return dao.saveAll(products);
        //return dao.save(products);
    }

    @Override
    public List<Product> getProductsTouchScreen(boolean touchscreen){
        List<Product> lprod=getProducts();
        for(int i=0;i<lprod.size();i++)
        {
            if(lprod.get(i).isTouchscreen()==touchscreen)
                touchscreenList.add(lprod.get(i));
        }
        return touchscreenList;
    }

    @Override
    public List<Product> getProductsSize(int size){
        List<Product> lprod=getProducts();
        for(int i=0;i<lprod.size();i++)
        {
            if(lprod.get(i).getSize()==size)
                sizeList.add(lprod.get(i));
        }
        return sizeList;
    }

    @Override
    public List<Product> getProductsCategory(String category){
        List<Product> lprod=getProducts();
        for(int i=0;i<lprod.size();i++)
        {
            if(lprod.get(i).getCategory().equals(category))
                categoryList.add(lprod.get(i));
        }
        return categoryList;
    }

    @Override
    public List<Product> getProductsTransportMonitor(boolean transportMonitor){
        List<Product> lprod=getProducts();
        for(int i=0;i<lprod.size();i++)
        {
            if(lprod.get(i).isTransportMonitor()==transportMonitor)
                transportMonitorList.add(lprod.get(i));
        }
        return transportMonitorList;
    }






//    @Override
//    public List<Product> getProductsAccParameters(boolean touchscreen, int size, String category, boolean transportMonitor) {
//        List<Product> lprod=getProducts();
//        List<Product> userRequestedProd=new ArrayList<>();
//        for(int i=0;i<lprod.size();i++){
//            if(lprod.get(i).isTouchscreen()==touchscreen && lprod.get(i).getSize()==size && lprod.get(i).isTransportMonitor()==transportMonitor && lprod.get(i).getCategory().equals(category)){
//                userRequestedProd.add(lprod.get(i));
//            }
//        }
//        return userRequestedProd;
//    }

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
