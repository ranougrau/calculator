package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testoperations.TestAddition;
import testoperations.TestMultiplication;
import testoperations.TestOperation;
import testoperations.TestSubstraction;

@RunWith(Suite.class)
@SuiteClasses({
 TestAddition.class,
 TestMultiplication.class,
 TestOperation.class,
 TestSubstraction.class,
})

public class FullSuite {}
