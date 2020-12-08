import java.util.ArrayList;

public class Inventory<T>{
    ArrayList<T> elements;
    
    public Inventory(){
        elements = new ArrayList<T>();
    }

    public void addElement( T element ){
        elements.add(element);
    }

    public int searchElement( T element ){
        int index = -1;
        for( int i = 0; i < elements.size(); i++ ){
            T auxElement = elements.get(i);
            if (auxElement.equals( element )){
                index = i;
                break;
            }
        }
        return index;
    }

    public void removeElement( T element ){
        int index = searchElement(element);
        if( index >= 0 ){
            elements.remove( index );
        }
    }

    public String toString(){
        String output = " ";
        for( int i = 0; i < elements.size(); i++ ){
            T auxElement = elements.get(i);
            output = output + auxElement.toString() + "\n";
        }
        return output;
    }

}