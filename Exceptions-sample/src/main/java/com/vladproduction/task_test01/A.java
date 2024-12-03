package com.vladproduction.task_test01;

import java.io.FileNotFoundException;
import java.io.IOException;

class A{
    public void f() throws IOException {}
}
class B extends A{
//    public void f() throws Exception {}
//    public void f() throws IOException {}
//    public void f() throws InterruptedException, IOException {}
//    public void f() throws IOException, FileNotFoundException {}
//    public void f() throws FileNotFoundException {}
    public void f() throws FileNotFoundException, InternalError {}
}

