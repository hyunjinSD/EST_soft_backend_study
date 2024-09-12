package chap05.arraytest;
/**
마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값
마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return
*/
public class LastElement {
    public static void main(String[] args) {
        int[] numList = {2, 1 ,6};
        int[] result = solution(numList);
        for (int a : result) {
            System.out.print(a + " ");
        }
    }
    public static int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length + 1];
        for (int i = 0; i < length; i++) {
            answer[i] = num_list[i];
        }

        int last;
        if(num_list[length - 1] > num_list[length - 2]) {
           last = (num_list[length - 1] - num_list[length - 2]);
        } else {
            last = num_list[length - 1] * 2;
        }

        answer[length] = last;
        return answer;
    }
}

