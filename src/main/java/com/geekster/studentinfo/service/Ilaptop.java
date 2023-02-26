package com.geekster.studentinfo.service;

import com.geekster.studentinfo.model.Laptop;

import java.util.List;

public interface Ilaptop {
    public List<Laptop> getLaptop(int id);
    public void addLaptop(Laptop laptop);
    public void deleteLaptop(int id);
    public void updateLaptop(int id, Laptop newLaptop);
}
