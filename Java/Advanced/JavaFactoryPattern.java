    if(order.equals("cake")){
        Food food = new Cake();
        return food;
    }else{
        Food food = new Pizza();
        return food;
    }
