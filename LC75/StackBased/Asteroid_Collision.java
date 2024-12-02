package StackBased;
import java.util.Stack;
public class Asteroid_Collision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int i=0;                                                                                                                                                                                                                                                                                                                                                               
        for(i=0;i<asteroids.length;i++){
            if(asteroids[i]>0){
                st.push(asteroids[i]);
            }else{
                while(!st.isEmpty() && st.peek()>0 && st.peek() < -asteroids[i]){
                    st.pop();
                }
                if(st.isEmpty() || st.peek()<0){
                    st.push(asteroids[i]);
                }else if(st.peek()==-asteroids[i]){
                    st.pop();
            }
        }
        }
            int[] final_asteroids = new int[st.size()];
            for(i=st.size()-1;i>=0;i--){
                final_asteroids[i] = st.pop();
            }
            return final_asteroids;
        }
    public static void main(String[] args) {
        int[][] asteroids = {
            {-2,-1,1,2},
            {5,10,-5},
            {8,-8,1,1},
            {8,-8},
            {10,2,-5},
            {-2,-2,1,2,-2},
            {-2,-2,1,2,-2,2},
            {-2,-2,1,2,-2,2,1},
            {-2,-2,1,2,-2,2,1,2},

        };
        for(int[] asteroid: asteroids){
            for(int i: asteroidCollision(asteroid)){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}