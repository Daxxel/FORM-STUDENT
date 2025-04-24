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

src/ \
├── models/ # Modelos de datos \
│ └── Usuario.java \
├── views/ # Interfaz gráfica \
│ └── UsuarioForm.java \
├── controllers/ # Lógica de control \
│ └── UsuarioController.java  \
├── Main.java # Punto de entrada del programa

## 🗂️ Estructura típica del proyecto con conexión a una base de datos

src/ \
├── controller/             # Controladores que manejan la lógica de flujo \
│   └── UsuarioController.java \
│
├── model/                  # Clases que representan datos (Modelos) \
│   └── Usuario.java \
│
├── view/                   # Interfaces gráficas (Vistas) \
│   └── UsuarioForm.java \
│
├── dao/                    # Clases de acceso a datos (Data Access Object) \
│   └── UsuarioDAO.java \
│
├── database/               # Clase de conexión centralizada a la base de datos \
│   └── ConexionBD.java \
│
├── Main.java               # Punto de entrada del programa
