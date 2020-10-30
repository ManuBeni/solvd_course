package com.solvd.linkedlist;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
    private static final Logger logger = LogManager.getLogger(Test.class);
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("Mario");
        linkedList.add("Manuel");
        linkedList.add("Christian");
        linkedList.add("Raul");
        logger.info(linkedList.toString());
        linkedList.add("Sara", 2);
        logger.info("Added object Sara on index 2: {}", linkedList.toString());
        logger.info("Size: {}",linkedList.size());
        logger.info("Index 2: {}",linkedList.get(2));
        logger.info("Index 3: {}",linkedList.get(3));
        linkedList.remove("Manuel");
        logger.info("Object Manuel removed: {}",linkedList.toString());
        linkedList.reverse();
        logger.info("Reversed list: {}",linkedList.toString());
    }
}
