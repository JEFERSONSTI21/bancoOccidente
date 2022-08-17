Feature:Comprar vuelo en despegar

  Scenario Outline:  Solicitud de vuelo

    Given Me encuentro en la pagina de inicio de despegar
    When Selecciono origen y destino
    And Selecciono las fechas y continuo
    And Selecciono el primer vuelo
    Then Valido la pagina de registro datos

    Examples:
      |tiempoCarguePagina|iteracion|
##@externaldata@10001
      |10|1|