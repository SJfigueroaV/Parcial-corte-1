# Evaluación FDS - Corte 1 (Partes 4 y 5)

Solución de la Parte 3 (Análisis de código), Parte 4 (Modelado UML) y
Parte 5 (Implementación Java SE 11) de la evaluación de Fundamentos de
Diseño de Software.

## Estructura

```
FDS_Evaluacion_Corte1/
├── Parte3_AnalisisCodigo/
│   └── ProcesadorRendimiento.java # Código corregido: bucle y cálculo del promedio
├── Parte4_UML/
│   └── DIAGRAMA_PARCIAL.jpeg      # Diagrama de clases de la clínica veterinaria
└── Parte5_Java/
    ├── src/
    │   ├── IRastreable.java       # Interfaz: consultarUbicacion()
    │   ├── Paquete.java           # Clase abstracta (guia, pesoKg, precioBase)
    │   ├── PaqueteExpress.java    # extends Paquete implements IRastreable
    │   └── Main.java              # Arreglo polimórfico + for-each
    └── out/                       # .class compilados
```

## Parte 3 — Análisis de código

`Parte3_AnalisisCodigo/ProcesadorRendimiento.java` contiene el código
corregido (punto 9.3):

- El bucle itera hasta `calificaciones.length - 1` (evita el
  `ArrayIndexOutOfBoundsException` en `i = 4`).
- El cálculo usa `(double) acumulador / 4` para forzar división real y
  obtener `82.5` en lugar de `82.0` (división entera).

Salida al ejecutar: `Promedio calculado: 82.5`

## Parte 4 — Modelado UML

El diagrama de clases de la clínica veterinaria está en
`Parte4_UML/DIAGRAMA_PARCIAL.jpeg`. Incluye las clases `Mascota`,
`HistorialClinico`, `Veterinario`, `Perro`, `Gato` y la interfaz
`IVacunable`, con composición, agregación, herencia e implementación.

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
