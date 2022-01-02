#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
      
@smoke
Feature: Login

As a user, I want to login to the Naukri website
     
Background:
	Given user navigates to Naukri website: "https://www.naukri.com"
	And user validates the Homepage title: "Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com"
	
Scenario Outline: In order to verify the login to Naukri as given user

	Then user opens the Login popup
	And user enters the "<userName>" Username
	And user enters the "<password>" Password
	And user clicks the Login button
	And user enters skills
	|Skills	|
	|Java		|
	|Selenium|
	And user enters experience and location
	|Experience			|Location	|
	|below 10 years	|Bengaluru|
	|above 10 years	|Pune			|
	Then user "<action>" successfully logged in

Examples:
|userName										|password		|action			|
|mayuresh.ahirrao@gmail.com	|Mayur31885	|shouldBe		|
|invalid										|invalid		|shouldNotBe|
	
	