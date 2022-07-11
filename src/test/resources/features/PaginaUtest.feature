@Stories
  Feature: El cliente quiere registrar un nuevo usuario en la pagina web de Utest
    @ScenarioRegistro
    Scenario: El cliente quiere registrar un nuevo usuario
      Given el cliente quiere registrar un usuario en la pagina
      When el cliente llena los campos necesarios para el registro
        | _nombre  |_apellido  |_correo                  |_mes     |_dia  |_ano   |_ciudad                  |_zip |_pais   |_celular|_modelo|_sistema|_contrasena   |
        |Rodolfo   |Gonzales   |rodo@yopmail.com         |June     |22    |1990   |Cartagena de indias      |13232|Colombia|Apple   |iPad 4 |IOS 11.0|Nose123456789@|
      Then el cliente completa el registro luego de llenar toda la informacion
        |_validTxt     |
        |Complete Setup|
