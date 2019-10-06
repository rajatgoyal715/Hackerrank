class Flower{
    public String whats_Your_Name(){
        return "I have many names and types";
    }
}
class Jasmine extends Flower{
    @Override
    public String whats_Your_Name(){
        return "Jasmine";
    }
}
class Lily extends Flower{
    @Override
    public String whats_Your_Name(){
        return "Lily";
    }
}
class Lotus extends Flower{
    @Override
    public String whats_Your_Name(){
        return "Lotus";
    }
}
class State{
    public Flower your_National_Flower(){
        return new Flower();
    }
}
class WestBengal extends State{
    @Override
    public Flower your_National_Flower(){
        Flower j = new Jasmine();
        return j;
    }
}
class Karnataka extends State{
    @Override
    public Flower your_National_Flower(){
        Flower l = new Lotus();
        return l;
    }
}
class AndhraPradesh extends State{
    @Override
    public Flower your_National_Flower(){
        Flower l = new Lily();
        return l;
    }
}