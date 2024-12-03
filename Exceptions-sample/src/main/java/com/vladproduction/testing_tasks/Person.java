package com.vladproduction.testing_tasks;

public class Person { }
class Father extends Person {
    public void dance() throws ClassCastException { }
}
class Home {
    public static void main(String[] args) {
        Person p = new Person();
        try {
            ((Father)p).dance();
        } catch (NullPointerException e) { }
        catch (ClassCastException e) { }
        catch (Exception e) { }
        catch (Throwable t) { }
    }
}

/*        catch (ClassCastException e) { }
        catch (NullPointerException e) { }
        catch (Exception e) { }
        catch (Throwable t) { }*/

/*
        finally
        { }*/
