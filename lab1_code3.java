class lab1_c0de3_ {
    public static void main(String[] args) {

        String[] arr = new String[args.length];

        for(int i = 0; i < args.length; i++) {
            arr[i] = args[i];
        }

        System.out.println("Array elements are:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
