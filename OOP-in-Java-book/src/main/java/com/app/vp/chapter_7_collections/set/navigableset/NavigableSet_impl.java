package com.app.vp.chapter_7_collections.set.navigableset;

/**
 * NavigableSet implements Set;
 * -declares additional navigation methods (finding the closest element in some sense);
 * */
public class NavigableSet_impl {
    public static void main(String[] args) {

        //key navigation methods offered by NavigableSet<E>:

//        -lower(E element): Returns the element in the set that is strictly less than the given element,
//        or null if there is no such element.
//        -floor(E element): Returns the element in the set that is less than or equal to the given element,
//        or null if there is no such element.
//        -ceiling(E element): Returns the element in the set that is greater than or equal to the given element,
//        or null if there is no such element.
//        -higher(E element): Returns the element in the set that is strictly greater than the given element,
//        or null if there is no such element.
//        -descendingSet(): Returns a view of the set in descending order. This view also implements NavigableSet,
//        allowing you to perform navigation operations on the elements in reverse order.
        /*
        * Iterator<E> descendingIterator() - return iterator for elements of the set in descending order;
        * Iterator<E> iterator() - return iterator for elements of the set in ascending order
        * */
        /*
        * Operations for sub-sets:
        * -SortedSet<E> headSet(E toElement) return sub-set contains elements strictly less than toElement;
        * -SortedSet<E> tailSet(E fromElement) return sub-set contains elements bigger or equal forElement;
        * -SortedSet<E> subSet(E fromElement, E toElement) return sub-set contains elements in range (fromElement --> toElement);
        * */



    }
}
