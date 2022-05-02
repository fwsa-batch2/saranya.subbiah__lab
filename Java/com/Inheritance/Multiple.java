package com.Inheritance;

interface Multiple {
    public void Pen();
}

interface Note {
    public void Pencil();
}

interface Books extends Multiple, Note {
    public void Pen();
    public void Pencil();
}

class Dictionary implements Books {
    public void Pen() {
        System.out.println("Multiple");
    }

    public void Pencil() {
        System.out.println("Note");
    }
class Magazine {
    public void main(String[] args) {
        Dictionary obj = new Dictionary();
        obj.Pen();
        obj.Pencil();
    }
}
}
 
