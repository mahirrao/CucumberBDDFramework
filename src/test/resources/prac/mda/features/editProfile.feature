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
      
@sanity
Feature: Edit Profile

As a user, I want to edit the user profile on the Naukri website
     
Background:
	Given user navigates to Naukri website: "https://www.naukri.com"
	And user validates the Homepage title: "Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com"
	
Scenario: In order to update the user skils on Naukri as given user

	When user opens the edit profile page
	And user enters skills
	|Skills	|
	|Java		|
	|Selenium|
	Then user skills are updated
	
Scenario: In order to update the user experience and location on Naukri as given user	
	When user enters experience and location
	|Experience			|Location	|
	|below 10 years	|Bengaluru|
	|above 10 years	|Pune			|
	Then user sees the relevant jobs
	
Scenario: In order to upload the user Resume on Naukri as a given user
	When user uploads the resume
	Then the user sees the updated resume	
	
	