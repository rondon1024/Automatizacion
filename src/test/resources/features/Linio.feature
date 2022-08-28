@Linio
Feature: Realizar flujo de GUARDADOS PARA DESPUES

  Como usuario quiero ingresar y elegir los 6 productos
  de mayor precio para guardar para despues

  @LinioGuardado @CP-001
  Scenario Outline: Validar que se pueda realizar el GUARDADOS PARA DESPUES de los primeros 6 producto
    Given El usuario ingreso a la pagina "<IDTest>"
    And  Da clic en el pre ingreso de iniciar session
    And  Ingreso el correo y el password correcto "<IDTest>"
    And  Da clic al boton Ingresar
    And  Ingreso la busqueda de producto "<IDTest>"
    And  Da clic a buscar por mayor precio
    And  Da clic en el primer producto
    And  Da clic añadir al carrito
    And  Da clic en producto y añadimos los productos restante
    Then Validamos el boton el guardado para despues


    Examples:
      | IDTest |
      | 1      |


