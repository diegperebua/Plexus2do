@Test
  Feature: Probar web de plexus
    Scenario: Como navegante de la www puedo ver las ofertas de empleo en la web de plexus
      Given Estoy en la web de plexus
      When Click en boton unete al equipo
      Then puedo ver las ofertas de empleo de la web
      And  Subo mi CV en Subir CV
      Then Pulso Enviar CV
