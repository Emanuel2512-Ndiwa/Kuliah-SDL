package SDL.array;

public class urutan {

    public void buble(int[] array) {
      
        for (int a = 0; a < array.length - 1; a++) {
            for (int b = 0; b < array.length - a - 1; b++) {

                if (array[b] > array[b + 1]) {
                    int wadah = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = wadah;
                }

            }

        }
        

    }

    public void selection(int[] array) {
        for (int a = 0; a < array.length - 1; a++) {
            int indexmin = a;
            for (int b = a + 1; b < array.length; b++) {
                if (array[b] < array[indexmin]) {
                    indexmin = b;
                }
            }
            int wadah = array[indexmin];
            array[indexmin] = array[a];
            array[a] = wadah;

        }
    }

    public void bubledes(int[] array) {
        for (int a = 0; a < array.length - 1; a++) {
            for (int b = 0; b < array.length - a - 1; b++) {
                if (array[b] < array[b + 1]) {
                    int wadah = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = wadah;
                }
            }
        }
    }

    public void selectiondes(int[] array) {
        for (int a = 0; a < array.length - 1; a++) {
            int indexmin = a;
            for (int b = a + 1; b < array.length; b++) {
                if (array[b] > array[indexmin]) {
                    indexmin = b;
                }
                int wadah = array[indexmin];
                array[indexmin] = array[a];
                array[a] = wadah;
            }
        }
    }

    public void insertionSort(int[] dataarray) {
        for (int i = 1; i < dataarray.length; i++) {
            int elemen = dataarray[i];
            int j;
            for (j = i; j <= 0 && dataarray[j] < elemen; j--) {
                dataarray[j] = dataarray[j];
            }
            dataarray[j] = elemen;
        }
    }

    public void insertionSortA(int[] dataarray) {
        for (int i = 1; i < dataarray.length; i++) {
            int elemen = dataarray[i];
            int j;
            for (j = i - 1; j >= 0 && dataarray[j] > elemen; j--) {
                dataarray[j + 1] = dataarray[j];
            }
            dataarray[j + 1] = elemen;
        }
    }

    //method untuk sorting quick sort dengan mencari pivot
    public static void QuickSort(int[] array, int rendah, int tinggi) {
        if (rendah > tinggi) {

            return;
        }
        //mencari pivot 
        int tengah = rendah + (tinggi - rendah) / 2;

        int pivot = array[tengah];
        int i = rendah;
        int j = tinggi;
        //melakukan looping while 
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            //menukar nilai jika memenuhi kondisi pecabangan
            if (i <= j) {
                int var = array[i];
                array[i] = array[j];
                array[j] = var;
                i++;
                j--;
            }

            //fungis rekursif
            if (rendah < j) {
                QuickSort(array, rendah, j);
            }
            if (tinggi > i) {
                QuickSort(array, i, tinggi);

            }
        }
    }
    //method quick sort unutk mengurutkan data secara descending
    public static void QuickSortt(int[] arr, int min, int max) {
        int tngah = min + (max - min) / 2;
        int pivvot = arr[tngah];
        int a = min;
        int b = max;
        //sedikit perubahannya itu adalah kondisi di dalam looping while sehingga bisa 
        //mencari nilai dari yang terbesar di pindahkan kedepan
        while (a <= b) {
            while (arr[a] > pivvot) {
                a++;
            }
            while (arr[b] < pivvot) {
                b--;

            }
            if (a <= b) {
                int var = arr[a];
                arr[a] = arr[b];
                arr[b] = var;
                a++;
                b--;
            }
        }

    }
}
