
Feature: PayDocker Login Test

 Scenario: Valid login

  Given User opens PayDocker login page
  When User enters email "arsh@bakuun.com"
  And User enters password "123456!!"
  And User clicks continue button
  Then Login process executed
  
