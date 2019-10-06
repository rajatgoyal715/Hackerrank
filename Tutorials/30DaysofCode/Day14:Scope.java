    Difference(int[] a){
        elements = new int[a.length];
        elements=a;
    }

    public void computeDifference(){
        int min=100;
        int max=0;
        for(int i=0;i<elements.length;i++){
            if(elements[i]>max)
                max=elements[i];
            if(elements[i]<min)
                min=elements[i];
        }
        maximumDifference=max-min;
    }