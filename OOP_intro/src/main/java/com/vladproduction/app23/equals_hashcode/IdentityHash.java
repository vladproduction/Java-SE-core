package com.vladproduction.app23.equals_hashcode;

public class IdentityHash {

    public static void main(String[] args) {


        IdentityHash identityHash = new IdentityHash();
        System.out.println(identityHash.hashCode());//1

        int identityHashValue = System.identityHashCode(identityHash);
        System.out.println("identityHashValue = " + identityHashValue);

        IdentityHash identityHash2 = new IdentityHash();

    }

    @Override
    public int hashCode() {
        return 1;
    }
}
