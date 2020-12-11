import java.util.List;

public class AverageSalary {
    public static int calc(List<Integer> list,int months){
        int acc = 0;
        int result =0;
        for (int j=0;j<months; j++){
            acc = list.get(j)+acc;
            result = acc/months;

        }
        return result;
    }

}
