#Autor Diego Hennandez

@stories
Feature: Academy Choucair
  as a user, I want learn how to automate in Screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for automation course
    Given than brandon wants to learn automation at the Academy Choucair
    When he search for the course Metodología Bancolombia on the choucair academy platform
    Then he finds the course called resources etodolMogía Bancolombia

  @scenario2
  Scenario Outline: Search for a automation course
    Given than Rose want to learn automation at the Academy choucair
    | strUser   |  strPassword   |
    | <strUser> | <strPassword>      |
    When  she search for the course  on the Choucair Academy platform
    | strCourse  |
    |  <strCourse>  |
    Then she finds the course called
      | strCourse  |
    |  <strCourse>  |
    Examples:
      |  strUser |strPassword    | strCourse               |
      | 1032491411 | Choucair2021* | Metodología Bancolombia  |
