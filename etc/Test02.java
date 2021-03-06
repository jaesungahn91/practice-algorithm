package etc.t.com.test;

/*문제 설명
3의 거듭 제곱수는 3을 b번 곱한 수를 의미하며 3b 형태로 표현합니다. 30 = 1이 성립하며, 31 = 3, 32 = 9, 33 = 27, 34 = 81... 모두 거듭 제곱수입니다.
3의 거듭 제곱수를 임의로 더하여 거듭 제곱수 사이에 들어가는 수를 만들 수 있습니다. 예를 들어,

4 = 1 + 3
31 = 27 + 3 + 1
입니다.
이때, 같은 거듭 제곱수를 2번 이상 더할 수는 없습니다. 이러한 규칙으로 만들어낼 수 있는 수와 3의 거듭 제곱수를 합쳐서 순서대로 배치하면 1, 3, 4, 9, 10...이 됩니다. 이렇게 배치한 숫자의 n번째 숫자가 무엇인지를 알려주는 함수 solution 을 완성해주세요.

제한사항
n은 1 ≤ n ≤ 1010 인 자연수
입출력 예
n	result
4	9
11	31
입출력 예 설명
입출력 예 #1
1, 3, 4, 9... 로 4번째 숫자는 9입니다.

입출력 예 #2
1, 3, 4, 9, 10, 12, 13, 27, 28, 30, 31 ... 로 11번째 숫자는 31입니다.*/
public class Test02 {
    public static void main(String[] args) {
        System.out.println(solution(11));
    }

    public static long solution(long n) {
        long answer = 0;
        int count = 0;

        while(n > 0) {
            if((n & 1) == 1) {
                answer += power(count);
            }
            count++;
            n = (n >> 1);
        }

        return answer;
    }

    public static long power(long count) {
        if(count == 0) return 1;
        if(count == 1) return 3;

        long temp = power(count / 2);

        if(count % 2 == 0) {
            return (temp * temp);
        } else {
            return ((temp * temp) * 3);
        }
    }
}
