package sorting.Questions;

public class SortNamesLexicographically {
    public static void main(String[] args) {
        String names[] = { "apple", "banana","avocado", "apricot", "grape" };

        // using selection sort
        for (int i = 0; i < names.length; i++) {
            int smallestElementIndex = i;
            for (int j = i + 1; j < names.length; j++) {
                if (names[j].compareTo(names[smallestElementIndex]) < 0) { //returns negavtive when lexicographically smaller
                    smallestElementIndex = j;
                }
            }
            String temp = names[i];
            names[i] = names[smallestElementIndex];
            names[smallestElementIndex] = temp;
        }
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
    }
}
