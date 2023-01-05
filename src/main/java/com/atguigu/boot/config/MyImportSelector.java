package com.atguigu.boot.config;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;

public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        Set<String> annotationTypes = annotationMetadata.getAnnotationTypes();


        return new String[]{"com.atguigu.boot.bean.Car","com.atguigu.boot.bean.Pet"};
    }
}
