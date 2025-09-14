 class add_complex {
    int real;
    int imaginary;
public add_complex(int r,int i){
    this.real=r;
    
    this .imaginary=i;

}
public void showC() {
    System.out.println(this.real + "+i" + this.imaginary);
}

public static add_complex add(add_complex n1, add_complex n2){
    add_complex res= new add_complex(0, 0);
    res.real=n1.real+n2.real;
    res.imaginary=n1.imaginary+n2.imaginary;
    return res;
}
public static void main(String[] args) {
    add_complex c1=new add_complex(4, 7);
    add_complex c2=new add_complex(5, 8);
    System.out.println("first compex number is :");
    c1.showC();
    System.out.println("second compex number is :");
    c2.showC();
    add_complex res =add(c1,c2);
    System.out.println("Addition is :");
    res.showC();
}
}


