@Homepage
Feature: Home Page

  Background:
    Given el usuario esta en la pagina Automation Testing

  Scenario Outline: Validar  Home Page con solo tres <tipoElemento> exitoso
    Then verifica los elementos <tipoElemento> con tres elementos

    Examples:
      | tipoElemento |
      | Sliders      |
      | Arrivals     |


  Scenario Outline: Visualizar <informacion> de un producto exitoso
    When hace click en la imagen del producto <producto> de 'NEW ARRIVALS'
    And hace click en la pestaña de informacion <informacion> del producto
    Then visualiza la informacion <informacion> del producto con <descripcion>

    @Description
    Examples:
      | informacion | producto             | descripcion                                                             |
      #| DESCRIPTION | Selenium Ruby        | The Selenium WebDriver Recipes book is a quick problem-solving          |
      | DESCRIPTION | Thinking in Html     | This book provides you with an intermediate knowledge of HTML.          |
      | DESCRIPTION | Mastering Javascript | It would seem that everything that needs to be written about JavaScript |


    @Reviews
    Examples:
      | informacion | producto             | descripcion                                   |
      | REVIEWS     | Selenium Ruby        | Be the first to review “Selenium Ruby”        |
      | REVIEWS     | Thinking in Html     | Be the first to review “Thinking in HTML”     |
      | REVIEWS     | Mastering Javascript | Be the first to review “Mastering JavaScript” |

