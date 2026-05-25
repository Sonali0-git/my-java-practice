//56.StringAscending
class StringAscending {
    public static void main(String[] args) {

        String a[] = {"Ram","Amar","Cel","David","Bunny"};

        for(int i=0; i<a.length; i++) {

            for(int j=i+1; j<a.length; j++) {

                if(a[i].compareTo(a[j]) > 0) {

                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.print("Ascending Order: ");

        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}