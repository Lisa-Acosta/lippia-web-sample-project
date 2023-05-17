@Login @Smoke
Feature: Login
  Background: My Account
    Given el usuario esta en la pagina Automation Testing
    And hace click en el menu My Account

@LoginExitoso
  Scenario Outline: Login exitoso
    When ingresa el usuario <usuario>
    And ingresa la password <password>
    And hace click en el boton LOGIN
    Then se redirige a la pagina de su cuenta
    And visualiza el saludo <saludo>

    Examples:
      | usuario               | password    | saludo |
      | lisa.acosta@gmail.com | Ninguna01$? | Hello  |

@LoginFallido
  Scenario Outline: Login fallido
    When ingresa el usuario <usuario>
    And ingresa la password <password>
    And hace click en el boton LOGIN
    Then visualiza el mensaje <mensaje>

    Examples:
      | usuario               | password    | mensaje                                                   |
      | lisita.acosta@gmail   | password    | Error: A user could not be found with this email address. |
      | lisa.acosta@gmail.com |             | Error: Password is required.                              |
      |                       | Ninguna01$? | Error: Username is required.                              |


