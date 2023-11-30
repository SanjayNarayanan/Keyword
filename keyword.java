package oppsclanandobj;

class popular{
      char gemder='m';
     static void pop(){
        System.out.println("coding in java");

    }
}

class fame extends popular{
    char gender='f';
      void fam(){
        // System.out.println(gender);
    }
}

class vishualcode{
    public static void main(String[] args) {
        // popular p=new popular();
        // System.out.println(p.gemder);
       popular.pop();
    }
}