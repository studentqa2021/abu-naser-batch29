package com.cucumber.test;

public @interface CucumberOption {

	String[] plugin();

	String[] features();

	String[] glue();

}
