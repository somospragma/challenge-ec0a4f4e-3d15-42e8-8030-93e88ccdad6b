# Implementación de un Sistema de Procesamiento de Pagos Reactivo

Como desarrollador backend Java, debes implementar un sistema que procese pagos en tiempo real provenientes de múltiples fuentes (tarjetas de crédito, débito, billeteras digitales). El sistema debe ser resiliente, escalable y confiable, manejando flujos de eventos de manera eficiente. Los pagos deben ser procesados con idempotencia, asegurando que cada pago sea procesado una sola vez incluso en caso de fallos temporales. El sistema debe mantener un throughput de al menos 10 000 pagos por segundo con una latencia máxima de 200ms.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Programación Reactiva |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Configuración del Entorno de Pagos

**Objetivo:** Establecer un entorno que pueda recibir y procesar eventos de pago de múltiples fuentes.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar y configurar las fuentes de eventos de pago (tarjetas de crédito, débito, billeteras digitales).
- Implementar un mecanismo para recibir y almacenar temporalmente los eventos de pago.

**Entregable:** Entorno configurado para recibir y almacenar eventos de pago de múltiples fuentes.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo manejar la concurrencia y la idempotencia en la recepción de eventos.
- Piensa en cómo escalar el sistema para manejar un alto throughput.

</details>

### Fase 2: Procesamiento de Pagos con Idempotencia

**Objetivo:** Implementar la lógica para procesar los pagos recibidos con idempotencia.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Desarrollar la lógica para procesar los pagos recibidos, asegurando que cada pago sea procesado una sola vez.
- Implementar mecanismos de resiliencia para manejar fallos temporales en el procesamiento de pagos.

**Entregable:** Lógica implementada para procesar pagos con idempotencia y resiliencia.

<details>
<summary>Pistas de conocimiento</summary>

- Considera el uso de operadores de Project Reactor para manejar flujos de eventos.
- Piensa en cómo implementar mecanismos de reintento y recuperación ante fallos.

</details>

### Fase 3: Escalabilidad y Confiabilidad del Sistema

**Objetivo:** Asegurar que el sistema sea escalable y confiable, manteniendo un throughput y una latencia aceptables.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Optimizar el sistema para manejar un throughput de al menos 10 000 pagos por segundo con una latencia máxima de 200ms.
- Implementar monitoreo y logging para garantizar la confiabilidad del sistema.

**Entregable:** Sistema optimizado para ser escalable y confiable, con monitoreo y logging implementados.

<details>
<summary>Pistas de conocimiento</summary>

- Considera el uso de patrones de diseño reactivos para mejorar la escalabilidad.
- Piensa en cómo implementar monitoreo y logging efectivos para detectar y solucionar problemas en tiempo real.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es la programación reactiva y cómo se aplica en el procesamiento de pagos?
- **paraQueSirve**: ¿Para qué sirve la idempotencia en el procesamiento de pagos?
- **comoSeUsa**: ¿Cómo se usan los operadores de Project Reactor para manejar flujos de eventos?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar un sistema de procesamiento de pagos reactivo?
- **queDecisionesImplica**: ¿Qué decisiones implica asegurar la escalabilidad y confiabilidad del sistema de procesamiento de pagos?

## Criterios de Evaluacion

- Configuración correcta del entorno para recibir y procesar eventos de pago.
- Implementación de la lógica para procesar pagos con idempotencia.
- Mecanismos de resiliencia implementados para manejar fallos temporales.
- Sistema optimizado para ser escalable y confiable.
- Monitoreo y logging efectivos implementados para garantizar la confiabilidad del sistema.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
