public class Printer {

    private String queue = "";
    private int totalPagesCount = 0;
    private int totalDocumentsCount = 0;
    private int totalNumberPrintedDocuments = 0;
    private int totalNumberPrintedPages = 0;
    private String totalNumberPrintedDocumentsAndPages = "";

    public void append(String text) { append(text, "Без наименования"); }

    public void append(String text, String name) { append(text, name, 1); }

    public void append(String text, String name, int pagesCount) {
        queue = queue + "\n" + "Текст документа: " + text + ". Имя документа: " + name +
                ". Количество страниц документа: " + pagesCount + ".";

        totalPagesCount = totalPagesCount + pagesCount;

        totalDocumentsCount++;
    }

    public void clear() {
        queue = "";
        totalPagesCount = 0;
        totalDocumentsCount = 0;
    }

    public void print() {
        System.out.println("Список документов на печать:" + queue +
                "\nОбщее количество страниц на печать: " + getPagesCount() +
                "\nОбщее количество документов: " + getDocumentsCount());

        totalNumberPrintedDocuments = totalNumberPrintedDocuments + getDocumentsCount();
        totalNumberPrintedPages = totalNumberPrintedPages + getPagesCount();
        clear();
    }

    public String getTotalNumberPrintedDocumentsAndPages() {
        return totalNumberPrintedDocumentsAndPages = "Общее количество распечатанных документов и страниц за всё время: " +
                "\n     документов - " + Integer.toString(totalNumberPrintedDocuments) +
                "\n     страниц - " + Integer.toString(totalNumberPrintedPages);
    }

    public int getPagesCount() { return totalPagesCount; }

    public int getDocumentsCount() { return totalDocumentsCount; }

}

