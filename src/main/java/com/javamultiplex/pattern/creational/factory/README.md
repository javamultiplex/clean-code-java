# Factory Method

Factory Method defines a method, which should be used for creating objects instead of direct constructor call (new operator). 

## The pattern is present in core Java libraries:

- java.util.Calendar#getInstance()
- java.util.ResourceBundle#getBundle()
- java.text.NumberFormat#getInstance()
- java.nio.charset.Charset#forName()
- java.net.URLStreamHandlerFactory#createURLStreamHandler(String) (Returns different singleton objects, depending on a protocol)
- java.util.EnumSet#of()
- javax.xml.bind.JAXBContext#createMarshaller()
