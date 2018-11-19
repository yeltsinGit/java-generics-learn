package com.leony.app;

import com.leony.home.GenericClassesAndInterfaces;
import com.leony.home.GenericCollections;
import com.leony.home.GenericMethods;
import com.leony.home.IntroductionToGenerics;

public class Main {

    public static void main(String[] args) {
        introductionToGenerics();
        genericCollections();
        genericClassesAndInterfaces();
        genericMethods();
    }

    private static void introductionToGenerics() {
        IntroductionToGenerics introductionToGenerics = new IntroductionToGenerics();

        printMessage("IntroductionToGenerics: use simple generics");
        introductionToGenerics.useSimpleGenerics();
    }

    private static void genericCollections() {
        GenericCollections genericCollections = new GenericCollections();

        printMessage("GenericCollections: play with generic collections");
        genericCollections.playWithGenericCollections();
    }

    private static void genericClassesAndInterfaces() {
        GenericClassesAndInterfaces genericClassesAndInterfaces = new GenericClassesAndInterfaces();

        printMessage("GenericClassesAndInterfaces: implementing a generic type");
        genericClassesAndInterfaces.implementingAGenericType();

        printMessage("GenericClassesAndInterfaces: passing a parameter to a generic type");
        genericClassesAndInterfaces.passingAParameterToAGenericType();

        printMessage("GenericClassesAndInterfaces: type bounds");
        genericClassesAndInterfaces.typeBounds();
    }

    private static void genericMethods() {
        GenericMethods genericMethods = new GenericMethods();

        printMessage("GenericMethods: play with generic methods");
        genericMethods.playWithGenericMethods();
    }

    private static void printMessage(String msg) {
        System.out.println("\n========= " + msg + " ===========\n");
    }
}
