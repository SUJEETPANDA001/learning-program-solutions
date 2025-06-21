package FactoryMethodPatternExample;
/*
 * Name :- Sujeet Panda
 * mail :- sujeetpanda001@gmail.com
 * Superset ID: 6380391
 */
public class FactoryTest {
    public static void main(String[] args) {
        DocumentFactory factory = new PdfDocumentFactory();
        Document doc = factory.createDocument();
        doc.open();

        factory = new WordDocumentFactory();
        doc = factory.createDocument();
        doc.open();

        factory = new ExcelDocumentFactory();
        doc = factory.createDocument();
        doc.open();
    }
}