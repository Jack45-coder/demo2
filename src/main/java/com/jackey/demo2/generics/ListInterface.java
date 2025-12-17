package com.jackey.demo2.generics;

import java.util.List;

public interface ListInterface {
//    void addNumbers(List<? extends  Number> list);

    void addNumbers(List<? super Number> list);
}
