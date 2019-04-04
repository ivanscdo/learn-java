class StringIntArray{
    public static void main(String[] args) {
        String[] array = {"ace", "2", "3"};

        for (String card: array) {
                // System.out.println(Integer.parseInt(card));
                System.out.println(Integer.valueOf(card));
        }
    }
}