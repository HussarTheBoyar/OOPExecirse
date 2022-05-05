import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;

public class QLXe {
    private LinkedList Book = new LinkedList<>();
    private LinkedList Magazine = new LinkedList<>();
    private LinkedList Paper = new LinkedList<>();

//Create linkedlist of docCode for searching

    private LinkedList BookCode = new LinkedList<>();
    private LinkedList MagazineCode = new LinkedList<>();
    private LinkedList PaperCode = new LinkedList<>();





//Add document

    public void addDoc(TaiLieu taiLieu){
        if (taiLieu instanceof Book) {
            Book.add(taiLieu);
            BookCode.add(taiLieu.docCode.toString());
        }
        if (taiLieu instanceof Magazine){
            Magazine.add(taiLieu);
            MagazineCode.add(taiLieu.docCode.toString());
        }
        if (taiLieu instanceof Paper){
            Paper.add(taiLieu);
            PaperCode.add(taiLieu.docCode.toString());
        }
    }

//Delete document

    public void deleteDoc(String code){
        //First char of string take the type
        //The last string is index of doc in stored linkedlist
        String type = code.substring(0,1);
        Integer index = getIndex(code);

        switch (type){
            case "B":
                Book.remove(index);
                BookCode.remove(index);
                break;
            case "P":
                Paper.remove(index);
                PaperCode.remove(index);
                break;
            case "M":
                Magazine.remove(index);
                MagazineCode.remove(index);
                break;
        }
    }

//Show information of documents

    public void Show(String key){
        switch (key){
            case "A": //Print all document
                System.out.println("Book list \n");
                Book.forEach(book -> System.out.println(book.toString()));
                System.out.println("\n");

                System.out.println("Magazine list \n");
                Magazine.forEach(magazine -> System.out.println(magazine.toString()));
                System.out.println("\n");

                System.out.println("Paper list \n");
                Paper.forEach(paper -> System.out.println(paper.toString()));
                System.out.println("\n");
                break;
            case "B": //Print all book
                System.out.println("Book list \n");
                Book.forEach(book -> System.out.println(book.toString()));
                break;
            case "M": //Print all magazine
                System.out.println("Magazine list \n");
                Magazine.forEach(magazine -> System.out.println(magazine.toString()));
                break;
            case "P": //Print all paper
                System.out.println("Paper list \n");
                Paper.forEach(paper -> System.out.println(paper.toString()));
                break;
        }
    }

//Search doc by docCode

    public void searchCode(String code){
        String type = code.substring(0,1);
        int index = getIndex(code);
        String result = "Non-exist";
        switch (type){
            case "B":
                if (BookCode.contains(code)){
                    //index = Integer.valueOf(code.substring(1));
                    System.out.println(Book.get(index).toString());
                }else {
                    System.out.println(result);
                }
                break;
            case "M":
                if (MagazineCode.contains(code)){
                    //index = Integer.valueOf(code.substring(1));
                    System.out.println(Magazine.get(index).toString());
                }else {
                    System.out.println(result);
                }
                break;
            case "P":
                if (PaperCode.contains(code)){
                    //index = Integer.valueOf(code.substring(1));
                    System.out.println(Paper.get(index).toString());
                }else {
                    System.out.println(result);
                }
                break;
        }

    }

//Use regex for check code and check date
    private Pattern codePattern = Pattern.compile("[BMP][0-9]+");
    private Pattern datePattern = Pattern.compile("[0-9]{2}[/-][0-9]{2}[-/][0-9]{4}");
    public boolean checkCode(String code){
        boolean result = false;
        result = codePattern.matcher(code).matches();
        return result;
    }

    public boolean checkDate(String date){
        boolean result = false;
        result = datePattern.matcher(date).matches();
        return result;
    }

//Get index from docCode
    public int getIndex(String code){
        Iterator iter;
        int index = -1;
        String key = code.substring(0,1);

        switch (key){
            case "B":
                iter = Book.iterator();
                while (iter.hasNext()){
                    index++;
                    if (iter.next().equals(code)){
                        break;
                    }
                }
                break;
            case "M":
                iter = Magazine.iterator();
                while (iter.hasNext()){
                    index++;
                    if (iter.next().equals(code)){
                        break;
                    }
                }
                break;
            case "P":
                iter = Paper.iterator();
                while (iter.hasNext()){
                    index++;
                    if (iter.next().equals(code)){
                        break;
                    }
                }
                break;
        }


        return index;
    }

//Check duplicate data

}
