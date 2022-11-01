package com.despegar.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/", glue="com.despegar.stepDefinitions",tags = {"@case2"}, snippets = SnippetType.CAMELCASE)
public class AlojamientosRunner {}
