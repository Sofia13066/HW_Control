package cases;

import java.util.TreeSet;

import interfaces.Interfaces.Entity;
import interfaces.Interfaces.EntityCollection;

public class B implements EntityCollection {
    private TreeSet<Entity> treeSet;

    public B() {
        this.treeSet = new TreeSet<Entity>();
    }
    
    @Override
    public void add(Entity entity) {
        if(entity!=null){
            treeSet.add(entity);
        }
        
    }
    

    @Override
    public Entity removeMaxValue() {
        return treeSet.pollLast();
    }
    
}
