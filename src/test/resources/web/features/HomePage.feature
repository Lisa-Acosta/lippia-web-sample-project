@Homepage @Smoke
Feature: Home Page

  Background:
    Given el usuario esta en la pagina Automation Testing


  Scenario Outline: Visualizar <informacion> de un producto exitoso
    Then verifica los 'new arrivals' con solo tres productos
    When hace click en la imagen del producto <producto> de 'NEW ARRIVALS'
    And hace click en la pestaña de informacion <informacion> del producto
    Then visualiza la informacion <informacion> del producto con la <descripcion>

    @Description
    Examples:
      | informacion | producto         | descripcion                                                    |
      | DESCRIPTION | Thinking in Html | This book provides you with an intermediate knowledge of HTML. |

    @Reviews
    Examples:
      | informacion | producto             | descripcion                                   |
      | REVIEWS     | Selenium Ruby        | Be the first to review “Selenium Ruby”        |
      | REVIEWS     | Thinking in Html     | Be the first to review “Thinking in HTML”     |
      | REVIEWS     | Mastering Javascript | Be the first to review “Mastering JavaScript” |

