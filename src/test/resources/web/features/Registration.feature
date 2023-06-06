@Registration @Smoke
Feature: Registracion

  Background: My Account
    Given el usuario esta en la pagina Automation Testing
    And hace click en el menu My Account

  @RegistrationFallida
  Scenario Outline: Registracion fallida
    When ingresa un usuario <usuario>
    And ingresa una password <password>
    And hace click en el boton REGISTER
    Then visualiza un mensaje <mensaje>

    Examples:
      | usuario                   | password | mensaje                               |
      | sherlock.holmes@gmail.com |          | Please enter an account password.     |
      |                           |          | Please provide a valid email address. |
