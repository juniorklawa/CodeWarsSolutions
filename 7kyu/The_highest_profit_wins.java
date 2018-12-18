class MinMax {
    public static int[] minMax(int[] arr) {
        int maior = arr[arr.length - 1];
        int menor = arr[0];
        
        
        for(int i = 0; i < arr.length; i++){
          maior = Math.max(maior,arr[i]);
          menor = Math.min(menor,arr[i]);
        }
        
        int[] newArr = {menor, maior};
        
        return newArr;
    }
}
