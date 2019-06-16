package com.algorithm.stack;

import java.util.Stack;

/**
 * @Author: lhh
 * @Date: 2019/6/16 19:27
 * @Version 1.0
 * 使用栈实现括号匹配
 */
public class BracketMatch {
    public static void main(String[] args) {
        BracketMatch bracketMatch = new BracketMatch();
        String s = "{()}";
        boolean match = bracketMatch.isMatch(s);
        System.out.println("是否匹配：" + match);
    }

    public boolean isMatch(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                //这一步也很关键
                if (stack.isEmpty()) {
                    return false;
                }
                Character popChar = stack.pop();
                if (c == ')' && popChar != '(')
                    return false;
                if (c == ']' && popChar != '[')
                    return false;
                if (c == '}' && popChar != '{')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
