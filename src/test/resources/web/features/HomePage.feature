@homepage
Feature: Home Page

  Background:
    Given el usuario esta en la pagina"http://practice.automationtesting.in/"
    And hace click en el menu "Shop"
    And hace click en el menu "Home"


#1. Home Page with three sliders only
#2. Home page with three arrivals only

  @sliders @arrivals
  Scenario Outline: Validar  Home Page con solo tres <tipoElemento> exitoso
	# When hace click en el menu "Shop"
	# And hace click en el menu "Home"
	#Then se redirige a la home page
    When hace click en los elementos <tipoElemento>
    Then visualiza los tipo de elemento <tipoElemento> con tres elementos

    Examples:
      |tipoElemento|
      |Sliders	 |
      |Arrivals	 |