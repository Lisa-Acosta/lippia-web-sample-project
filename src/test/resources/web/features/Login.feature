@Login
Feature: Login
  @Smoke
  Scenario Outline: Login exitoso
    Given el usuario esta en la pagina Automation Testing
    And hace click en el menu My Account
    When ingresa el usuario <usuario>
    And ingresa la password <password>
    And hace click en el boton LOGIN
    Then se redirige a la pagina de su cuenta
    And visualiza el saludo <saludo>

    Examples:
      | usuario               | password    | saludo |
      | lisa.acosta@gmail.com | Ninguna01$? | Hello  |


