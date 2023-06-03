@MyAccount @Smoke
Feature: My Account

  Background: My Account
    Given el usuario esta en la pagina Automation Testing
    And hace click en el menu My Account

  @MyAccountDetails
  Scenario Outline: Visualizar detalles de la cuenta exitoso
    When ingresa usuario <usuario>
    And ingresa password <password>
    And hace click al boton LOGIN
    Then visualiza mensaje <mensaje>
    When hace click en el link My Account
    And hace click en el link Account Details
    Then visualiza la pagina de detalles de su cuenta
    And esta activo boton guardar

    Examples:
      | usuario               | password    | mensaje |
      | lisa.acosta@gmail.com | Ninguna01$? | Hello   |

  @MyAccountLogout
  Scenario Outline: Logout exitoso
    When ingresa usuario <usuario>
    And ingresa password <password>
    And hace click al boton LOGIN
    Then visualiza mensaje <mensaje>
    When hace click en el link My Account
    And hace click en el link Log Out
    Then se redirige a la pagina  del Login

    Examples:
      | usuario               | password    | mensaje |
      | lisa.acosta@gmail.com | Ninguna01$? | Hello   |