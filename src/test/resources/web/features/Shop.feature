  @Smoke @Shop
  Feature: Shop

  Background:
    Given el usuario esta en la pagina Automation Testing
    And hace click en el menu Shop

#1. Shop Filter by Price funcionality

  @FilterPrice
  Scenario Outline: Filtrar productos entre dos precios exitoso
    When filtra el precio entre inicio <inicio> y fin <fin>
    And hace click en el boton FILTER
    Then visualiza los productos que tienen precios entre inicio <inicio> y fin <fin>

    Examples:
      | inicio | fin |
      | 150    | 200 |

#2. Shop Product Categories funcionality

  @Categories
  Scenario Outline: Filtrar productos por categoria <categoria> exitoso
    When hace click en la categoria <categoria>
    Then visualiza los productos de la categoria <categoria>

    Examples:
      | categoria  |
      | Android    |
      | HTML       |
      | JavaScript |
      | selenium   |

#3.Shop Default Sorting funcionality popularity
#4.Shop Default Sorting funcionality average rating
#5.Shop Default Sorting funcionality newness
#6.Shop Default Sorting funcionality price: low to high
#7.Shop Default Sorting funcionality price: high to low

  @sorting
  Scenario Outline: Ordenar productos por item <item> exitoso
    When hace click en el item <item> del menu desplegable del ordenamiento
    Then visualiza los productos ordenados por ese item


    Examples:
      | item                       |
      | Sort by popularity         |
      | Sort by average rating     |
      | Sort by newness            |
      | Sort by price: low to high |
      | Sort by price: high to low |