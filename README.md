## Literal 1
Se violan los principios: 
Single Responsability Principle: porque pastel y helado estaban realizando funciones que no le competen como showPrecioFinal() y calcularPrecioFinal().
Open-Closed Principle: porque si queremos añadir más postres se tenía que implementar totalmente cada método en clase nueva de postre.

## Literal 2
Se violan los principios:
Open-Closed Principle: porque si queríamos añadir más postres teníamos que modificar la clase OperacionerAderezo.
Dependency Inversion Principle: porque se usaba diferentes métodos para diferentes tipos de postres, no existía una abstracción hacia postre.

## Literal 3
Se violan los principios:
Single Responsability Principle: porque los métodos showPrecioFinal() y calcularPrecioFinal() no correspondían a las clases Helado y Pastel.

## Literal 4
Se violan los principios:
Open-Closed Principle: porque si se quería agregar un nuevo aderezo en la clase Aderezo había que modificar la clase.

## Literal 5
Se violan los principios:
Liskov Substitution: porque usar usarPastel() con LecheDeslactosada nos podría lanzar una excepción.

![image](https://user-images.githubusercontent.com/70599635/121609497-a075cd00-ca19-11eb-8f5e-176d0fd93b5f.png)

