/*
Desarrollo de proyecto Diccionario electronico -> Ambiente Grafico

Abel Solorzano POO 
Ultima modificacion> 
                    Miercoles Diciembre 8 / 2021 --- 20:15 hs


Proposito> 
            Crear el diccionario desarrollado el segundo parcial dentro de los proyectos
            en formato grafico en base a las nuevas estructuras aprendidas en clase.

*/


package proyectodiccionarioelectronicofinal;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ProyectoDiccionarioElectronicoFinal extends JFrame 
{
    public static void main(String[] args) throws InterruptedException 
    {
        
        //create a runtime 
        long startTime = System.nanoTime();
        
        Thread.sleep(3000);
        
        
        
        //Creacion de listas
        LinkedList<Clase_Terminos> ListaCategorias = new LinkedList<Clase_Terminos>();
        LinkedList<Clase_Terminos> ListaTerminosBD = new LinkedList<Clase_Terminos>();
        LinkedList<Clase_Terminos> ListaTerminosBC = new LinkedList<Clase_Terminos>();
        LinkedList<Clase_Terminos> ListaTerminosCN = new LinkedList<Clase_Terminos>();
        LinkedList<Clase_Terminos> ListaTerminosCD = new LinkedList<Clase_Terminos>();
        LinkedList<Clase_Terminos> ListaTerminosDG = new LinkedList<Clase_Terminos>();
        LinkedList<Clase_Terminos> ListaTerminosDW = new LinkedList<Clase_Terminos>();
        LinkedList<Clase_Terminos> ListaTerminosEA = new LinkedList<Clase_Terminos>();
        LinkedList<Clase_Terminos> ListaTerminosIA = new LinkedList<Clase_Terminos>();
        LinkedList<Clase_Terminos> ListaTerminosIF = new LinkedList<Clase_Terminos>();
        LinkedList<Clase_Terminos> ListaTerminosMD = new LinkedList<Clase_Terminos>();
        LinkedList<Clase_Terminos> ListaTerminosPS = new LinkedList<Clase_Terminos>();
        LinkedList<Clase_Terminos> ListaTerminosRD = new LinkedList<Clase_Terminos>();
        LinkedList<Clase_Terminos> ListaTerminosSO = new LinkedList<Clase_Terminos>();
        LinkedList<Clase_Terminos> ListaTerminosSI = new LinkedList<Clase_Terminos>();
        LinkedList<Clase_Terminos> ListaTerminosVJ = new LinkedList<Clase_Terminos>();
        
        //Categorias
        ListaCategorias.add(new Clase_Terminos("Base de datos"));
        ListaCategorias.add(new Clase_Terminos("BlockChain y Criptomonedas"));
        ListaCategorias.add(new Clase_Terminos("Computacion en la nube"));
        ListaCategorias.add(new Clase_Terminos("Ciencia de datos"));
        ListaCategorias.add(new Clase_Terminos("Diseño Grafico"));
        ListaCategorias.add(new Clase_Terminos("Desarrollo web"));
        ListaCategorias.add(new Clase_Terminos("Formatos y extesiones de archivos"));
        ListaCategorias.add(new Clase_Terminos("Inteligencia Artificial"));
        ListaCategorias.add(new Clase_Terminos("Informatica"));
        ListaCategorias.add(new Clase_Terminos("Marketing Digital"));
        ListaCategorias.add(new Clase_Terminos("Programacion y desarrollo de software"));
        ListaCategorias.add(new Clase_Terminos("Redes"));
        ListaCategorias.add(new Clase_Terminos("Sistemas operativos"));
        ListaCategorias.add(new Clase_Terminos("Seguridad informatica"));
        ListaCategorias.add(new Clase_Terminos("Videojuegos"));
        
        //LISTA DE TERMINOS BASE DE DATOS
        ListaTerminosBD.add(new Clase_Terminos("Atomicidad","La propiedad de una transacción que garantiza que todos o ninguno de los cambios realizados por la transacción se escriben en la base de datos."));
        ListaTerminosBD.add(new Clase_Terminos("Cache","La memoria de la computadora que se reserva para contener una parte de los datos de la base de datos a los que el programa de aplicación de la base de datos ha accedido más recientemente."));
        ListaTerminosBD.add(new Clase_Terminos("Cascada","Un atributo de clave externa que migra automáticamente los cambios realizados a una referencia."));
        ListaTerminosBD.add(new Clase_Terminos("Columna","Una sola unidad de datos con nombre que tiene un tipo de datos en particular, números."));
        ListaTerminosBD.add(new Clase_Terminos("Compilador","Una herramienta de desarrollo de software que traduce programas de lenguaje de alto nivel a instrucciones en lenguaje de máquina que un procesador en particular puede comprender y ejecutar."));
        
        //LISTA DE TERMINOS BLOCKCHAIN Y CRIPTOMONEDAS
        ListaTerminosBC.add(new Clase_Terminos("Bitcoin","Generalmente se usa Bitcoin para referirse a la red o al protocolo, y bitcoin (en minúscula) para referirse a las unidades monetarias."));
        ListaTerminosBC.add(new Clase_Terminos("Blockchain","Base de datos transaccional distribuida, formada por cadenas de bloques diseñadas para evitar su modificación una vez que un dato ha sido publicado."));
        ListaTerminosBC.add(new Clase_Terminos("Criptomoneda","Medio digital de intercambio que se usa en blockchains públicas para el cambio de los registros."));
        ListaTerminosBC.add(new Clase_Terminos("Ethereum","Plataforma open source, descentralizada y basada en el modelo blockchain que permite la creación de contratos inteligentes."));
        ListaTerminosBC.add(new Clase_Terminos("Satoshi","Cuantía o fracción más pequeña de bitcoin. Un Satoshi equivale a 0.00000001 BTC."));
        
        //LISTA DE TERMINOS COMPUTACION EN LA NUBE
        ListaTerminosCN.add(new Clase_Terminos("Cloud Computing","El Cloud Computing hace referencia a la tecnología que permite el acceso, almacenamiento y procesamiento de datos por medio de internet."));
        ListaTerminosCN.add(new Clase_Terminos("Nube Publica","Dentro de la computación en la nube existen varios tipos que se determinan principalmente por la capacidad de acceder a los servicios que el proveedor ofrece. En una nube pública los recursos y servicios pueden ser utilizados por varias compañías y personas, en una modalidad de pago por uso."));
        ListaTerminosCN.add(new Clase_Terminos("Nube Privada","Dentro de la computación en la nube existen varios tipos que se determinan principalmente por la capacidad de acceder a los servicios que el proveedor ofrece. En este caso el acceso a los servicios son tomados por una única organización y ninguna otra compañía o individuo podrá ver la información."));
        ListaTerminosCN.add(new Clase_Terminos("Iaas","(Infraestructura como servicio)A través de este modelo las empresas realizan un pago a un tercero que se encarga de la instalación y mantenimiento de los equipos, lo que permite a las compañías abaratar costosas inversiones. La gran ventaja de este modelo es que el personal o tiene porque distraerse en cómo mantener los servidores."));
        ListaTerminosCN.add(new Clase_Terminos("Paas","(Plataforma como servicio) Este modelo está enfocado en el desarrollo de aplicaciones, ya que permite crear, probar y lanzar aplicaciones sin necesidad de adquirir una gran infraestructura de hardware y software."));
        
        //LISTA DE TERMINOS CIENCIA DE DATOS
        ListaTerminosCD.add(new Clase_Terminos("Big Data","El Big Data no es acerca de los datos, sino a los sorprendentes progresos y estrategias en los métodos estadísticos y de otro tipo para extraer información de los datos"));
        ListaTerminosCD.add(new Clase_Terminos("Covariance","La covarianza es una medida de cómo los cambios en una variable se asocian con los cambios en una segunda variable"));
        ListaTerminosCD.add(new Clase_Terminos("Correlation","Cuando dos conjuntos de datos están fuertemente vinculados entre sí, decimos que tienen una alta correlación"));
        ListaTerminosCD.add(new Clase_Terminos("Clustering","Las técnicas de agrupación tratan de reunir y clasificar conjuntos de puntos en grupos que son “suficientemente similares” o “cercanos” entre sí."));
        ListaTerminosCD.add(new Clase_Terminos("Data Ingineering","“Un científico puede descubrir una nueva estrella, pero no puede hacer una. Tendría que pedirle a un ingeniero que lo haga por él”. -Gordon Lindsay Glegg. "));
        
        //LISTA DE TERMINOS DISEÑO GRAFICO
        ListaTerminosDG.add(new Clase_Terminos("Boceto","Es el esquema básico o línea ideológica que conforma la pre-visualización de un futuro proyecto artístico."));
        ListaTerminosDG.add(new Clase_Terminos("Curva Bezier","Este término de diseño gráfico utilizado en imagen vectorial, es un tipo de línea curva ideada por medio de un método de descripción matemática que permite definir las transiciones de las curvaturas."));
        ListaTerminosDG.add(new Clase_Terminos("Degradado","En un conjunto de colores, el degradado hace referencia a la transición de tonalidad entre dos colores de manera linealmente ordenada. Es decir, sin saltos de color."));
        ListaTerminosDG.add(new Clase_Terminos("Cabecera","El concepto “cabecera”, hace referencia en términos periodísticos al título dominante en la portada de una publicación, así como los de sus diferentes secciones destacadas."));
        ListaTerminosDG.add(new Clase_Terminos("Cruces de Registro","También denominadas “marcas de registro”, éstas constituyen una terminología utilizada en impresión que van a más de un color para “casar” las distintas pasadas de tinta y comprobar que el trabajo esté correcto en sus dimensiones."));
        
        //LISTA DE TERMINOS DESARROLLO WEB
        ListaTerminosDW.add(new Clase_Terminos("HTML","Hyper Text Markup Language. Lenguaje que permite definir el contenido para que el cliente web permita visualizar la información que contiene. Dicho lenguaje permite la inclusión de medios (gráficos, sonidos, vídeos, etc.). Y es un estándar de la web definido por la W3C."));
        ListaTerminosDW.add(new Clase_Terminos("URL","Uniform Resource Locator. Definición del acceso a un recurso. El concepto de URL ha sido incorporado dentro del más general de URI (Uniform Resource Identifier – Identificador Uniforme de Recurso), pero el término URL aún se utiliza ampliamente. La URL está dividida en tres partes: Nombre del Servidor Web, Recurso a acceder y Parámetros."));
        ListaTerminosDW.add(new Clase_Terminos("Pagina Web","Unidad de contenido mínima de un servidor web. Normalmente está compuesta de un fichero formateado en HTML y sus referencias."));
        ListaTerminosDW.add(new Clase_Terminos("Servicio DNS","Servidor que entre otras funciones permite traducir nombres de máquinas en Internet a direcciones IP."));
        ListaTerminosDW.add(new Clase_Terminos("Dominio","Nombre registrado y asociado a una compañía que permite asociar nombres de servidores con direcciones IP. Normalmente se alquila de manera anual. No puede haber dos propietarios a la vez de un mismo dominio."));
        
        //LISTA DE TERMINOS EXTENSIONES DE ARCHIVOS
        ListaTerminosEA.add(new Clase_Terminos("MP4","Es un término de marketing que se emplea para denominar a los reproductores digitales de multimedia.El formato MP4 en general (también podemos denominarlo archivo ."));
        ListaTerminosEA.add(new Clase_Terminos("JPEG","Joint Photographic Experts Group (JPEG) es el nombre de un comité de expertos que creó un estándar de compresión y codificación de archivos e imágenes fijas. Además de ser un método de compresión, es a menudo considerado como un formato de archivo."));
        ListaTerminosEA.add(new Clase_Terminos("XLSX","El archivo XLSX es desde 2007 el formato de guardado habitual para tablas sin macros en Microsoft Excel."));
        ListaTerminosEA.add(new Clase_Terminos("PPTX","La extensión de archivo PPTX se convirtió en el estándar del programa PowerPoint de Microsoft Office 2007."));
        ListaTerminosEA.add(new Clase_Terminos("RAR","En informática, RAR (cuyas siglas significan Roshal ARchive en inglés) es un formato de archivo privado, con un algoritmo de compresión sin pérdida utilizado para la compresión de datos y archivado."));
        
        //LISTA DE TERMINOS INTELIGENCI ARTIFICIAL
        ListaTerminosIA.add(new Clase_Terminos("Inteligencia Artificial","La inteligencia artificial se puede definir de múltiples maneras, en particular, como un sistema automatizado capaz de analizar datos y tomar decisiones de forma autónoma."));
        ListaTerminosIA.add(new Clase_Terminos("Aprendizaje profundo","Una subcategoría del aprendizaje automático, el aprendizaje profundo permite el aprendizaje jerárquico de una gran cantidad de información. En otras palabras, la máquina procesa los datos en orden de complejidad para comprender una realidad y captarla por sus propios medios con la ayuda de una red neuronal."));
        ListaTerminosIA.add(new Clase_Terminos("Aprendizaje automático","El aprendizaje automático es uno de los componentes básicos de la inteligencia artificial. El término se refiere a un proceso en el que una máquina, por ejemplo, un chatbot, está dotada de la capacidad de aprender automáticamente."));
        ListaTerminosIA.add(new Clase_Terminos("Redes neuronales","El poder de una red neuronal se deriva del poder individual de cada neurona. Así es como funciona el cerebro humano: cada neurona realiza su propio cálculo simple, y la red formada por todas las neuronas multiplica el potencial de estos cálculos."));
        ListaTerminosIA.add(new Clase_Terminos("Prueba de Turing","Concebida por el matemático Alan Turing en los años cincuenta, la prueba de Turing consiste en evaluar la capacidad de una máquina para imitar a un ser humano en la medida en que es indistinguible de una persona de carne y hueso. La prueba de Turing todavía se considera el medio más válido para juzgar el nivel de inteligencia artificial alcanzado por una máquina."));
        
        //LISTA DE TERMINOS INFORMATICA
        ListaTerminosIF.add(new Clase_Terminos("Bit","Dígito binario utilizado en el sistema numérico binario."));
        ListaTerminosIF.add(new Clase_Terminos("Byte","Término utilizado para hacer referencia a una serie de dígitos binarios consecutivos sobre los que se opera como una unidad."));
        ListaTerminosIF.add(new Clase_Terminos("Atenuacion","Punto en el cual la señal que se envía a través de un cable comienza a desvanecerse y se vuelve inutilizable."));
        ListaTerminosIF.add(new Clase_Terminos("Demodulacion","Proceso de devolver una señal modulada a su forma original."));
        ListaTerminosIF.add(new Clase_Terminos("Ethernet","Tecnología compartida de red sobre la cual todas las estaciones de trabajo de una red comparten al ancho de banda disponible."));
        
        //LISTA DE TERMINOS MARKETING DIGITAL
        ListaTerminosMD.add(new Clase_Terminos("Call to action","(CTA – Llamada a la acción): call to action o llamada la acción es una herramienta o estrategia de publicidad, gráfica o textual, que busca incitar a la audiencia a responder a una acción después de un anuncio."));
        ListaTerminosMD.add(new Clase_Terminos("KPI","(Key Performance Indicator): se trata de un indicador clave de rendimiento, utilizado para medir el nivel del desempeño de un proceso. Este indicador está relacionado a un objetivo fijado de antemano y normalmente se expresa en porcentaje. Los KPIs más utilizados en Marketing Digital son: clics, visitas, apertura de emails o, entre otros, retweets."));
        ListaTerminosMD.add(new Clase_Terminos("Landing Page","Es una página web que busca vincular al usuario con una marca. Aparece tras hacer una invitación a una acción concreta como hacer click en un botón de una guía, portal o banner. Se utiliza para convertir a los visitantes de esa página en leads."));
        ListaTerminosMD.add(new Clase_Terminos("Target","También conocido como la audiencia objetivo a la que nos dirigimos que tiene una estrategia concreta en marketing. Es importante definir bien el target group ya que se trabajará en torno a él."));
        ListaTerminosMD.add(new Clase_Terminos("e-Business","(Negocio electrónico): se refiere a la realización de cualquier tipo de negocio por medio de Internet. Independientemente de si se trata de envío de información, solicitudes de correo electrónico o de intercambio de dinero por productos, si se hace por medio de Internet, se trata de un negocio electrónico o e-Business."));
        
        //LISTA DE TERMINOS PROGRAMACION Y DESARROLLO DE SOFTWARE
        ListaTerminosPS.add(new Clase_Terminos("Algoritmo","Método que describe cómo se resuelve un problema en término de las acciones que se ejecutan y especifica el orden en que se ejecutan estas acciones."));
        ListaTerminosPS.add(new Clase_Terminos("Abstraccion","Propiedad y/o técnica de software que oculta los detalles de la implementación. Java soporta abstracción de clases y abstracción de métodos."));
        ListaTerminosPS.add(new Clase_Terminos("Arreglo","Objeto contenedor que almacena una secuencia indexada de los mismos tipos de datos."));
        ListaTerminosPS.add(new Clase_Terminos("Asignacion","Almacenamiento de un valor en una variable. La sentencia de asignación es aquella que implementa la asignación y utiliza un operador de asignación."));
        ListaTerminosPS.add(new Clase_Terminos("Analisis","Proceso de identificación, modelado y descripción de lo que hace un sistema y de cómo trabaja."));
        
        //LISTA DE TERMINOS REDES
        ListaTerminosRD.add(new Clase_Terminos("Ethernet","Tecnología compartida de red sobre la cual todas las estaciones de trabajo de una red comparten al ancho de banda disponible."));
        ListaTerminosRD.add(new Clase_Terminos("Ancho de Banda","La cantidad de datos que se pueden transferir entre dos puntos de una red en un tiempo específico."));
        ListaTerminosRD.add(new Clase_Terminos("Firewall","Router o servidor de acceso o varios routers o servidores de acceso designados como búfer entre cualquier red pública conectada y una red privada."));
        ListaTerminosRD.add(new Clase_Terminos("IP","Significa dirección del Protocolo de Internet, es un conjunto de reglas para la comunicación a través de Internet."));
        ListaTerminosRD.add(new Clase_Terminos("Wireless","Es aquella en la que la comunicación no se encuentra unida por un medio de propagación físico, sino que se utiliza la modulación de ondas electromagnéticas a través del espacio."));
        
        //LISTA DE TERMINOS SISTEMAS OPERATIVOS
        ListaTerminosSO.add(new Clase_Terminos("Sistema Operativo","Conjunto de órdenes y programas que controlan los procesos básicos de una computadora y permiten el funcionamiento de otros programas."));
        ListaTerminosSO.add(new Clase_Terminos("Kernel","El Kernel o núcleo, es una parte fundamental del sistema operativo que se encarga de conceder el acceso al hardware de forma segura para todo el software que lo solicita, el Kernel es una pequeña e invisible parte del sistema operativo, pero la más importante, ya que sin esta no podría funcionar."));
        ListaTerminosSO.add(new Clase_Terminos("Driver","Dicho de manera muy simple, el driver o controlador de dispositivos es un pequeño software que conecta el sistema operativo directamente con los componentes del hardware de la PC."));
        ListaTerminosSO.add(new Clase_Terminos("BIOS","BIOS son las siglas en inglés de «Basic Input Output System«, que significa algo así como «Sistema básico de entrada y salida», aunque en los albores de la era del PC significaba «Basic Input Operating System» y es que realmente es el primer sistema operativo que se ejecuta en el PC y su trabajo es poner el hardware en marcha antes de pasarle el testimonió al sistema operativo principal."));
        ListaTerminosSO.add(new Clase_Terminos("Buffer","Un buffer es un espacio de memoria en el que se almacenan datos evitando que el programa que los necesita se quede sin datos durante una transferencia."));
        
        //LISTA DE TERMINOS SEGURIDAD INFORMATICA
        ListaTerminosSI.add(new Clase_Terminos("Ciberseguridad","Condición caracterizada por un mínimo de riesgos y amenazas a las infraestructuras tecnológicas, los componentes lógicos de la información y las interacciones en el ciberespacio."));
        ListaTerminosSI.add(new Clase_Terminos("Cifrado","Proceso de codificación de información sensible para poder evitar que esta llegue a personas no autorizadas."));
        ListaTerminosSI.add(new Clase_Terminos("Hacker","Persona experta en tecnología dedicada a intervenir y /o realizar alteraciones técnicas con buenas o malas intenciones."));
        ListaTerminosSI.add(new Clase_Terminos("Gusanos","Son programas que realizan copias de sí mismos, alojándolas en diferentes ubicaciones del ordenador. El objetivo de este malware suele ser colapsar los ordenadores y las redes informáticas, impidiendo así el trabajo a los usuarios."));
        ListaTerminosSI.add(new Clase_Terminos("Keylogger","Es un tipo de malware diseñado para capturar las pulsaciones, movimientos y clics del teclado y del ratón, generalmente de forma encubierta, para intentar robar información personal, como las cuentas y contraseñas de las tarjetas de crédito."));
        
        //LISTA DE TERMINOS VIDEOJUEGOS
        ListaTerminosVJ.add(new Clase_Terminos("Abandonware","Abandonware proviene de los términos abandoned y software. Así pues, abandonware hace referencia a aquellos programas descatalogados. Este tipo de software suele pasar a un estado de descarga legal."));
        ListaTerminosVJ.add(new Clase_Terminos("Archiever","El Achiever es ese jugador cuyo objetivo es conseguir todas metas que se propongan en el juego, ya sean objetivos principales o secundarios."));
        ListaTerminosVJ.add(new Clase_Terminos("Advergaming","Es por ello que el significado de advergaming es la creación de videojuegos para publicitar algo, ya sea un producto en concreto o una marca."));
        ListaTerminosVJ.add(new Clase_Terminos("AFK","Es muy común su uso durante partidas on-line, puesto que estas no se pueden poner en pausa."));
        ListaTerminosVJ.add(new Clase_Terminos("Aggro","Se trata de un término que se utiliza para identificar al próximo objetivo del enemigo de un juego."));
        
/*
        ---------------------------------
        Orden de Ventanas Creadas>
        
        Funcion         Ventana creada              Panel Creado         
        
        Login            VInicio                    PanelInicio 
        Main             VentanaMain                PanelMain
        Consultar        VConsultar                 PConsultar
        Listado          VListado                   PListado
        Busqueda         VBusqueda                  PBusqueda
        Ingresar         VIngresar                  PIngresar
        Modificar        VModificar                 PModificar
        Eliminar         VEliminar                  PEliminar
        
        El proyecto consta de Paneles y Ventanas, donde el 
        
        Sufijo V= Ventana
        Sufijo P= Panel
        
        ---------------------------------
*/        
        


       //-------------------------------------------AGREGAR VENTANAS NECESARIAS-------------------------------**   
        
        //ventana para iniciar o salir-----------------------------Loggeo***************************************************Ventana 0 Login
        JFrame VInicio = new JFrame();
        VInicio.setTitle("USER SIGN IN");
        VInicio.setDefaultCloseOperation(EXIT_ON_CLOSE);
        VInicio.setSize(700, 700);
        VInicio.setLocationRelativeTo(null);
        VInicio.setVisible(true);
        VInicio.setResizable(true);
        
        //Crear parametros panel y demas para Ventana Inicio
        JPanel PanelInicio = new JPanel();
        PanelInicio.setLayout(null);
        
        VInicio.getContentPane().add(PanelInicio);
        
        JLabel LText = new JLabel();
        LText.setText("DICCIONARIO ELECTRONICO");
        LText.setBounds(180, 0, 400, 100);
        LText.setFont(new Font("Unispace",400,25));
        PanelInicio.add(LText);
        
           
        JButton Start = new JButton();
        Start.setText("INICIAR");
        Start.setFont(new Font("Cooper Black",150,20));
        Start.setBounds(110, 100, 150, 60);
        PanelInicio.add(Start);
        
        
        JButton Cerrar = new JButton();
        Cerrar.setText("CERRAR");
        Cerrar.setFont(new Font("Cooper Black",150,20));
        Cerrar.setBackground(Color.red);
        Cerrar.setBounds(440, 100, 150, 60);
        PanelInicio.add(Cerrar);
        
        JLabel FotoInicio = new JLabel(new ImageIcon("Inicio.png"));
        FotoInicio.setBounds(0, 15, 700, 800);
        PanelInicio.add(FotoInicio);
        
        
        
        
  
        //Ventana Menu principal-----------------------------MENU PRINCIPAL***************************************************Ventana 1 MENU PRINCIPAL
        JFrame VentanaMain = new JFrame();
        VentanaMain.setTitle("Diccionario Electronico");
        VentanaMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
        VentanaMain.setSize(700,700);
        VentanaMain.setVisible(false);
        VentanaMain.setLocationRelativeTo(null);
        VentanaMain.setResizable(false);
        
        JPanel PanelMain = new JPanel();
        PanelMain.setLayout(null);
        
        VentanaMain.getContentPane().add(PanelMain);
        
         //Label para texto
        JLabel Inicio = new JLabel();
        Inicio.setText("DICIONARIO ELECTRONICO");
        Inicio.setBounds(180, 0, 400, 100);
        Inicio.setFont(new Font("Unispace",400,25));
        PanelMain.add(Inicio);
        
        JButton CSMain = new JButton();
        CSMain.setFont(new Font("Unispace",100,12));
        CSMain.setText("CERRAR SESION");
        CSMain.setBackground(Color.red);
        CSMain.setBounds(10, 620, 150, 40);
        PanelMain.add(CSMain);
        
        JLabel IconMain = new JLabel(new ImageIcon("MainIcono.png"));
        IconMain.setBounds(300, 100, 500, 500);
        PanelMain.add(IconMain);
        
        
        
        
        
       //-----------Ventana Consultar-------------------OPCION--1--------------CONSULTAR***************************************************Ventana FUNCION CONSULTAR
       JFrame VConsultar = new JFrame();
       VConsultar.setTitle("Consultar Categorias");
       VConsultar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       VConsultar.setSize(700, 700);
       VConsultar.setVisible(false);
       VConsultar.setLocationRelativeTo(null);
       VConsultar.setResizable(false);
       
       JPanel PConsultar = new JPanel();
       PConsultar.setLayout(null);
       
       VConsultar.getContentPane().add(PConsultar);
       
       //agregar icono de Consultar
       JLabel TagIConsultar = new JLabel(new ImageIcon("ConsultarIcono.png"));
       TagIConsultar.setBounds(350, 350, 400, 400);    
       PConsultar.add(TagIConsultar);
       
       JButton Consultar = new JButton();
       Consultar.setText("Consultar Categorias");
       Consultar.setFont(new Font("Unispace",200,12));
       Consultar.setBounds(50,160,180,40);
       Consultar.setMnemonic('c');
       PanelMain.add(Consultar);
 
       //PANEL ATRAS CONSULTAR
        JButton BTNRetornarMainCons = new JButton();
        BTNRetornarMainCons.setText("<< ATRAS");
        BTNRetornarMainCons.setBounds(5, 5, 100, 30);
        BTNRetornarMainCons.setOpaque(true);
        PConsultar.add(BTNRetornarMainCons);
        
        //Cerrar sesion Ventana Modificar 
       JButton CSCons = new JButton();
       CSCons.setText("CERRAR SESION");
       CSCons.setFont(new Font("Unispace",100,12));
       CSCons.setBackground(Color.red);
       CSCons.setBounds(10, 620, 150, 40);
       PConsultar.add(CSCons);
       
       
       
       
       JLabel TagConsunta = new JLabel();
       TagConsunta.setText("Seleccione la lista a desplegar");
       TagConsunta.setFont(new Font("Unispace",300,20));
       TagConsunta.setBounds(50, 30, 600, 200);
       PConsultar.add(TagConsunta);
       
       JComboBox Comboconsulta = new JComboBox();
       Comboconsulta.setFont(new Font("Unispace",120,20));
        Comboconsulta.setBounds(50, 150, 480, 50);
        Comboconsulta.addItem("Base de datos");
        Comboconsulta.addItem("BlockChain y Criptomonedas");
        Comboconsulta.addItem("Computacion en la nube");
        Comboconsulta.addItem("Ciencia de datos");
        Comboconsulta.addItem("Diseño Grafico");
        Comboconsulta.addItem("Desarrollo web");
        Comboconsulta.addItem("Formatos y extesiones de archivos");
        Comboconsulta.addItem("Inteligencia Artificial");
        Comboconsulta.addItem("Informatica");
        Comboconsulta.addItem("Marketing Digital");
        Comboconsulta.addItem("Programacion y desarrollo de software");
        Comboconsulta.addItem("Redes");
        Comboconsulta.addItem("Sistemas operativos");
        Comboconsulta.addItem("Seguridad informatica");
        Comboconsulta.addItem("Videojuegos");
        
        PConsultar.add(Comboconsulta);
        
        JButton ButtonConsConfirm = new JButton();
        ButtonConsConfirm.setText("Aceptar");
        ButtonConsConfirm.setFont(new Font("Unispace",120,20));
        ButtonConsConfirm.setBounds(535,150,120,50);
        PConsultar.add(ButtonConsConfirm);
        
        
        JFrame MostrarListaConsultada = new JFrame();
        MostrarListaConsultada.setTitle("Mostrar Lista");
        MostrarListaConsultada.setSize(1200, 400);
        MostrarListaConsultada.setResizable(false);
        MostrarListaConsultada.setLocationRelativeTo(null);
        
        JPanel MostrarListaPanel = new JPanel();
        MostrarListaPanel.setLayout(null);
        MostrarListaConsultada.add(MostrarListaPanel);
        
        

        JTextArea MostrarListaArea = new JTextArea();
        MostrarListaArea.setBounds(5, 60, 1180, 200);
        MostrarListaPanel.add(MostrarListaArea);
        
        
        JButton RegresarDeCons = new JButton();
        RegresarDeCons.setText("<< ATRAS");
        RegresarDeCons.setFont(new Font("Unispace",100,30));
        RegresarDeCons.setBounds(10, 10, 200, 30);
        MostrarListaPanel.add(RegresarDeCons);
        
       
        ///***********************************************************************************************************************************************************************************************************************************************************
        
        
        
        
        //-----------Ventana Listado-----------------------------OPCION--2----------------------------------LISTADO***************************************************Ventana FUNCION LISTADO
       JFrame VListado = new JFrame();
       VListado.setTitle("Listado Terminos");
       VListado.setDefaultCloseOperation(EXIT_ON_CLOSE);
       VListado.setSize(700, 700);
       VListado.setVisible(false);
       VListado.setLocationRelativeTo(null);
       VListado.setResizable(false);
       
       JPanel PListado = new JPanel();
       PListado.setLayout(null);
       
       VListado.getContentPane().add(PListado);
       
       //agregar icono de Listado
       JLabel TagIListado = new JLabel(new ImageIcon("ListadoIcono.png"));
       TagIListado.setBounds(350, 350, 400, 400); 
       PListado.add(TagIListado);
       
       JButton Listado = new JButton();
        Listado.setText("Listado Completo");
        Listado.setFont(new Font("Unispace",200,12));
        Listado.setBounds(50,220,180,40);
        Listado.setMnemonic('l');
        PanelMain.add(Listado);
        
        
        
        
        
        //PANEL ATRAS LISTADO
        JButton BTNRetornarMainList = new JButton();
        BTNRetornarMainList.setText("<< ATRAS");
        BTNRetornarMainList.setBounds(5, 5, 100, 30);
        BTNRetornarMainList.setOpaque(true);
        PListado.add(BTNRetornarMainList);
        
        
       JButton CSList = new JButton();
       CSList.setText("CERRAR SESION");
       CSList.setFont(new Font("Unispace",100,12));
       CSList.setBackground(Color.red);
       CSList.setBounds(10, 620, 150, 40);
       PListado.add(CSList); 

        
       JLabel LCDisclaimer1 = new JLabel();
       JLabel LCDisclaimer2 = new JLabel();
       
       LCDisclaimer1.setText("Mostrar Diccionario completo");
       LCDisclaimer1.setBounds(80, 50, 600, 100);
       LCDisclaimer1.setFont(new Font("Unispace",150,30));
      
       PListado.add(LCDisclaimer1);
       
       JButton BNoCateg = new JButton();
       BNoCateg.setText("DICCIONARIO SIN CATEGORIAS");
       BNoCateg.setFont(new Font("Unispace",80,15));
       BNoCateg.setBounds(80, 240, 510, 50);
       
       
       PListado.add(BNoCateg);
               
               
       JButton BCateg = new JButton();
       BCateg.setText("DICCIONARIO CON CATEGORIAS");
       BCateg.setFont(new Font("Unispace",80,15));
       BNoCateg.setBounds(80, 240, 510, 50);
       BCateg.setBounds(80, 150, 510, 50); 
       PListado.add(BCateg);
       
       
       JFrame VCateg = new JFrame();
       VCateg.setTitle("DICCIONARIO CON CATEGORIAS");
       VCateg.setDefaultCloseOperation(EXIT_ON_CLOSE);
       VCateg.setSize(1000, 1000);
       VCateg.setVisible(false);
       VCateg.setLocationRelativeTo(null);
       VCateg.setResizable(false);
       
       JPanel PCateg = new JPanel();
       PCateg.setLayout(null);
       VCateg.add(PCateg);
       
       
       JButton BCategAtras = new JButton();
       BCategAtras.setText("<< ATRAS");
       BCategAtras.setBounds(10, 10, 150, 30);
       BCategAtras.setFont(new Font("Unispace",100,20));
       PCateg.add(BCategAtras);
       
       JTextArea CategArea = new JTextArea();
       CategArea.setBounds(10, 50, 980, 980);
       PCateg.add(CategArea);
       
       
       
       JFrame VNoCateg = new JFrame();
       VNoCateg.setTitle("DICCIONARIO SIN CATEGORIAS");
       VNoCateg.setDefaultCloseOperation(EXIT_ON_CLOSE);
       VNoCateg.setSize(1000, 1000);
       VNoCateg.setVisible(false);
       VNoCateg.setLocationRelativeTo(null);
       VNoCateg.setResizable(false);
       
       JPanel PNoCateg = new JPanel();
       PNoCateg.setLayout(null);
       VNoCateg.add(PNoCateg);
       
       JButton BNoCategAtras = new JButton();
       BNoCategAtras.setText("<< ATRAS");
       BNoCategAtras.setBounds(10, 10, 150, 30);
       BNoCategAtras.setFont(new Font("Unispace",100,20));
       PNoCateg.add(BNoCategAtras);
               
       
       JTextArea NoCategArea = new JTextArea();
       NoCategArea.setBounds(10, 50, 980, 980);
       PNoCateg.add(NoCategArea);
       
       
       //-----------Ventana Busqueda-----------------------------OPCION--3----------------------------------BUSQUEDA***************************************************Ventana FUNCION BUSQUEDA
       JFrame VBusqueda = new JFrame();
       VBusqueda.setTitle("Buscar Terminos");
       VBusqueda.setDefaultCloseOperation(EXIT_ON_CLOSE);
       VBusqueda.setSize(700, 700);
       VBusqueda.setVisible(false);
       VBusqueda.setLocationRelativeTo(null);
       VBusqueda.setResizable(false);
       
       JPanel PBusqueda = new JPanel();
       PBusqueda.setLayout(null);
       
       VBusqueda.getContentPane().add(PBusqueda);
       
       //agregar icono de busqueda
       JLabel TagIBusqueda = new JLabel(new ImageIcon("BuscarIcono.png"));
       TagIBusqueda.setBounds(350, 350, 400, 400); 
       PBusqueda.add(TagIBusqueda);
       
       JButton Busqueda = new JButton();
        Busqueda.setText("Busqueda");
        Busqueda.setFont(new Font("Unispace",200,12));
        Busqueda.setBounds(50,280,180,40);
        Busqueda.setMnemonic('b');
        PanelMain.add(Busqueda);
        
      
        
        //PANEL ATRAS BUSQUEDA
        JButton BTNRetornarMainBusq = new JButton();
        BTNRetornarMainBusq.setText("<< ATRAS");
        BTNRetornarMainBusq.setBounds(5, 5, 100, 30);
        BTNRetornarMainBusq.setOpaque(true);
        PBusqueda.add(BTNRetornarMainBusq);
        
       JButton CSBusq = new JButton();
       CSBusq.setText("CERRAR SESION");
       CSBusq.setFont(new Font("Unispace",100,12));
       CSBusq.setBackground(Color.red);
       CSBusq.setBounds(10, 620, 150, 40);
       PBusqueda.add(CSBusq); 
       
       
       JLabel SearchDisclaimer = new JLabel();
       SearchDisclaimer.setText("Ingrese el termino a buscar");
       SearchDisclaimer.setFont(new Font("Unispace",150,30));
       SearchDisclaimer.setBounds(80, 50, 600, 100);
       PBusqueda.add(SearchDisclaimer);
       
       JTextField SearchField = new JTextField();
       SearchField.setFont(new Font("Unispace",150,20));
       SearchField.setBounds(105, 150, 450, 50);
       PBusqueda.add(SearchField);
       
       
       JButton ButSearch = new JButton();
       ButSearch.setBounds(300, 210, 70, 50);
       ImageIcon SearchIcon = new ImageIcon("SearchIcon.png");
       ButSearch.setIcon(new ImageIcon (SearchIcon.getImage().getScaledInstance(ButSearch.getWidth(), ButSearch.getHeight(), Image.SCALE_SMOOTH)));
       PBusqueda.add(ButSearch);
   
       
       //-----------Ventana Ingresar-----------------------------OPCION--4----------------------------------INGRESAR***************************************************Ventana FUNCION AGREGAR 
       JFrame VIngresar = new JFrame();
       VIngresar.setTitle("Ingresar nuevo termino");
       VIngresar.setDefaultCloseOperation(EXIT_ON_CLOSE);
       VIngresar.setSize(700, 700);
       VIngresar.setVisible(false);
       VIngresar.setLocationRelativeTo(null);
       VIngresar.setResizable(false);
       
       JPanel PIngresar = new JPanel();
       PIngresar.setLayout(null);
       
       VIngresar.getContentPane().add(PIngresar);
       
       //agregar icono de Ingresar
       /*JLabel TagIIngresar = new JLabel(new ImageIcon("AgregarIcono.png"));
       TagIIngresar.setBounds(350, 350, 400, 400); 
       PIngresar.add(TagIIngresar);  */
       
       JLabel Tag1Ingresar = new JLabel();
       Tag1Ingresar.setBounds(350, 390, 400, 400); 
       ImageIcon AgregarIcono = new ImageIcon("AgregarIcono.png");
       Tag1Ingresar.setIcon(new ImageIcon (AgregarIcono.getImage().getScaledInstance(Tag1Ingresar.getWidth(), Tag1Ingresar.getHeight(), Image.SCALE_AREA_AVERAGING)));
       PIngresar.add(Tag1Ingresar);
       
       
       
       JButton Ingresar = new JButton();
        Ingresar.setText("Ingresar Termino");
        Ingresar.setFont(new Font("Unispace",200,12));
        Ingresar.setBounds(50,340,180,40);
        Ingresar.setMnemonic('i');
        PanelMain.add(Ingresar);
        
     
        
       
        //PANEL ATRAS INGRESAR
        JButton BTNRetornarMainIng = new JButton();
        BTNRetornarMainIng.setText("<< ATRAS");
        BTNRetornarMainIng.setBounds(5, 5, 100, 30);
        BTNRetornarMainIng.setOpaque(true);
        PIngresar.add(BTNRetornarMainIng);
        
        JButton CSIng = new JButton();
       CSIng.setText("CERRAR SESION");
       CSIng.setFont(new Font("Unispace",100,12));
       CSIng.setBackground(Color.red);
       CSIng.setBounds(10, 620, 150, 40);
       PIngresar.add(CSIng); 
       
       
       //agregar el label para seleccionar
       JLabel LabelAvisoAdd = new JLabel();
       LabelAvisoAdd.setText("Seleccione categoria para el nuevo termino");
       LabelAvisoAdd.setBounds(20, 100, 500, 20);
       LabelAvisoAdd.setFont(new Font("Unispace",300,15));
       PIngresar.add(LabelAvisoAdd);
       
       
       //Label para ingresar termino
       JLabel LabelNewTerm = new JLabel();
       LabelNewTerm.setText("Ingrese el termino");
       LabelNewTerm.setBounds(20, 180, 300, 50);
       LabelNewTerm.setFont(new Font("Unispace",300,15));
       PIngresar.add(LabelNewTerm);
       
       
       //TextField Para texto Termino
       JTextField FieldNewTerm = new JTextField();
       FieldNewTerm.setFont(new Font("Unispace",300,15));
       FieldNewTerm.setBounds(20, 230, 300, 50);
       PIngresar.add(FieldNewTerm);
       
       //Label para decir definicion
       JLabel LabelNewTermDef = new JLabel();
       LabelNewTermDef.setText("Ingrese su definicion");
       LabelNewTermDef.setBounds(20, 290, 300, 50);
       LabelNewTermDef.setFont(new Font("Unispace",300,15));
       PIngresar.add(LabelNewTermDef);

       //TextArea para Definicion
       JTextField AreaNewTermDef = new JTextField();
       AreaNewTermDef.setBounds(20, 340, 520, 50);
       AreaNewTermDef.setFont(new Font("Unispace",300,15));
       PIngresar.add(AreaNewTermDef);
       
       JButton ButtonTermAdd = new JButton();
       ButtonTermAdd.setText("AGREGAR");
       ButtonTermAdd.setFont(new Font("Unispace",100,12));
       ButtonTermAdd.setBounds(180, 620, 150, 40);
       ButtonTermAdd.setBackground(Color.GREEN);

       PIngresar.add(ButtonTermAdd);
       
       
       CSIng.setText("CERRAR SESION");
       CSIng.setFont(new Font("Unispace",100,12));
       CSIng.setBackground(Color.red);
       CSIng.setBounds(10, 620, 150, 40);
       PIngresar.add(CSIng); 
       
       ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////FALTA !!!!!!!!!!!!!!! AGREGAR LAS ACCIONES 621
       
       
       //Agregar el JComboBox para agregar termino a una categorias***********
       JComboBox JComboAgregar = new JComboBox();
       JComboAgregar.setBounds(20, 130, 400, 40);
       JComboAgregar.setFont(new Font("Unispace",120,15));
       JComboAgregar.addItem("Base de datos");
       JComboAgregar.addItem("BlockChain y Criptomonedas");
       JComboAgregar.addItem("Computacion en la nube");
       JComboAgregar.addItem("Ciencia de datos");
       JComboAgregar.addItem("Diseño Grafico");
       JComboAgregar.addItem("Desarrollo web");
       JComboAgregar.addItem("Formato y extensiones de archivos");
       JComboAgregar.addItem("Inteligencia Artificial");
       JComboAgregar.addItem("Informatica");
       JComboAgregar.addItem("Marketing Digital");
       JComboAgregar.addItem("Programacion y desarrollo de software");
       JComboAgregar.addItem("Redes");
       JComboAgregar.addItem("Sistemas operativos");
       JComboAgregar.addItem("Seguridad informatica");
       JComboAgregar.addItem("Videojuegos");
       PIngresar.add(JComboAgregar);
       
       
        
       
       
       
       
        
       //-----------Ventana Modificar-----------------------------OPCION--5--------------------------------------MODIFICAR***************************************************Ventana FUNCION MODIFICAR
       JFrame VModificar = new JFrame();
       VModificar.setTitle("Modificar Terminos");
       VModificar.setDefaultCloseOperation(EXIT_ON_CLOSE);
       VModificar.setSize(700, 700);
       VModificar.setVisible(false);
       VModificar.setLocationRelativeTo(null);
       VModificar.setResizable(false);
       
       JPanel PModificar = new JPanel();
       PModificar.setLayout(null);
       
       VModificar.getContentPane().add(PModificar);
       
       //agregar icono de Modificar
       JLabel TagIModificar = new JLabel(new ImageIcon("ModificarIcono.png"));
       TagIModificar.setBounds(350, 350, 400, 400); 
       PModificar.add(TagIModificar);
       
       JButton Modificar = new JButton();
        Modificar.setText("Modificar Termino");
        Modificar.setFont(new Font("Unispace",200,12));
        Modificar.setBounds(50,400,180,40);
        Modificar.setMnemonic('m');
        PanelMain.add(Modificar);
          
       JLabel LabelSelCateg = new JLabel();
       LabelSelCateg.setText("Seleccione categoria de origen");
       LabelSelCateg.setFont(new Font("Unispace",300,20));
       LabelSelCateg.setBounds(20, 50, 400, 30);
       PModificar.add(LabelSelCateg);
       
       JComboBox JComboSelCateg = new JComboBox();
       JComboSelCateg.setBounds(20, 80, 400, 40);
       JComboSelCateg.setFont(new Font("Unispace",200,20));
       JComboSelCateg.addItem("Base de datos");
       JComboSelCateg.addItem("BlockChain y Criptomonedas");
       JComboSelCateg.addItem("Computacion en la nube");
       JComboSelCateg.addItem("Ciencia de datos");
       JComboSelCateg.addItem("Diseño Grafico");
       JComboSelCateg.addItem("Desarrollo web");
       JComboSelCateg.addItem("Formato y extensiones de archivos");
       JComboSelCateg.addItem("Inteligencia Artificial");
       JComboSelCateg.addItem("Informatica");
       JComboSelCateg.addItem("Marketing Digital");
       JComboSelCateg.addItem("Programacion y desarrollo de software");
       JComboSelCateg.addItem("Redes");
       JComboSelCateg.addItem("Sistemas operativos");
       JComboSelCateg.addItem("Seguridad informatica");
       JComboSelCateg.addItem("Videojuegos");
       PModificar.add(JComboSelCateg);
       
       //Buscar termino para modificar
       JLabel LabelModSearch = new JLabel();
       LabelModSearch.setText("Buscar termino");
       LabelModSearch.setFont(new Font("Unispace",300,20));
       LabelModSearch.setBounds(20, 120, 400, 30);
       PModificar.add(LabelModSearch);
       
       JTextField FieldModSearch = new JTextField();
       FieldModSearch.setFont(new Font("Unispace",300,16));
       FieldModSearch.setBounds(20,150,300,40);
       PModificar.add(FieldModSearch);    
       
       JButton ButtonModSearch = new JButton();
       ButtonModSearch.setText("MODIFICAR");
       ButtonModSearch.setFont(new Font("Unispace",300,20));
       ButtonModSearch.setBounds(20, 350, 200, 40);
       PModificar.add(ButtonModSearch);
       
       //Nuevo Termino
       JLabel LabelModReplace = new JLabel();
       LabelModReplace.setText("Nuevo termino");
       LabelModReplace.setFont(new Font("Unispace",300,20));
       LabelModReplace.setBounds(20, 190, 400, 30);
       PModificar.add(LabelModReplace);
       
       
       JTextField FieldModReplace = new JTextField();
       FieldModReplace.setFont(new Font("Unispace",300,16));
       FieldModReplace.setBounds(20, 220, 300, 40);
       PModificar.add(FieldModReplace);
       
       JLabel DefinitionLabel = new JLabel();
       DefinitionLabel.setFont(new Font("Unispace",300,16));
       DefinitionLabel.setText("Ingrese la definicion");      
       DefinitionLabel.setBounds(20, 270, 300, 30);
       PModificar.add(DefinitionLabel);
       
               
       JTextField DefinitionMod = new JTextField();
       DefinitionMod.setFont(new Font("Unispace",300,16));
       DefinitionMod.setBounds(20, 300, 300, 40);
       PModificar.add(DefinitionMod);
       
        //PANEL ATRAS MODIFICAR
        JButton BTNRetornarMainMod = new JButton();
        BTNRetornarMainMod.setText("<< ATRAS");
        BTNRetornarMainMod.setBounds(5, 5, 100, 30);
        BTNRetornarMainMod.setOpaque(true);
        PModificar.add(BTNRetornarMainMod);
       
       //Cerrar sesion Ventana Modificar 
       JButton CSMod = new JButton();
       CSMod.setText("CERRAR SESION");
       CSMod.setFont(new Font("Unispace",100,12));
       CSMod.setBackground(Color.red);
       CSMod.setBounds(10, 620, 150, 40);
       PModificar.add(CSMod);
       
       //Boton Para mostrar resultados
       JButton ShowMod = new JButton();
       ShowMod.setText("MOSTRAR CAMBIOS");
       ShowMod.setFont(new Font("Unispace",100,12));
       ShowMod.setBackground(Color.GREEN);
       ShowMod.setBounds(180, 620, 150, 40);
       PModificar.add(ShowMod);
       
       JButton ButFoundMod = new JButton();
       ButFoundMod.setText("Check");
       ButFoundMod.setFont(new Font("Unispace",100,15));
       ButFoundMod.setBounds(340, 150, 100, 40);
       ButFoundMod.setVisible(true);
       
       PModificar.add(ButFoundMod);
       

       
       //-----------Ventana Eliminar-----------------------------OPCION--6----------------------------------ELIMINAR***************************************************Ventana FUNCION ELIMINAR
       JFrame VEliminar = new JFrame();
       VEliminar.setTitle("Eliminar Termino");
       VEliminar.setDefaultCloseOperation(EXIT_ON_CLOSE);
       VEliminar.setSize(700, 700);
       VEliminar.setVisible(false);
       VEliminar.setLocationRelativeTo(null);
       VEliminar.setResizable(false);
       
       JPanel PEliminar = new JPanel();
       PEliminar.setLayout(null);
       
       VEliminar.getContentPane().add(PEliminar);
       
       
       //agregar icono de Eliminar
       JLabel TagIEliminar = new JLabel(new ImageIcon("EliminarIcono.png"));
       TagIEliminar.setBounds(350, 350, 400, 400); 
       PEliminar.add(TagIEliminar);

       JButton Eliminar = new JButton();
        Eliminar.setText("Eliminar Termino");
        Eliminar.setFont(new Font("Unispace",200,12));
        Eliminar.setBounds(50,460,180,40);
        Eliminar.setMnemonic('e');
        PanelMain.add(Eliminar);
        
        
        
        //PANEL ATRAS ELIMINAR
        JButton BTNRetornarMainElim = new JButton();
        BTNRetornarMainElim.setText("<< ATRAS");
        BTNRetornarMainElim.setBounds(5, 5, 100, 30);
        BTNRetornarMainElim.setOpaque(true);
        PEliminar.add(BTNRetornarMainElim);
       
        JButton CSElim = new JButton();
       CSElim.setText("CERRAR SESION");
       CSElim.setFont(new Font("Unispace",100,12));
       CSElim.setBackground(Color.red);
       CSElim.setBounds(10, 620, 150, 40);
       PEliminar.add(CSElim);
       
       
       //*************************************************************************
       
       
       JComboBox ComboDelete = new JComboBox();
       ComboDelete.setFont(new Font("Unispace",120,20));
        ComboDelete.setBounds(80, 150, 480, 50);
        ComboDelete.addItem("Base de datos");
        ComboDelete.addItem("BlockChain y Criptomonedas");
        ComboDelete.addItem("Computacion en la nube");
        ComboDelete.addItem("Ciencia de datos");
        ComboDelete.addItem("Diseño Grafico");
        ComboDelete.addItem("Desarrollo web");
        ComboDelete.addItem("Formatos y extesiones de archivos");
        ComboDelete.addItem("Inteligencia Artificial");
        ComboDelete.addItem("Informatica");
        ComboDelete.addItem("Marketing Digital");
        ComboDelete.addItem("Programacion y desarrollo de software");
        ComboDelete.addItem("Redes");
        ComboDelete.addItem("Sistemas operativos");
        ComboDelete.addItem("Seguridad informatica");
        ComboDelete.addItem("Videojuegos");
        
        PEliminar.add(ComboDelete);
        
        JLabel WordDelete = new JLabel();
        WordDelete.setBounds(80, 220, 500, 50);
        WordDelete.setText("Ingrese el termino a borrar");
        WordDelete.setFont(new Font("Unispace",120,15));
        PEliminar.add(WordDelete);
        
        JLabel CategSearchDel = new JLabel();
        CategSearchDel.setText("Seleccione categoria del termino buscado");
        CategSearchDel.setFont(new Font("Unispace",500,15));
        CategSearchDel.setBounds(80, 100, 500, 30);
        PEliminar.add(CategSearchDel);
        
        JButton DeleteButton = new JButton();
        DeleteButton.setText("Eliminar");
        DeleteButton.setFont(new Font("Unispace",200,15));
        DeleteButton.setBounds(80, 360, 200, 50);
        DeleteButton.setBackground(Color.red);
        PEliminar.add(DeleteButton);
        
        JTextField FieldDelete = new JTextField();
        FieldDelete.setFont(new Font("Unispace",120,15));
        FieldDelete.setBounds(80, 270, 480, 50);
        PEliminar.add(FieldDelete);
        
        
        
       JButton ButFoundIcon = new JButton();
       ButFoundIcon.setText("Check");
       ButFoundIcon.setFont(new Font("Unispace",100,15));
       ButFoundIcon.setBounds(565, 270, 100, 50);
       ButFoundIcon.setVisible(true);
       
       PEliminar.add(ButFoundIcon);
       
      
        
        
        
         //Boton Para mostrar resultados
       JButton ShowDEL = new JButton();
       ShowDEL.setText("MOSTRAR CAMBIOS");
       ShowDEL.setFont(new Font("Unispace",100,12));
       ShowDEL.setBackground(Color.GREEN);
       ShowDEL.setBounds(180, 620, 150, 40);
       PEliminar.add(ShowDEL);
        
        //FieldDelete.setBounds(WIDTH, WIDTH, WIDTH, WIDTH);
        
        
       
       
//-------------------------------------------FIN DE AGREGADO DE VENTANAS-------------------------------   ** -----------------------------FIN VENTANAS***************************************************FIN AGREGAR VENTANAS PRINCIPALES     
       
        //definir todos los backgrounds
        PanelInicio.setBackground(Color.orange);
        PanelMain.setBackground(Color.orange);
        
        PConsultar.setBackground(Color.orange);
        PListado.setBackground(Color.LIGHT_GRAY);
        PBusqueda.setBackground(Color.orange);
        PIngresar.setBackground(Color.LIGHT_GRAY);
        PModificar.setBackground(Color.orange);
        PEliminar.setBackground(Color.LIGHT_GRAY);
       
    
        
        //--------------------------------------------Boton Atras de cada menu
        
     
 
//-------------------------------------------FIN DE AGREGADO/DECLARADO DE BOTONES-------------------------------   **       


        
        
//-------------------------------------------AGREGAR ACCIONES A BOTONES-------------------------------**                    BOTONES MAIN
      

//Asignar actiones a Botones/ Ventana Inicio
        
       
       
       //Agregar accion a boton Iniciar sesion   
       Start.addActionListener((ActionEvent Opener)->
       {
        VInicio.setVisible(false);
        VentanaMain.setVisible(true);
        
         VentanaMain.setLocationRelativeTo(null);
           
       });
       
       //Agregar accion a Cerrar de ventana INICIO
       Cerrar.addActionListener((ActionEvent Close)->
       {
           
        JOptionPane.showMessageDialog(null, "Saliendo del sistema...","CERRANDO",JOptionPane.WARNING_MESSAGE);  
        System.exit(0);
       });
       
 
      //------------------------------------------------------------------------AGREGAR ACCION A BOTONES DE CERRAR SESION
      Consultar.addActionListener((ActionEvent OpenerConsultar)->
      {
       VentanaMain.setVisible(false);
        VConsultar.setVisible(true);
        
            VConsultar.setLocationRelativeTo(null);
          
      });
      
      
      
      CSMain.addActionListener((ActionEvent )->
      {
        VentanaMain.setVisible(false);
        VInicio.setVisible(true);
          
      });
      
      CSCons.addActionListener((ActionEvent )->
      {
        VConsultar.setVisible(false);
        VInicio.setVisible(true);
          
      });
      
      CSList.addActionListener((ActionEvent )->
      {
        VListado.setVisible(false);
        VInicio.setVisible(true);
          
      });
      
      CSBusq.addActionListener((ActionEvent )->
      {
        VBusqueda.setVisible(false);
        VInicio.setVisible(true);
          
      });
      
      CSIng.addActionListener((ActionEvent )->
      {
        VIngresar.setVisible(false);
        VInicio.setVisible(true);
          
      });
      
      CSMod.addActionListener((ActionEvent )->
      {
        VModificar.setVisible(false);
        VInicio.setVisible(true);
          
      });
      
      CSElim.addActionListener((ActionEvent )->
      {
        VEliminar.setVisible(false);
        VInicio.setVisible(true);
          
      });
      
      //------------------------------------------------------------------------Fin AGREGADO ACCIONES CERRAR SESION
      
      
      //AGREGAR ACCION A BOTON DE Listado
      Listado.addActionListener((ActionEvent OpenerListado)->
      {
        VentanaMain.setVisible(false);
        VListado.setVisible(true);
        
            VConsultar.setLocationRelativeTo(null);
      });
      
      //AGREGAR ACCION A BOTON DE Busqueda
      Busqueda.addActionListener((ActionEvent OpenerBusqueda)->
      {
       VentanaMain.setVisible(false);
       VBusqueda.setVisible(true);
       
            VBusqueda.setLocationRelativeTo(null);
        
       
      });
      
      
      //AGREGAR ACCION A BOTON DE Ingresar
      Ingresar.addActionListener((ActionEvent OpenerIngresar)->
      {
       VentanaMain.setVisible(false);
       VIngresar.setVisible(true);
       
            VIngresar.setLocationRelativeTo(null);
          
      });
      
      
      //AGREGAR ACCION A BOTON DE MODIFICAR
       Modificar.addActionListener((ActionEvent OpenerModificar)->
       {
        VentanaMain.setVisible(false);
        VModificar.setVisible(true);
        
            VModificar.setLocationRelativeTo(null);
       
       
       });
      
//-------------------------------------------AGREGAR ACCIONES A BOTONES-------------------------------**                   FIN BOTONES MAIN      
       
      //AGREGAR ACCION A BOTON DE Eliminar
      Eliminar.addActionListener((ActionEvent OpenerEliminar)->
      {
        VentanaMain.setVisible(false);
        VEliminar.setVisible(true);
        
                VEliminar.setLocationRelativeTo(null);
                
      });

      
      //Agregar Acciones de Botones Atras en Cada Menu-------------------INICIO
      
      BTNRetornarMainCons.addActionListener((ActionEvent)->
      {
         VConsultar.setVisible(false);
         VentanaMain.setVisible(true);
         
         VentanaMain.setLocationRelativeTo(null);
      });
      
      BTNRetornarMainList.addActionListener((ActionEvent)->
      {
        VListado.setVisible(false);
        VentanaMain.setVisible(true);
         
         VentanaMain.setLocationRelativeTo(null);   
          
      });
      
      BTNRetornarMainBusq.addActionListener((ActionEvent)->
      {
        VBusqueda.setVisible(false);
        VentanaMain.setVisible(true);
         
        VentanaMain.setLocationRelativeTo(null); 
        
        SearchField.setText(null);
        
        
          
      });
      
      BTNRetornarMainIng.addActionListener((ActionEvent)->
      {
        VIngresar.setVisible(false);
        VentanaMain.setVisible(true);
         
        VentanaMain.setLocationRelativeTo(null);
          
      });
      
      BTNRetornarMainMod.addActionListener((ActionEvent)->
      {
        VModificar.setVisible(false);
        VentanaMain.setVisible(true);
         
        VentanaMain.setLocationRelativeTo(null);   
        
            //ButFoundMod.setBackground(null);
            FieldModReplace.setText(null);
            FieldModSearch.setText(null);
            DefinitionMod.setText(null);
            
            
        
      });
      
      BTNRetornarMainElim.addActionListener((ActionEvent)->
      {
       VEliminar.setVisible(false);
       VentanaMain.setVisible(true);
         
         VentanaMain.setLocationRelativeTo(null);  
         FieldDelete.setText(null);
         
         
      });
      
      
      //---------------------Botones Atras Ventana Listado----------------------
      
      BCategAtras.addActionListener((ActionEvent)->
      {
          VCateg.setVisible(false);
          VListado.setVisible(true);
          
            VListado.setLocationRelativeTo(null);

      });
      
      
      BNoCategAtras.addActionListener((ActionEvent)->
      {
          VNoCateg.setVisible(false);
          VListado.setVisible(true);
          
            VListado.setLocationRelativeTo(null);

      });
      
      
      
      /////////////////////////////////////////////Botones OPCION 1  /////////////////////////////////////////////
      
      RegresarDeCons.addActionListener((ActionEvent)->
      {
          MostrarListaConsultada.setVisible(false);
          VConsultar.setVisible(true);
         
            
      });
      
      
      ButtonConsConfirm.addActionListener((ActionEvent)->
      {
          VConsultar.setVisible(false);
          MostrarListaConsultada.setVisible(true);
          
          MostrarListaConsultada.setLocationRelativeTo(null);
          
          
          if(Comboconsulta.getSelectedItem()=="Base de datos")
          {
              MostrarListaArea.setText(null);
              MostrarListaArea.append("Termino                 Definicion  \n");
              
              for (int i=0; i<ListaTerminosBD.size(); i++)
              {
                  MostrarListaArea.append(" "+ListaTerminosBD.get(i).getTerminos()+": "+ListaTerminosBD.get(i).getSignificados()+"\n");
              }
              
          }
          
          if(Comboconsulta.getSelectedItem()=="BlockChain y Criptomonedas")
          {
              MostrarListaArea.setText(null);
              MostrarListaArea.append("Termino                 Definicion  \n");
              
              for (int i=0; i<ListaTerminosBC.size(); i++)
              {
                  MostrarListaArea.append(" "+ListaTerminosBC.get(i).getTerminos()+": "+ListaTerminosBC.get(i).getSignificados()+"\n");
              }
              
          }
          
          if(Comboconsulta.getSelectedItem()=="Computacion en la nube")
          {
              MostrarListaArea.setText(null);
              MostrarListaArea.append("Termino                 Definicion  \n");
              
              for (int i=0; i<ListaTerminosCN.size(); i++)
              {
                  MostrarListaArea.append(" "+ListaTerminosCN.get(i).getTerminos()+": "+ListaTerminosCN.get(i).getSignificados()+"\n");
              }
              
          }
          
          if(Comboconsulta.getSelectedItem()=="Ciencia de datos")
          {
              MostrarListaArea.setText(null);
              MostrarListaArea.append("Termino                 Definicion  \n");
              
              for (int i=0; i<ListaTerminosCD.size(); i++)
              {
                  MostrarListaArea.append(" "+ListaTerminosCD.get(i).getTerminos()+": "+ListaTerminosCD.get(i).getSignificados()+"\n");
              }
              
          }
          
          if(Comboconsulta.getSelectedItem()=="Diseño Grafico")
          {
              MostrarListaArea.setText(null);
              MostrarListaArea.append("Termino                 Definicion  \n");
              
              for (int i=0; i<ListaTerminosDG.size(); i++)
              {
                  MostrarListaArea.append(" "+ListaTerminosDG.get(i).getTerminos()+": "+ListaTerminosDG.get(i).getSignificados()+"\n");
              }
              
          }
          
          if(Comboconsulta.getSelectedItem()=="Desarrollo web")
          {
              MostrarListaArea.setText(null);
              MostrarListaArea.append("Termino                 Definicion  \n");
              
              for (int i=0; i<ListaTerminosDW.size(); i++)
              {
                  MostrarListaArea.append(" "+ListaTerminosDW.get(i).getTerminos()+": "+ListaTerminosDW.get(i).getSignificados()+"\n");
              }
              
          }
          
          if(Comboconsulta.getSelectedItem()=="Formatos y extesiones de archivos")
          {
              MostrarListaArea.setText(null);
              MostrarListaArea.append("Termino                 Definicion  \n");
              
              for (int i=0; i<ListaTerminosEA.size(); i++)
              {
                  MostrarListaArea.append(" "+ListaTerminosEA.get(i).getTerminos()+": "+ListaTerminosEA.get(i).getSignificados()+"\n");
              }
              
          }
          
          if(Comboconsulta.getSelectedItem()=="Inteligencia Artificial")
          {
              MostrarListaArea.setText(null);
              MostrarListaArea.append("Termino                 Definicion  \n");
              
              for (int i=0; i<ListaTerminosIA.size(); i++)
              {
                  MostrarListaArea.append(" "+ListaTerminosIA.get(i).getTerminos()+": "+ListaTerminosIA.get(i).getSignificados()+"\n");
              }
              
          }
          
          if(Comboconsulta.getSelectedItem()=="Informatica")
          {
              MostrarListaArea.setText(null);
              MostrarListaArea.append("Termino                 Definicion  \n");
              
              for (int i=0; i<ListaTerminosIF.size(); i++)
              {
                  MostrarListaArea.append(" "+ListaTerminosIF.get(i).getTerminos()+": "+ListaTerminosIF.get(i).getSignificados()+"\n");
              }
              
          }
          
          if(Comboconsulta.getSelectedItem()=="Marketing Digital")
          {
              MostrarListaArea.setText(null);
              MostrarListaArea.append("Termino                 Definicion  \n");
              
              for (int i=0; i<ListaTerminosMD.size(); i++)
              {
                  MostrarListaArea.append(" "+ListaTerminosMD.get(i).getTerminos()+": "+ListaTerminosMD.get(i).getSignificados()+"\n");
              }
              
          }
          
          if(Comboconsulta.getSelectedItem()=="Programacion y desarrollo de software")
          {
              MostrarListaArea.setText(null);
              MostrarListaArea.append("Termino                 Definicion  \n");
              
              for (int i=0; i<ListaTerminosPS.size(); i++)
              {
                  MostrarListaArea.append(" "+ListaTerminosPS.get(i).getTerminos()+": "+ListaTerminosPS.get(i).getSignificados()+"\n");
              }
              
          }
          
          if(Comboconsulta.getSelectedItem()=="Redes")
          {
              MostrarListaArea.setText(null);
              MostrarListaArea.append("Termino                 Definicion  \n");
              
              for (int i=0; i<ListaTerminosRD.size(); i++)
              {
                  MostrarListaArea.append(" "+ListaTerminosRD.get(i).getTerminos()+": "+ListaTerminosRD.get(i).getSignificados()+"\n");
              }
              
          }
          
          if(Comboconsulta.getSelectedItem()=="Sistemas operativos")
          {
              MostrarListaArea.setText(null);
              MostrarListaArea.append("Termino                 Definicion  \n");
              
              for (int i=0; i<ListaTerminosSO.size(); i++)
              {
                  MostrarListaArea.append(" "+ListaTerminosSO.get(i).getTerminos()+": "+ListaTerminosSO.get(i).getSignificados()+"\n");
              }
              
          }
          
          if(Comboconsulta.getSelectedItem()=="Seguridad informatica")
          {
              MostrarListaArea.setText(null);
              MostrarListaArea.append("Termino                 Definicion  \n");
              
              for (int i=0; i<ListaTerminosSI.size(); i++)
              {
                  MostrarListaArea.append(" "+ListaTerminosSI.get(i).getTerminos()+": "+ListaTerminosSI.get(i).getSignificados()+"\n");
              }
              
          }
          
          if(Comboconsulta.getSelectedItem()=="Videojuegos")
          {
              MostrarListaArea.setText(null);
              MostrarListaArea.append("Termino                 Definicion  \n");
              
              for (int i=0; i<ListaTerminosVJ.size(); i++)
              {
                  MostrarListaArea.append(" "+ListaTerminosVJ.get(i).getTerminos()+": "+ListaTerminosVJ.get(i).getSignificados()+"\n");
              }
              
          }
          
          
      });
      
      
      
       /////////////////////////////////////////////Botones OPCION 2  /////////////////////////////////////////////
      
       BCateg.addActionListener((ActionEvent)->
       {
           VListado.setVisible(false);
           VCateg.setVisible(true);
           
                VCateg.setLocationRelativeTo(null);
                
                CategArea.setText(null);
                CategArea.append("\n\nCategoria 1 -------- Base de Datos --------\n\n");
                
                for (int i=0; i<ListaTerminosBD.size(); i++)
                {
                    CategArea.append(" "+ListaTerminosBD.get(i).getTerminos()+"= "+ListaTerminosBD.get(i).getSignificados()+"\n");
                    
                }
                
                CategArea.append("\n\nCategoria 2 -------- BlockChain y Criptomonedas --------\n\n");
                
                for (int i=0; i<ListaTerminosBC.size(); i++)
                {
                    CategArea.append(" "+ListaTerminosBC.get(i).getTerminos()+"= "+ListaTerminosBC.get(i).getSignificados()+"\n");
                    
                }
                
                
                CategArea.append("\n\nCategoria 3 -------- Computacion en la nube --------\n\n");
                
                for (int i=0; i<ListaTerminosCN.size(); i++)
                {
                    CategArea.append(" "+ListaTerminosCN.get(i).getTerminos()+"= "+ListaTerminosCN.get(i).getSignificados()+"\n");
                    
                }
                
                CategArea.append("\n\nCategoria 4 -------- Ciencia de datos --------\n\n");
                
                for (int i=0; i<ListaTerminosCD.size(); i++)
                {
                    CategArea.append(" "+ListaTerminosCD.get(i).getTerminos()+"= "+ListaTerminosCD.get(i).getSignificados()+"\n");
                    
                }
                
                CategArea.append("\n\nCategoria 5 -------- Diseño Grafico --------\n\n");
                
                for (int i=0; i<ListaTerminosDG.size(); i++)
                {
                    CategArea.append(" "+ListaTerminosDG.get(i).getTerminos()+"= "+ListaTerminosDG.get(i).getSignificados()+"\n");
                    
                }
                
                CategArea.append("\n\nCategoria 6 -------- Desarrollo web --------\n\n");
                
                for (int i=0; i<ListaTerminosDW.size(); i++)
                {
                    CategArea.append(" "+ListaTerminosDW.get(i).getTerminos()+"= "+ListaTerminosDW.get(i).getSignificados()+"\n");
                    
                }
                
                CategArea.append("\n\nCategoria 7 ------ Formatos y extesiones de archivos ------\n\n");
                
                for (int i=0; i<ListaTerminosEA.size(); i++)
                {
                    CategArea.append(" "+ListaTerminosEA.get(i).getTerminos()+"= "+ListaTerminosEA.get(i).getSignificados()+"\n");
                    
                }
                
                CategArea.append("\n\nCategoria 8 -------- Inteligencia Artificial --------\n\n");
                
                for (int i=0; i<ListaTerminosIA.size(); i++)
                {
                    CategArea.append(" "+ListaTerminosIA.get(i).getTerminos()+"= "+ListaTerminosIA.get(i).getSignificados()+"\n");
                    
                }
                
                CategArea.append("\n\nCategoria 9 -------- Informatica --------\n\n");
                
                for (int i=0; i<ListaTerminosIF.size(); i++)
                {
                    CategArea.append(" "+ListaTerminosIF.get(i).getTerminos()+"= "+ListaTerminosIF.get(i).getSignificados()+"\n");
                    
                }
                
                CategArea.append("\n\nCategoria 10 -------- Marketing Digital --------\n\n");
                
                for (int i=0; i<ListaTerminosMD.size(); i++)
                {
                    CategArea.append(" "+ListaTerminosMD.get(i).getTerminos()+"= "+ListaTerminosMD.get(i).getSignificados()+"\n");
                    
                }
                
                CategArea.append("\n\nCategoria 11 ----- Programacion y desarrollo de software -----\n\n");
                
                for (int i=0; i<ListaTerminosPS.size(); i++)
                {
                    CategArea.append(" "+ListaTerminosPS.get(i).getTerminos()+"= "+ListaTerminosPS.get(i).getSignificados()+"\n");
                    
                }
                
                CategArea.append("\n\nCategoria 12 -------- Redes --------\n\n");
                
                for (int i=0; i<ListaTerminosRD.size(); i++)
                {
                    CategArea.append(" "+ListaTerminosRD.get(i).getTerminos()+"= "+ListaTerminosRD.get(i).getSignificados()+"\n");
                    
                }
                
                CategArea.append("\n\nCategoria 13 -------- Sistemas operativos --------\n\n");
                
                for (int i=0; i<ListaTerminosSO.size(); i++)
                {
                    CategArea.append(" "+ListaTerminosSO.get(i).getTerminos()+"= "+ListaTerminosSO.get(i).getSignificados()+"\n");
                    
                }
                
                CategArea.append("\n\nCategoria 14 -------- Seguridad informatica --------\n\n");
                
                for (int i=0; i<ListaTerminosSI.size(); i++)
                {
                    CategArea.append(" "+ListaTerminosSI.get(i).getTerminos()+"= "+ListaTerminosSI.get(i).getSignificados()+"\n");
                    
                }
                
                CategArea.append("\n\nCategoria 15 -------- Videojuegos --------\n\n");
                
                for (int i=0; i<ListaTerminosVJ.size(); i++)
                {
                    CategArea.append(" "+ListaTerminosVJ.get(i).getTerminos()+"= "+ListaTerminosVJ.get(i).getSignificados()+"\n");
                    
                }
                
                

       });
       
       
       BNoCateg.addActionListener((ActionEvent)->
       {
           VListado.setVisible(false);
           VNoCateg.setVisible(true);
           
                VNoCateg.setLocationRelativeTo(null);
           
                NoCategArea.setText(null);
                
                
                for (int i=0; i<ListaTerminosBD.size(); i++)
                {
                    NoCategArea.append("\n "+ListaTerminosBD.get(i).getTerminos()+"= "+ListaTerminosBD.get(i).getSignificados()+"\n");
                }
                
                for (int i=0; i<ListaTerminosBC.size(); i++)
                {
                    NoCategArea.append("\n "+ListaTerminosBC.get(i).getTerminos()+"= "+ListaTerminosBC.get(i).getSignificados()+"\n");  
                }
                              
                for (int i=0; i<ListaTerminosCN.size(); i++)
                {
                    NoCategArea.append("\n "+ListaTerminosCN.get(i).getTerminos()+"= "+ListaTerminosCN.get(i).getSignificados()+"\n");    
                }
               
                for (int i=0; i<ListaTerminosCD.size(); i++)
                {
                    NoCategArea.append("\n "+ListaTerminosCD.get(i).getTerminos()+"= "+ListaTerminosCD.get(i).getSignificados()+"\n"); 
                }

                for (int i=0; i<ListaTerminosDG.size(); i++)
                {
                    NoCategArea.append("\n "+ListaTerminosDG.get(i).getTerminos()+"= "+ListaTerminosDG.get(i).getSignificados()+"\n"); 
                }
                
                for (int i=0; i<ListaTerminosDW.size(); i++)
                {
                    NoCategArea.append("\n "+ListaTerminosDW.get(i).getTerminos()+"= "+ListaTerminosDW.get(i).getSignificados()+"\n"); 
                }
    
                for (int i=0; i<ListaTerminosEA.size(); i++)
                {
                    NoCategArea.append("\n "+ListaTerminosEA.get(i).getTerminos()+"= "+ListaTerminosEA.get(i).getSignificados()+"\n"); 
                }
                
                for (int i=0; i<ListaTerminosIA.size(); i++)
                {
                    NoCategArea.append("\n "+ListaTerminosIA.get(i).getTerminos()+"= "+ListaTerminosIA.get(i).getSignificados()+"\n");   
                }
                
                for (int i=0; i<ListaTerminosIF.size(); i++)
                {
                    NoCategArea.append("\n "+ListaTerminosIF.get(i).getTerminos()+"= "+ListaTerminosIF.get(i).getSignificados()+"\n"); 
                }
                
                for (int i=0; i<ListaTerminosMD.size(); i++)
                {
                    NoCategArea.append("\n "+ListaTerminosMD.get(i).getTerminos()+"= "+ListaTerminosMD.get(i).getSignificados()+"\n");    
                }
                
                for (int i=0; i<ListaTerminosPS.size(); i++)
                {
                    NoCategArea.append("\n "+ListaTerminosPS.get(i).getTerminos()+"= "+ListaTerminosPS.get(i).getSignificados()+"\n");  
                }
                
                for (int i=0; i<ListaTerminosRD.size(); i++)
                {
                    NoCategArea.append("\n "+ListaTerminosRD.get(i).getTerminos()+"= "+ListaTerminosRD.get(i).getSignificados()+"\n");
                }
                   
                for (int i=0; i<ListaTerminosSO.size(); i++)
                {
                    NoCategArea.append("\n "+ListaTerminosSO.get(i).getTerminos()+"= "+ListaTerminosSO.get(i).getSignificados()+"\n");
                }
                
                for (int i=0; i<ListaTerminosSI.size(); i++)
                {
                    NoCategArea.append("\n "+ListaTerminosSI.get(i).getTerminos()+"= "+ListaTerminosSI.get(i).getSignificados()+"\n"); 
                }
                
                for (int i=0; i<ListaTerminosVJ.size(); i++)
                {
                    NoCategArea.append("\n "+ListaTerminosVJ.get(i).getTerminos()+"= "+ListaTerminosVJ.get(i).getSignificados()+"\n");
                }
                

               
       });
            ////////////////////*/*/**/*/*/**/*/*/*/*/*/*/***/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*Fin de Ventana Acciones Listtas Ventana2
       
            
            ///////////////////////////////////////////// INICIO Botones OPCION BUSCAR TERMINOS  /////////////////////////////////////////////
            
            ButSearch.addActionListener((ActionSearch)->
            {
               //1
                for(int i=0; i<ListaTerminosBD.size();i++)
                        {
                            if(SearchField.getText().equalsIgnoreCase(ListaTerminosBD.get(i).getTerminos()))
                            { 
                               JOptionPane.showMessageDialog(null, ListaTerminosBD.get(i).getTerminos()+": "+ListaTerminosBD.get(i).getSignificados(),"Resultados de Busqueda",JOptionPane.INFORMATION_MESSAGE);
                              SearchField.setText("");
                            }
                        } 
                
                //2
                for(int i=0; i<ListaTerminosBC.size();i++)
                        {
                            if(SearchField.getText().equalsIgnoreCase(ListaTerminosBC.get(i).getTerminos()))
                            { 
                               JOptionPane.showMessageDialog(null, ListaTerminosBC.get(i).getTerminos()+": "+ListaTerminosBC.get(i).getSignificados(),"Resultados de Busqueda",JOptionPane.INFORMATION_MESSAGE);
                              SearchField.setText("");
                            }
                        } 
                
                //3
                for(int i=0; i<ListaTerminosCN.size();i++)
                        {
                            if(SearchField.getText().equalsIgnoreCase(ListaTerminosCN.get(i).getTerminos()))
                            { 
                               JOptionPane.showMessageDialog(null, ListaTerminosCN.get(i).getTerminos()+": "+ListaTerminosCN.get(i).getSignificados(),"Resultados de Busqueda",JOptionPane.INFORMATION_MESSAGE);
                              SearchField.setText("");
                            }
                        } 
                
                //4
                for(int i=0; i<ListaTerminosCD.size();i++)
                        {
                            if(SearchField.getText().equalsIgnoreCase(ListaTerminosCD.get(i).getTerminos()))
                            { 
                               JOptionPane.showMessageDialog(null, ListaTerminosCD.get(i).getTerminos()+": "+ListaTerminosCD.get(i).getSignificados(),"Resultados de Busqueda",JOptionPane.INFORMATION_MESSAGE);
                              SearchField.setText("");
                            }
                        } 
                
                //5
                for(int i=0; i<ListaTerminosDG.size();i++)
                        {
                            if(SearchField.getText().equalsIgnoreCase(ListaTerminosDG.get(i).getTerminos()))
                            { 
                               JOptionPane.showMessageDialog(null, ListaTerminosDG.get(i).getTerminos()+": "+ListaTerminosDG.get(i).getSignificados(),"Resultados de Busqueda",JOptionPane.INFORMATION_MESSAGE);
                              SearchField.setText("");
                            }
                        } 
                
                //6
                for(int i=0; i<ListaTerminosDW.size();i++)
                        {
                            if(SearchField.getText().equalsIgnoreCase(ListaTerminosDW.get(i).getTerminos()))
                            { 
                               JOptionPane.showMessageDialog(null, ListaTerminosDW.get(i).getTerminos()+": "+ListaTerminosDW.get(i).getSignificados(),"Resultados de Busqueda",JOptionPane.INFORMATION_MESSAGE);
                              SearchField.setText("");
                            }
                        } 
                
                //7
                for(int i=0; i<ListaTerminosEA.size();i++)
                        {
                            if(SearchField.getText().equalsIgnoreCase(ListaTerminosEA.get(i).getTerminos()))
                            { 
                               JOptionPane.showMessageDialog(null, ListaTerminosEA.get(i).getTerminos()+": "+ListaTerminosEA.get(i).getSignificados(),"Resultados de Busqueda",JOptionPane.INFORMATION_MESSAGE);
                              SearchField.setText("");
                            }
                        } 
                
                //8
                for(int i=0; i<ListaTerminosIA.size();i++)
                        {
                            if(SearchField.getText().equalsIgnoreCase(ListaTerminosIA.get(i).getTerminos()))
                            { 
                               JOptionPane.showMessageDialog(null, ListaTerminosIA.get(i).getTerminos()+": "+ListaTerminosIA.get(i).getSignificados(),"Resultados de Busqueda",JOptionPane.INFORMATION_MESSAGE);
                              SearchField.setText("");
                            }
                        } 
                //9
                for(int i=0; i<ListaTerminosIF.size();i++)
                        {
                            if(SearchField.getText().equalsIgnoreCase(ListaTerminosIF.get(i).getTerminos()))
                            { 
                               JOptionPane.showMessageDialog(null, ListaTerminosIF.get(i).getTerminos()+": "+ListaTerminosIF.get(i).getSignificados(),"Resultados de Busqueda",JOptionPane.INFORMATION_MESSAGE);
                              SearchField.setText("");
                            }
                        } 
                
                //10
                for(int i=0; i<ListaTerminosMD.size();i++)
                        {
                            if(SearchField.getText().equalsIgnoreCase(ListaTerminosMD.get(i).getTerminos()))
                            { 
                               JOptionPane.showMessageDialog(null, ListaTerminosMD.get(i).getTerminos()+": "+ListaTerminosMD.get(i).getSignificados(),"Resultados de Busqueda",JOptionPane.INFORMATION_MESSAGE);
                              SearchField.setText("");
                            }
                        } 
                
                //11
                for(int i=0; i<ListaTerminosPS.size();i++)
                        {
                            if(SearchField.getText().equalsIgnoreCase(ListaTerminosPS.get(i).getTerminos()))
                            { 
                               JOptionPane.showMessageDialog(null, ListaTerminosPS.get(i).getTerminos()+": "+ListaTerminosPS.get(i).getSignificados(),"Resultados de Busqueda",JOptionPane.INFORMATION_MESSAGE);
                              SearchField.setText("");
                            }
                        }
                
                //12
                for(int i=0; i<ListaTerminosRD.size();i++)
                        {
                            if(SearchField.getText().equalsIgnoreCase(ListaTerminosRD.get(i).getTerminos()))
                            { 
                               JOptionPane.showMessageDialog(null, ListaTerminosRD.get(i).getTerminos()+": "+ListaTerminosRD.get(i).getSignificados(),"Resultados de Busqueda",JOptionPane.INFORMATION_MESSAGE);
                              SearchField.setText("");
                            }
                        }
                
                //13
                for(int i=0; i<ListaTerminosSO.size();i++)
                        {
                            if(SearchField.getText().equalsIgnoreCase(ListaTerminosSO.get(i).getTerminos()))
                            { 
                               JOptionPane.showMessageDialog(null, ListaTerminosSO.get(i).getTerminos()+": "+ListaTerminosSO.get(i).getSignificados(),"Resultados de Busqueda",JOptionPane.INFORMATION_MESSAGE);
                              SearchField.setText("");
                            }
                        }
                
                //14
                for(int i=0; i<ListaTerminosSI.size();i++)
                        {
                            if(SearchField.getText().equalsIgnoreCase(ListaTerminosSI.get(i).getTerminos()))
                            { 
                               JOptionPane.showMessageDialog(null, ListaTerminosSI.get(i).getTerminos()+": "+ListaTerminosSI.get(i).getSignificados(),"Resultados de Busqueda",JOptionPane.INFORMATION_MESSAGE);
                              SearchField.setText("");
                            }
                        }
                
                //15
                for(int i=0; i<ListaTerminosVJ.size();i++)
                        {
                            if(SearchField.getText().equalsIgnoreCase(ListaTerminosVJ.get(i).getTerminos()))
                            { 
                               JOptionPane.showMessageDialog(null, ListaTerminosVJ.get(i).getTerminos()+": "+ListaTerminosVJ.get(i).getSignificados(),"Resultados de Busqueda",JOptionPane.INFORMATION_MESSAGE);
                              SearchField.setText("");
                            }
                        }
            
            });
            
  
            
            
            /////////////////////////////////////////////Botones OPCION Agregar Terminos  /////////////////////////////////////////////
            
            ButtonTermAdd.addActionListener((ActionEvent)->
            {
                
             if(JComboAgregar.getSelectedItem()=="Base de datos")
             {
                 
                 ListaTerminosBD.add(new Clase_Terminos(FieldNewTerm.getText(),AreaNewTermDef.getText()));
              
                JOptionPane.showMessageDialog(null, "Termino agregado satisfactoriamente!","AGREGAR TERMINO",JOptionPane.INFORMATION_MESSAGE);
             }
             
             if(JComboAgregar.getSelectedItem()=="BlockChain y Criptomonedas")
             {
                 ListaTerminosBC.add(new Clase_Terminos(FieldNewTerm.getText(),AreaNewTermDef.getText()));

                 JOptionPane.showMessageDialog(null, "Termino agregado satisfactoriamente!","AGREGAR TERMINO",JOptionPane.INFORMATION_MESSAGE);
             }
             
             if(JComboAgregar.getSelectedItem()=="Computacion en la nube")
             {
                 ListaTerminosCN.add(new Clase_Terminos(FieldNewTerm.getText(),AreaNewTermDef.getText()));
                 
                 JOptionPane.showMessageDialog(null, "Termino agregado satisfactoriamente!","AGREGAR TERMINO",JOptionPane.INFORMATION_MESSAGE);
             }
             
             if(JComboAgregar.getSelectedItem()=="Ciencia de datos")
             {
                 ListaTerminosCD.add(new Clase_Terminos(FieldNewTerm.getText(),AreaNewTermDef.getText()));
                 
                 JOptionPane.showMessageDialog(null, "Termino agregado satisfactoriamente!","AGREGAR TERMINO",JOptionPane.INFORMATION_MESSAGE);
             }
             
             if(JComboAgregar.getSelectedItem()=="Diseño Grafico")
             {
                 ListaTerminosDG.add(new Clase_Terminos(FieldNewTerm.getText(),AreaNewTermDef.getText()));
                 
                 JOptionPane.showMessageDialog(null, "Termino agregado satisfactoriamente!","AGREGAR TERMINO",JOptionPane.INFORMATION_MESSAGE);
             }
             
             if(JComboAgregar.getSelectedItem()=="Desarrollo web")
             {
                 ListaTerminosDW.add(new Clase_Terminos(FieldNewTerm.getText(),AreaNewTermDef.getText()));
                 
                 JOptionPane.showMessageDialog(null, "Termino agregado satisfactoriamente!","AGREGAR TERMINO",JOptionPane.INFORMATION_MESSAGE);
             }
             
             if(JComboAgregar.getSelectedItem()=="Formato y extensiones de archivos")
             {
                 ListaTerminosEA.add(new Clase_Terminos(FieldNewTerm.getText(),AreaNewTermDef.getText()));
                 
                 JOptionPane.showMessageDialog(null, "Termino agregado satisfactoriamente!","AGREGAR TERMINO",JOptionPane.INFORMATION_MESSAGE);
             }
             
             if(JComboAgregar.getSelectedItem()=="Inteligencia Artificial")
             {
                 ListaTerminosIA.add(new Clase_Terminos(FieldNewTerm.getText(),AreaNewTermDef.getText()));
                 
                 JOptionPane.showMessageDialog(null, "Termino agregado satisfactoriamente!","AGREGAR TERMINO",JOptionPane.INFORMATION_MESSAGE); 
             }
             
             if(JComboAgregar.getSelectedItem()=="Informatica")
             {
                 ListaTerminosIF.add(new Clase_Terminos(FieldNewTerm.getText(),AreaNewTermDef.getText()));
                 
                 JOptionPane.showMessageDialog(null, "Termino agregado satisfactoriamente!","AGREGAR TERMINO",JOptionPane.INFORMATION_MESSAGE);
             }
             
             if(JComboAgregar.getSelectedItem()=="Marketing Digital")
             {
                 ListaTerminosMD.add(new Clase_Terminos(FieldNewTerm.getText(),AreaNewTermDef.getText()));
                 
                 JOptionPane.showMessageDialog(null, "Termino agregado satisfactoriamente!","AGREGAR TERMINO",JOptionPane.INFORMATION_MESSAGE);
             }
             
             if(JComboAgregar.getSelectedItem()=="Programacion y desarrollo de software")
             {
                 ListaTerminosPS.add(new Clase_Terminos(FieldNewTerm.getText(),AreaNewTermDef.getText()));
                 
                 JOptionPane.showMessageDialog(null, "Termino agregado satisfactoriamente!","AGREGAR TERMINO",JOptionPane.INFORMATION_MESSAGE);
             }
             
             if(JComboAgregar.getSelectedItem()=="Redes")
             {
                 ListaTerminosRD.add(new Clase_Terminos(FieldNewTerm.getText(),AreaNewTermDef.getText()));
                 
                JOptionPane.showMessageDialog(null, "Termino agregado satisfactoriamente!","AGREGAR TERMINO",JOptionPane.INFORMATION_MESSAGE); 
             }
             
             if(JComboAgregar.getSelectedItem()=="Sistemas operativos")
             {
                 ListaTerminosSO.add(new Clase_Terminos(FieldNewTerm.getText(),AreaNewTermDef.getText()));
                 
                 JOptionPane.showMessageDialog(null, "Termino agregado satisfactoriamente!","AGREGAR TERMINO",JOptionPane.INFORMATION_MESSAGE);
             }
             
             if(JComboAgregar.getSelectedItem()=="Seguridad informatica")
             {
                 ListaTerminosSI.add(new Clase_Terminos(FieldNewTerm.getText(),AreaNewTermDef.getText()));
                 
                 JOptionPane.showMessageDialog(null, "Termino agregado satisfactoriamente!","AGREGAR TERMINO",JOptionPane.INFORMATION_MESSAGE);  
             }
             
             if(JComboAgregar.getSelectedItem()=="Videojuegos")
             {
                 ListaTerminosVJ.add(new Clase_Terminos(FieldNewTerm.getText(),AreaNewTermDef.getText()));
                 
                 JOptionPane.showMessageDialog(null, "Termino agregado satisfactoriamente!","AGREGAR TERMINO",JOptionPane.INFORMATION_MESSAGE);
             }
             
            //Funcion para dejar las areas de texto limpias 
            FieldNewTerm.setText("");
            AreaNewTermDef.setText("");
            
            
            });

            ///////////////////////////////////////////// FIN Botones OPCION Agregar Terminos  /////////////////////////////////////////////
            
            
            /////////////////////////////////////////////Botones OPCION Eliminar Terminos  /////////////////////////////////////////////+              pendiente!!!
            
            //mostrar */*/*/*//*
            ButFoundIcon.addActionListener((ActionEvent)->
            {
                //inicio
            
                if(ComboDelete.getSelectedItem()=="Base de datos")
                    {
                        for(int i=0; i<ListaTerminosBD.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosBD.get(i).getTerminos()))
                            { 
                               ButFoundIcon.setBackground(Color.green);
                               
                               

                            }
                        } 
                    }
                
                             
                 
                 if(ComboDelete.getSelectedItem()=="BlockChain y Criptomonedas")
                    {
                        for(int i=0; i<ListaTerminosBC.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosBC.get(i).getTerminos()))
                            {
                                 ButFoundIcon.setBackground(Color.green);

                            }
                        } 
                    }
                 
                 
                 if(ComboDelete.getSelectedItem()=="Computacion en la nube")
                    {
                        for(int i=0; i<ListaTerminosCN.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosCN.get(i).getTerminos()))
                            {
                                 ButFoundIcon.setBackground(Color.green);

                            }
                        } 
                    }
                 
                 
                 if(ComboDelete.getSelectedItem()=="Ciencia de datos")
                    {
                        for(int i=0; i<ListaTerminosCD.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosCD.get(i).getTerminos()))
                            {
                                 ButFoundIcon.setBackground(Color.green);

                            }
                        } 
                    }
                 
                 
                 if(ComboDelete.getSelectedItem()=="Diseño Grafico")
                    {
                        for(int i=0; i<ListaTerminosDG.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosDG.get(i).getTerminos()))
                            {
                                 ButFoundIcon.setBackground(Color.green);

                            }
                        } 
                    }
                 
                 
                 if(ComboDelete.getSelectedItem()=="Desarrollo web")
                    {
                        for(int i=0; i<ListaTerminosDW.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosDW.get(i).getTerminos()))
                            {
                                 ButFoundIcon.setBackground(Color.green);

                            }
                        } 
                    }
                 
                 
                 if(ComboDelete.getSelectedItem()=="Formato y extensiones de archivos")
                    {
                        for(int i=0; i<ListaTerminosEA.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosEA.get(i).getTerminos()))
                            {
                                 ButFoundIcon.setBackground(Color.green);

                            }
                        } 
                    }
                 
                 
                 if(ComboDelete.getSelectedItem()=="Inteligencia Artificial")
                    {
                        for(int i=0; i<ListaTerminosIA.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosIA.get(i).getTerminos()))
                            {
                                 ButFoundIcon.setBackground(Color.green);

                            }
                        } 
                    }
                 
                 
                 if(ComboDelete.getSelectedItem()=="Informatica")
                    {
                        for(int i=0; i<ListaTerminosIF.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosIF.get(i).getTerminos()))
                            {
                                 ButFoundIcon.setBackground(Color.green);

                            }
                        } 
                    }
                
                 
                
                 
                 if(ComboDelete.getSelectedItem()=="Marketing Digital")
                    {
                        for(int i=0; i<ListaTerminosMD.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosMD.get(i).getTerminos()))
                            {
                                 ButFoundIcon.setBackground(Color.green);

                            }
                        } 
                    }
                 
                 
                 if(ComboDelete.getSelectedItem()=="Programacion y desarrollo de software")
                    {
                        for(int i=0; i<ListaTerminosPS.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosPS.get(i).getTerminos()))
                            {
                                 ButFoundIcon.setBackground(Color.green);

                            }
                        } 
                    }
                 
                 
                 if(ComboDelete.getSelectedItem()=="Redes")
                    {
                        for(int i=0; i<ListaTerminosRD.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosRD.get(i).getTerminos()))
                            {
                                 ButFoundIcon.setBackground(Color.green);

                            }
                        } 
                    }
                 
                 
                 if(ComboDelete.getSelectedItem()=="Sistemas operativos")
                    {
                        for(int i=0; i<ListaTerminosSO.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosSO.get(i).getTerminos()))
                            {
                                 ButFoundIcon.setBackground(Color.green);

                            }
                        } 
                    }
            
                 
                 if(ComboDelete.getSelectedItem()=="Seguridad informatica")
                    {
                        for(int i=0; i<ListaTerminosSI.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosSI.get(i).getTerminos()))
                            {
                                 ButFoundIcon.setBackground(Color.green);

                            }
                        } 
                    }
               
                 
                 
                 if(ComboDelete.getSelectedItem()=="Videojuegos")
                    {
                        for(int i=0; i<ListaTerminosVJ.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosVJ.get(i).getTerminos()))
                            {
                                 ButFoundIcon.setBackground(Color.green);

                            }
                        } 
                    }
               
             
                 
                 
             });

                //fin
            
            
            
            
            
            //revisada
             DeleteButton.addActionListener((ActionEvent)->
             {
                 if(ComboDelete.getSelectedItem()=="Base de datos")
                    {
                        for(int i=0; i<ListaTerminosBD.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosBD.get(i).getTerminos()))
                            { 
                                JOptionPane.showMessageDialog(null, "El Termino: "+FieldDelete.getText()+" ha sido eliminado!","Eliminado",JOptionPane.WARNING_MESSAGE);
                               ListaTerminosBD.remove(i);
                               ButFoundIcon.setBackground(null);
                            }
                        } 
                    }
                 
                 
                 
                 if(ComboDelete.getSelectedItem()=="BlockChain y Criptomonedas")
                    {
                        for(int i=0; i<ListaTerminosBC.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosBC.get(i).getTerminos()))
                            {
                                JOptionPane.showMessageDialog(null, "El Termino: "+FieldDelete.getText()+" ha sido eliminado!","Eliminado",JOptionPane.WARNING_MESSAGE);
                               ListaTerminosBC.remove(i);
                               ButFoundIcon.setBackground(null);

                            }
                        } 
                    }
                 
                 if(ComboDelete.getSelectedItem()=="Computacion en la nube")
                    {
                        for(int i=0; i<ListaTerminosCN.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosCN.get(i).getTerminos()))
                            {
                                JOptionPane.showMessageDialog(null, "El Termino: "+FieldDelete.getText()+" ha sido eliminado!","Eliminado",JOptionPane.WARNING_MESSAGE);
                               ListaTerminosCN.remove(i);
                               ButFoundIcon.setBackground(null);

                            }
                        } 
                    }
                 
                 if(ComboDelete.getSelectedItem()=="Ciencia de datos")
                    {
                        for(int i=0; i<ListaTerminosCD.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosCD.get(i).getTerminos()))
                            {
                                JOptionPane.showMessageDialog(null, "El Termino: "+FieldDelete.getText()+" ha sido eliminado!","Eliminado",JOptionPane.WARNING_MESSAGE);
                               ListaTerminosCD.remove(i);
                               ButFoundIcon.setBackground(null);

                            }
                        } 
                    }
                 
                 if(ComboDelete.getSelectedItem()=="Diseño Grafico")
                    {
                        for(int i=0; i<ListaTerminosDG.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosDG.get(i).getTerminos()))
                            {
                                JOptionPane.showMessageDialog(null, "El Termino: "+FieldDelete.getText()+" ha sido eliminado!","Eliminado",JOptionPane.WARNING_MESSAGE);
                               ListaTerminosDG.remove(i);
                               ButFoundIcon.setBackground(null);

                            }
                        } 
                    }
                 
                 if(ComboDelete.getSelectedItem()=="Desarrollo web")
                    {
                        for(int i=0; i<ListaTerminosDW.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosDW.get(i).getTerminos()))
                            {
                                JOptionPane.showMessageDialog(null, "El Termino: "+FieldDelete.getText()+" ha sido eliminado!","Eliminado",JOptionPane.WARNING_MESSAGE);
                               ListaTerminosDW.remove(i);
                               ButFoundIcon.setBackground(null);

                            }
                        } 
                    }
                 
                 if(ComboDelete.getSelectedItem()=="Formato y extensiones de archivos")
                    {
                        for(int i=0; i<ListaTerminosEA.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosEA.get(i).getTerminos()))
                            {
                                JOptionPane.showMessageDialog(null, "El Termino: "+FieldDelete.getText()+" ha sido eliminado!","Eliminado",JOptionPane.WARNING_MESSAGE);
                               ListaTerminosEA.remove(i);
                               ButFoundIcon.setBackground(null);

                            }
                        } 
                    }
                 
                 if(ComboDelete.getSelectedItem()=="Inteligencia Artificial")
                    {
                        for(int i=0; i<ListaTerminosIA.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosIA.get(i).getTerminos()))
                            {
                                JOptionPane.showMessageDialog(null, "El Termino: "+FieldDelete.getText()+" ha sido eliminado!","Eliminado",JOptionPane.WARNING_MESSAGE);
                               ListaTerminosIA.remove(i);
                               ButFoundIcon.setBackground(null);

                            }
                        } 
                    }
                 
                 if(ComboDelete.getSelectedItem()=="Informatica")
                    {
                        for(int i=0; i<ListaTerminosIF.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosIF.get(i).getTerminos()))
                            {
                                JOptionPane.showMessageDialog(null, "El Termino: "+FieldDelete.getText()+" ha sido eliminado!","Eliminado",JOptionPane.WARNING_MESSAGE);
                               ListaTerminosIF.remove(i);
                               ButFoundIcon.setBackground(null);

                            }
                        } 
                    }
                 
                 
                 
                 if(ComboDelete.getSelectedItem()=="Marketing Digital")
                    {
                        for(int i=0; i<ListaTerminosMD.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosMD.get(i).getTerminos()))
                            {
                                JOptionPane.showMessageDialog(null, "El Termino: "+FieldDelete.getText()+" ha sido eliminado!","Eliminado",JOptionPane.WARNING_MESSAGE);
                               ListaTerminosMD.remove(i);
                               ButFoundIcon.setBackground(null);

                            }
                        } 
                    }
                 
                 if(ComboDelete.getSelectedItem()=="Programacion y desarrollo de software")
                    {
                        for(int i=0; i<ListaTerminosPS.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosPS.get(i).getTerminos()))
                            {
                                JOptionPane.showMessageDialog(null, "El Termino: "+FieldDelete.getText()+" ha sido eliminado!","Eliminado",JOptionPane.WARNING_MESSAGE);
                               ListaTerminosPS.remove(i);
                               ButFoundIcon.setBackground(null);

                            }
                        } 
                    }
                 
                 if(ComboDelete.getSelectedItem()=="Redes")
                    {
                        for(int i=0; i<ListaTerminosRD.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosRD.get(i).getTerminos()))
                            {
                                JOptionPane.showMessageDialog(null, "El Termino: "+FieldDelete.getText()+" ha sido eliminado!","Eliminado",JOptionPane.WARNING_MESSAGE);
                               ListaTerminosRD.remove(i);
                               ButFoundIcon.setBackground(null);

                            }
                        } 
                    }
                 
                 if(ComboDelete.getSelectedItem()=="Sistemas operativos")
                    {
                        for(int i=0; i<ListaTerminosSO.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosSO.get(i).getTerminos()))
                            {
                                JOptionPane.showMessageDialog(null, "El Termino: "+FieldDelete.getText()+" ha sido eliminado!","Eliminado",JOptionPane.WARNING_MESSAGE);
                               ListaTerminosSO.remove(i);
                               ButFoundIcon.setBackground(null);

                            }
                        } 
                    }
                 
                 if(ComboDelete.getSelectedItem()=="Seguridad informatica")
                    {
                        for(int i=0; i<ListaTerminosSI.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosSI.get(i).getTerminos()))
                            {
                                JOptionPane.showMessageDialog(null, "El Termino: "+FieldDelete.getText()+" ha sido eliminado!","Eliminado",JOptionPane.WARNING_MESSAGE);
                               ListaTerminosSI.remove(i);
                               ButFoundIcon.setBackground(null);

                            }
                        } 
                    }
                 
                 
                 if(ComboDelete.getSelectedItem()=="Videojuegos")
                    {
                        for(int i=0; i<ListaTerminosVJ.size();i++)
                        {
                            if(FieldDelete.getText().equalsIgnoreCase(ListaTerminosVJ.get(i).getTerminos()))
                            {
                                JOptionPane.showMessageDialog(null, "El Termino: "+FieldDelete.getText()+" ha sido eliminado!","Eliminado",JOptionPane.WARNING_MESSAGE);
                               ListaTerminosVJ.remove(i);
                               ButFoundIcon.setBackground(null);

                            }
                        } 
                    }
             
                 
                 
             });
             
             
             
             //ACCion mostrar cambios en eliminar
             
             ShowDEL.addActionListener((ActionEvent)->
             {
                 
                 
                 VEliminar.setVisible(false);
                 VConsultar.setVisible(true);
                 
                        VConsultar.setLocationRelativeTo(null);
                
                        
                 FieldDelete.setText("");
             
             });
             
   
            
            ///////////////////////////////////////////// FIN Botones OPCION Agregar Terminos  /////////////////////////////////////////////-
  
            
            
            
      
      //Botones Modificar
      
     ButtonModSearch.addActionListener((ActionEvent Buscar)->
     {
         
        if(JComboSelCateg.getSelectedItem()=="Base de datos")
        {
            for(int i=0; i<ListaTerminosBD.size();i++)
            {
                if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosBD.get(i).getTerminos()))
                {
                    
                JOptionPane.showMessageDialog(null, "El termino: "+FieldModSearch.getText()+" fue suplantado. Modificacion exitosa!");
                    
                    ListaTerminosBD.get(i).setTerminos(FieldModReplace.getText());
                    ListaTerminosBD.get(i).setSignificados(DefinitionMod.getText());
                    
                    
                    
                    
                    
                }
                
                
          
            } 
        }
     
        if(JComboSelCateg.getSelectedItem()=="BlockChain y Criptomonedas")
        {
            for(int i=0; i<ListaTerminosBC.size();i++)
            {
                if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosBC.get(i).getTerminos()))
                {
                    JOptionPane.showMessageDialog(null, "El termino: "+FieldModSearch.getText()+" fue suplantado. Modificacion exitosa!");
                    
                    ListaTerminosBC.get(i).setTerminos(FieldModReplace.getText());
                    ListaTerminosBC.get(i).setSignificados(DefinitionMod.getText());
  
                }
                
               
            }
            
        }
        
        if(JComboSelCateg.getSelectedItem()=="Computacion en la nube")
        {
            for(int i=0; i<ListaTerminosCN.size();i++)
            {
                if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosCN.get(i).getTerminos()))
                {
                    JOptionPane.showMessageDialog(null, "El termino: "+FieldModSearch.getText()+" fue suplantado. Modificacion exitosa!");
                    
                    ListaTerminosCN.get(i).setTerminos(FieldModReplace.getText());
                    ListaTerminosCN.get(i).setSignificados(DefinitionMod.getText());
                }
                
  
            } 
            
        }  
        
        
        if(JComboSelCateg.getSelectedItem()=="Ciencia de datos")
        {
            for(int i=0; i<ListaTerminosCD.size();i++)
            {
                if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosCD.get(i).getTerminos()))
                {
                    JOptionPane.showMessageDialog(null, "El termino: "+FieldModSearch.getText()+" fue suplantado. Modificacion exitosa!");
                   
                    ListaTerminosCD.get(i).setTerminos(FieldModReplace.getText());
                    ListaTerminosCD.get(i).setSignificados(DefinitionMod.getText());
                }
                
      
            } 
            
        }
        
        if(JComboSelCateg.getSelectedItem()=="Diseño Grafico")
        {
            for(int i=0; i<ListaTerminosDG.size();i++)
            {
                if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosDG.get(i).getTerminos()))
                {
                   JOptionPane.showMessageDialog(null, "El termino: "+FieldModSearch.getText()+" fue suplantado. Modificacion exitosa!");
                   
                   ListaTerminosDG.get(i).setTerminos(FieldModReplace.getText());
                   ListaTerminosDG.get(i).setSignificados(DefinitionMod.getText());
                }
                
            } 
            
        }
        
        if(JComboSelCateg.getSelectedItem()=="Desarrollo web")
        {
            for(int i=0; i<ListaTerminosDW.size();i++)
            {
                if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosDW.get(i).getTerminos()))
                {
                    JOptionPane.showMessageDialog(null, "El termino: "+FieldModSearch.getText()+" fue suplantado. Modificacion exitosa!");
                    
                    ListaTerminosDW.get(i).setTerminos(FieldModReplace.getText());
                    ListaTerminosDW.get(i).setSignificados(DefinitionMod.getText());
                }
                
            } 
            
        }
        
        if(JComboSelCateg.getSelectedItem()=="Formato y extensiones de archivos")
        {
            for(int i=0; i<ListaTerminosEA.size();i++)
            {
                if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosEA.get(i).getTerminos()))
                {
                    JOptionPane.showMessageDialog(null, "El termino: "+FieldModSearch.getText()+" fue suplantado. Modificacion exitosa!");
                    
                    ListaTerminosEA.get(i).setTerminos(FieldModReplace.getText());
                    ListaTerminosEA.get(i).setSignificados(DefinitionMod.getText());
                }
                
            } 
            
        }
        
        if(JComboSelCateg.getSelectedItem()=="Inteligencia Artificial")
        {
            for(int i=0; i<ListaTerminosIA.size();i++)
            {
                if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosIA.get(i).getTerminos()))
                {
                    JOptionPane.showMessageDialog(null, "El termino: "+FieldModSearch.getText()+" fue suplantado. Modificacion exitosa!");
                    
                    ListaTerminosIA.get(i).setTerminos(FieldModReplace.getText());
                    ListaTerminosIA.get(i).setSignificados(DefinitionMod.getText());
                }
                               
            } 
            
        }
        
        if(JComboSelCateg.getSelectedItem()=="Informatica")
        {
            for(int i=0; i<ListaTerminosIF.size();i++)
            {
                if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosIF.get(i).getTerminos()))
                {
                    JOptionPane.showMessageDialog(null, "El termino: "+FieldModSearch.getText()+" fue suplantado. Modificacion exitosa!");
                    
                    ListaTerminosIF.get(i).setTerminos(FieldModReplace.getText());
                    ListaTerminosIF.get(i).setSignificados(DefinitionMod.getText());
                    
                }
                     
            } 
            
        }
        
        if(JComboSelCateg.getSelectedItem()=="Marketing Digital")
        {
            for(int i=0; i<ListaTerminosMD.size();i++)
            {
                if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosMD.get(i).getTerminos()))
                {
                    JOptionPane.showMessageDialog(null, "El termino: "+FieldModSearch.getText()+" fue suplantado. Modificacion exitosa!");
                 
                    ListaTerminosMD.get(i).setTerminos(FieldModReplace.getText());
                    ListaTerminosMD.get(i).setSignificados(DefinitionMod.getText());
                    
                }
                  
            } 
            
        }
        
        if(JComboSelCateg.getSelectedItem()=="Programacion y desarrollo de software")
        {
            for(int i=0; i<ListaTerminosPS.size();i++)
            {
                if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosPS.get(i).getTerminos()))
                {
                    JOptionPane.showMessageDialog(null, "El termino: "+FieldModSearch.getText()+" fue suplantado. Modificacion exitosa!");
                    
                    ListaTerminosPS.get(i).setTerminos(FieldModReplace.getText());
                    ListaTerminosPS.get(i).setSignificados(DefinitionMod.getText());
                    
                }
                   
            } 
            
        }
        
        if(JComboSelCateg.getSelectedItem()=="Redes")
        {
            for(int i=0; i<ListaTerminosRD.size();i++)
            {
                if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosRD.get(i).getTerminos()))
                {
                    JOptionPane.showMessageDialog(null, "El termino: "+FieldModSearch.getText()+" fue suplantado. Modificacion exitosa!");
                    
                    ListaTerminosRD.get(i).setTerminos(FieldModReplace.getText());
                    ListaTerminosRD.get(i).setSignificados(DefinitionMod.getText());
                    
                }
                              
            } 
            
        }
        
        if(JComboSelCateg.getSelectedItem()=="Sistemas operativos")
        {
            for(int i=0; i<ListaTerminosSO.size();i++)
            {
                if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosSO.get(i).getTerminos()))
                {
                    JOptionPane.showMessageDialog(null, "El termino: "+FieldModSearch.getText()+" fue suplantado. Modificacion exitosa!");
                    
                    ListaTerminosSO.get(i).setTerminos(FieldModReplace.getText());
                    ListaTerminosSO.get(i).setSignificados(DefinitionMod.getText());
                    
                }
                  
            } 
            
        }
        
        if(JComboSelCateg.getSelectedItem()=="Seguridad informatica")
        {
            for(int i=0; i<ListaTerminosSI.size();i++)
            {
                if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosSI.get(i).getTerminos()))
                {
                    JOptionPane.showMessageDialog(null, "El termino: "+FieldModSearch.getText()+" fue suplantado. Modificacion exitosa!");
                    
                    ListaTerminosSI.get(i).setTerminos(FieldModReplace.getText());
                    ListaTerminosSI.get(i).setSignificados(DefinitionMod.getText());
                    
                }
                
            } 
            
        }
        
        if(JComboSelCateg.getSelectedItem()=="Videojuegos")
        {
            for(int i=0; i<ListaTerminosVJ.size();i++)
            {
                if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosVJ.get(i).getTerminos()))
                {
                    JOptionPane.showMessageDialog(null, "El termino: "+FieldModSearch.getText()+" fue suplantado. Modificacion exitosa!");
                 
                    ListaTerminosVJ.get(i).setTerminos(FieldModReplace.getText());
                    ListaTerminosVJ.get(i).setSignificados(DefinitionMod.getText());
                }
                 
            } 
            
        }
        
        
                
         

     });
     
     //BOTON DE CHECK VENTANA MODIFICAR
     ButFoundMod.addActionListener((ActionMod)->
     {
         
         //1
         
         if(JComboSelCateg.getSelectedItem()=="Base de datos")
         {
             for(int i=0; i<ListaTerminosBD.size();i++)
             {
                 if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosBD.get(i).getTerminos()))
                 {
                     ButFoundMod.setBackground(Color.green);
                 }
             }
             
         }
         
         
         //2
         
         if(JComboSelCateg.getSelectedItem()=="BlockChain y Criptomonedas")
         {
             for(int i=0; i<ListaTerminosBC.size();i++)
             {
                 if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosBC.get(i).getTerminos()))
                 {
                     ButFoundMod.setBackground(Color.green);
                 }
             }
             
         }
         
         
         //3
         
         if(JComboSelCateg.getSelectedItem()=="Computacion en la nube")
         {
             for(int i=0; i<ListaTerminosCN.size();i++)
             {
                 if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosCN.get(i).getTerminos()))
                 {
                     ButFoundMod.setBackground(Color.green);
                 }
             }
             
         }
         
         
         //4
         
         if(JComboSelCateg.getSelectedItem()=="Ciencia de datos")
         {
             for(int i=0; i<ListaTerminosCD.size();i++)
             {
                 if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosCD.get(i).getTerminos()))
                 {
                     ButFoundMod.setBackground(Color.green);
                 }
             }
             
         }
         
         
         //5
         
         if(JComboSelCateg.getSelectedItem()=="Diseño Grafico")
         {
             for(int i=0; i<ListaTerminosDG.size();i++)
             {
                 if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosDG.get(i).getTerminos()))
                 {
                     ButFoundMod.setBackground(Color.green);
                 }
             }
             
         }
         
         
         //6
         
         if(JComboSelCateg.getSelectedItem()=="Desarrollo web")
         {
             for(int i=0; i<ListaTerminosDW.size();i++)
             {
                 if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosDW.get(i).getTerminos()))
                 {
                     ButFoundMod.setBackground(Color.green);
                 }
             }
             
         }
         
         
         //7
         
         if(JComboSelCateg.getSelectedItem()=="Formato y extensiones de archivos")
         {
             for(int i=0; i<ListaTerminosEA.size();i++)
             {
                 if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosEA.get(i).getTerminos()))
                 {
                     ButFoundMod.setBackground(Color.green);
                 }
             }
             
         }
         
         
         //8
         
         if(JComboSelCateg.getSelectedItem()=="Inteligencia Artificial")
         {
             for(int i=0; i<ListaTerminosIA.size();i++)
             {
                 if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosIA.get(i).getTerminos()))
                 {
                     ButFoundMod.setBackground(Color.green);
                 }
             }
             
         }
         
         
         //9
         
         if(JComboSelCateg.getSelectedItem()=="Informatica")
         {
             for(int i=0; i<ListaTerminosIF.size();i++)
             {
                 if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosIF.get(i).getTerminos()))
                 {
                     ButFoundMod.setBackground(Color.green);
                 }
             }
             
         }
         
         
         //10
         
         if(JComboSelCateg.getSelectedItem()=="Marketing Digital")
         {
             for(int i=0; i<ListaTerminosMD.size();i++)
             {
                 if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosMD.get(i).getTerminos()))
                 {
                     ButFoundMod.setBackground(Color.green);
                 }
             }
             
         }
         
         
         //11
         
         if(JComboSelCateg.getSelectedItem()=="Programacion y desarrollo de software")
         {
             for(int i=0; i<ListaTerminosPS.size();i++)
             {
                 if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosPS.get(i).getTerminos()))
                 {
                     ButFoundMod.setBackground(Color.green);
                 }
             }
             
         }
         
         
         //12
         
         if(JComboSelCateg.getSelectedItem()=="Redes")
         {
             for(int i=0; i<ListaTerminosRD.size();i++)
             {
                 if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosRD.get(i).getTerminos()))
                 {
                     ButFoundMod.setBackground(Color.green);
                 }
             }
             
         }
         
         
         //13
         
         if(JComboSelCateg.getSelectedItem()=="Sistemas operativos")
         {
             for(int i=0; i<ListaTerminosSO.size();i++)
             {
                 if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosSO.get(i).getTerminos()))
                 {
                     ButFoundMod.setBackground(Color.green);
                 }
             }
             
         }
         
         
         //14
         
         if(JComboSelCateg.getSelectedItem()=="Seguridad informatica")
         {
             for(int i=0; i<ListaTerminosSI.size();i++)
             {
                 if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosSI.get(i).getTerminos()))
                 {
                     ButFoundMod.setBackground(Color.green);
                 }
             }
             
         }
         
         
         //15
         
         if(JComboSelCateg.getSelectedItem()=="Videojuegos")
         {
             for(int i=0; i<ListaTerminosVJ.size();i++)
             {
                 if(FieldModSearch.getText().equalsIgnoreCase(ListaTerminosVJ.get(i).getTerminos()))
                 {
                     ButFoundMod.setBackground(Color.green);
                 }
             }
             
         }
    
     });

     
     //fin de Boton de BUSCAR EN VENTENA MODIFICAR TERMNIOS
     
     
     
     
     
     
     
     ShowMod.addActionListener((ActionEvent )->
     {
         VModificar.setVisible(false);
         VConsultar.setVisible(true);
            
            VConsultar.setLocationRelativeTo(null);
           
            FieldModSearch.setText(null);
            FieldModReplace.setText(null);
            DefinitionMod.setText(null);
            
            
         
     });
     
     
     
     
    
     
//-------------------------------------------FIN DE ACCIONES A BOTONES-------------------------------**        
     
       
       
        
//-------------------------------------------HACER LAS ACTUALIZACIONES DE PANELES--------------------------**
        PanelInicio.updateUI();
        PanelMain.updateUI(); 
        PConsultar.updateUI();
        PListado.updateUI();
        PBusqueda.updateUI();
        PIngresar.updateUI();
        PModificar.updateUI();
        PEliminar.updateUI();
//-------------------------------------------FIN DE LAS ACTUALIZACIONES DE PANELES--------------------------**


long endTime = (System.nanoTime() - startTime)/1000000000;

        System.out.println("Program Runtime: "+endTime+" sec");
    }


    //620946    
    //50440
    //5009
    //
}
