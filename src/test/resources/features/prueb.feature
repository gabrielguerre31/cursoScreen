# Autor: Gabriel Guerrero
  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
    @scenario1
    Scenario: Search for a automation course
      Given than Gabriel want to learn automation at the academy Choucair
      | strUser    | strPassword   |
      | 1024577943 | Choucair2021* |
      When he search for the course  on the Choucair academy platform
      | strCourse                         |
      | Guias Tecnicas Analista Financial |
      Then he finds the course called
      | strCourseName                       |
      | Guías Técnicas - Analista Financial |

