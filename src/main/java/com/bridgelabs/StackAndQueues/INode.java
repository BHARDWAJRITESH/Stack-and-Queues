package com.bridgelabs.StackAndQueues;

interface INode<K> {
    K getKey();
    void setKey(K key);

    INode getNext();
    void setNext(INode next);
}

