



package ch07_interface;

class TestA{}

interface InterA{}

class TestB extends TestA{}

class TestZ extends TestB{}

class TestC implements InterA {}

class TestD{}

// class TestE extends TestA, TestD {} // class는 다중 상속 X

class TestE extends TestA implements InterA{}

interface InterB extends InterA{}

interface InterC{}

class TestF implements InterA, InterC{} // interface 다중 상속 O

public class InheritanceWay {

}



























