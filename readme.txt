Automatización de la página de  Demo Blaze.

La automatización de este E2E sobre la página de “Demo Blaze” es realizada para un reto del Banco Pichincha.

La automatización de este sistema se ha realizado sobre el Framework de “Serenity BDD”, utilizando Selenium con código Java y Cucumber,
así como Gherkin para los temas que están directamente relacionados al escenario de pruebas utilizando lenguaje natural, todo lo anterior sobre el IDE Intellij.

Paso a Paso de cómo ejecutar la automatización.

Con el fin de poder correr la automatización de la Página “Demo Blaze”, esta se puede realizar de dos maneras principalmente.

1) Utilizando la clase de “RunerDemoBlazeTestSuite.java” en la definición de la clase propiamente.

public class RunerDemoBlazeTestSuite {


}

Utilizando el IDE Intellij podrá encontrar una flecha verde al lado izquierdo en la indentación de la clase,
que al dar click desplegará 3 tipos de opciones (Run, Debug y Run Coverage), esta opcion tambien puede ser visualizada al realizar clic derecho dentro de la clase,
podrá encontrar los mismos 3 tipos de opciones para ejecutar.

- Es importante tener en cuenta que al ejecutar la automatización de esta forma, el sistema no generará los reportes correspondiente a “Serenity BDD”

2) La otra manera de correr el codigo es por medio de la terminal, ya que esta automatización utiliza “Maven” al ir a la “Terminal” debemos ejecutar el siguiente comando:

mvn verify

Y al dar enter el sistema ejecutará el código y al finalizar generará un reporte automático del caso que fue ejecutado, con su respectivo resultado,
el reporte podrá visualizar en una URL como esta:

 SERENITY REPORTS
 Full Report: file:///C:/Users/dosting.quesada/Desktop/Auto%20yo/DemoBlazeSerenityBDD/target/site/serenity/index.html

