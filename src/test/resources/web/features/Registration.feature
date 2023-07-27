@Registration
Feature: Registracion

  Background: My Account
    Given el usuario esta en la pagina Automation Testing
    And hace click en el menu My Account

  @RegistrationExitosa
  Scenario Outline: Registracion Exitosa
    When ingresa un usuario <usuario>
    And ingresa una password <password>
    And hace click en el boton REGISTER
    Then visualiza el saludo <saludo>

    Examples:
      | usuario                    | password     | saludo |
      | sherlock2.holmes@gmail.com | Cualquiera01 | Hello  |

  @RegistrationFallida
  Scenario Outline: Registracion fallida
    When ingresa un usuario <usuario>
    And ingresa una password <password>
    And hace click en el boton REGISTER
    Then visualiza un mensaje <mensaje>

    Examples:
      | usuario                   | password   | mensaje                               |
      | lisa.acosta@lalala        |            | Please provide a valid email address. |
      |                           | cualquiera | Please provide a valid email address. |
      | sherlock.holmes@gmail.com |            | Please enter an account password.     |
      |                           |            | Please provide a valid email address. |