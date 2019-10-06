o = new Object();
Solution.Inner instance = new Solution.Inner();
Inner.Private inner = instance.new Private();
o=(Object)inner;
System.out.println(num + " is " + inner.powerof2(num));