package cases;

import java.util.HashSet;
import java.util.TreeSet;

import interfaces.Interfaces.Entity;
import interfaces.Interfaces.EntityCollection;

public class A implements EntityCollection {
    private HashSet<Entity> hashSet;

    public A() {
        this.hashSet = new HashSet<>();
    }

    @Override
    public void add(Entity entity) {
        hashSet.add(entity);
        
    }

    @Override
    public Entity removeMaxValue() {
        TreeSet <Entity> sorted = new TreeSet<Entity>();
        sorted.addAll(hashSet);    
        return sorted.pollLast();
    }
    
}
