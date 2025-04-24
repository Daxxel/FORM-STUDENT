# 🧱 Patrón MVC en Java

El patrón **MVC** (Modelo - Vista - Controlador) es una forma de organizar el código de una aplicación para que sea más limpio, mantenible y fácil de escalar.

---

## 🔄 ¿Qué es MVC?

**MVC** divide una aplicación en tres componentes principales:

### 📦 Modelo (Model)
- Representa los **datos** y la **lógica de negocio**.
- Define las clases que representan los objetos del sistema.
- Se comunica con la base de datos si es necesario.
- Ejemplo: `Usuario.java`, `Producto.java`

### 👁️ Vista (View)
- Se encarga de mostrar la información al usuario.
- Es la **interfaz gráfica** o visual.
- No contiene lógica de negocio.
- Ejemplo: `UsuarioForm.java`, ventanas hechas con Swing (`JFrame`, `JPanel`).

### 🧭 Controlador (Controller)
- Intermediario entre el Modelo y la Vista.
- Recibe eventos del usuario desde la vista (clics, botones, etc).
- Llama al modelo para ejecutar lógica y actualiza la vista con el resultado.
- Ejemplo: `UsuarioController.java`

---

## 🗂️ Estructura típica del proyecto

src/ <br>
├── models/ # Modelos de datos  <br>
│ └── Usuario.java <br>
├── views/ # Interfaz gráfica <br>
│ └── UsuarioForm.java <br>
├── controllers/ # Lógica de control <br>
│ └── UsuarioController.java  <br>
├── Main.java # Punto de entrada del programa