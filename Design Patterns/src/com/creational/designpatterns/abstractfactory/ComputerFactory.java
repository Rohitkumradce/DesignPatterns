package com.creational.designpatterns.abstractfactory;

import com.creational.designpatterns.factory.Computer;

public class ComputerFactory {
	 
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}