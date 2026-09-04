# Evaluación FDS - Corte 1 (Partes 4 y 5)

Solución de la Parte 4 (Modelado UML) y la Parte 5 (Implementación Java SE 11)
de la evaluación de Fundamentos de Diseño de Software.

## Estructura

```
FDS_Evaluacion_Corte1/
├── Parte4_UML/
│   ├── clinica_veterinaria.puml   # Código fuente del diagrama (PlantUML)
│   └── ClinicaVeterinaria.png     # Diagrama de clases renderizado
└── Parte5_Java/
    ├── src/
    │   ├── IRastreable.java       # Interfaz: consultarUbicacion()
    │   ├── Paquete.java           # Clase abstracta (guia, pesoKg, precioBase)
    │   ├── PaqueteExpress.java    # extends Paquete implements IRastreable
    │   └── Main.java              # Arreglo polimórfico + for-each
    └── out/                       # .class compilados
```

## Parte 4 — Decisiones de modelado

- **Composición (◆) Mascota → HistorialClinico (1 a 1):** el historial se crea
  en el constructor de `Mascota` y se destruye con ella (rombo negro del lado
  del todo).
- **Agregación (◇) Mascota → Veterinario (0..* a 1):** el veterinario se
  inyecta desde el exterior, sobrevive a la mascota y puede reasignarse
  (rombo blanco del lado del todo).
- **Herencia (△):** `Perro` y `Gato` extienden `Mascota`.
- **Implementación (..▷):** `Perro` y `Gato` implementan `IVacunable`.
- Visibilidades: atributos privados (`-`), operaciones públicas (`+`).

Para regenerar el PNG:
```bash
java -jar plantuml.jar -Playout=smetana clinica_veterinaria.puml
```

## Parte 5 — Compilación y ejecución

```bash
cd Parte5_Java
javac --release 11 -d out src/*.java
java -cp out Main
```

Salida esperada:
```
Guia: GUIA-001 | Costo total: $35500.0
Guia: GUIA-002 | Costo total: $19000.0
```

Cálculo verificado:
- GUIA-001: 15000 + (2.5 × 5000) + 8000 = 35500
- GUIA-002: 10000 + (0.8 × 5000) + 5000 = 19000

La validación del constructor lanza `IllegalArgumentException` si `pesoKg <= 0`.
