package com.techprimers.designpatterns.abstractfactory;

public interface OSFactory {

    Phone create(ManufacturerType manufacturerType);
}