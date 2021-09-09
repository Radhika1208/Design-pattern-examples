package com.techprimers.designpatterns.abstractfactory;

public class AbstractFactoryExample {

    public static void main(String[] args) {


        OSFactory factory = AbstractPhoneFactory.getFactory(OSType.ANDROID);
        Phone OnePlus5T = factory.create(ManufacturerType.ONEPLUS);
        OnePlus5T.display();

        OSFactory wfactory = AbstractPhoneFactory.getFactory(OSType.WINDOWS);
        Phone nokiaPhone = wfactory.create(ManufacturerType.MICROSOFT);
        nokiaPhone.display();

        /**
         * DocumentBuilderFactory
         */

    }
}
