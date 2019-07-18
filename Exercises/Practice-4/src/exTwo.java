public class exTwo {
    public static void main(String[] args) {
        float[] salary = {1200, 1000, 1005, 3000, 43000, 999};
        float[] newsalary = new float[salary.length];

        for (int count = 0; count < salary.length; count++) {
            if (salary[count] < 1000.00)
                newsalary[count] = salary[count] * 1.15f;
            else if (salary[count] >= 1000.00)
                newsalary[count] = salary[count] * 1.12f;
        }
        for (int count = 0; count < newsalary.length; count++) {
            System.out.print(salary[count]+"  "+newsalary[count] + "\n");
        }
    }
}
