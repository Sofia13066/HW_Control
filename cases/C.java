package cases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import interfaces.Interfaces.Entity;
import interfaces.Interfaces.EntityCollection;

public class C implements EntityCollection {
    private ArrayList<Entity> arrayList;
    private Comparator<Entity> comparator;

    public C() {
        this.arrayList = new ArrayList<>();
        this.comparator = (ent1, ent2) -> Integer.compare(ent1.getValue(), ent2.getValue());

    }


    @Override
    public void add(Entity entity) {
        int index = Collections.binarySearch(arrayList, entity, comparator);
        if(index<0){
            arrayList.add(-index-1, entity);
        }
        
    }

    @Override
    public Entity removeMaxValue() {
        return arrayList.remove(arrayList.size()-1);
    }
    
}
