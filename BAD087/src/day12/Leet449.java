package day12;
import java.util.*;

public class Leet449 {
    static void preorder(TreeNode node, StringBuilder sb) {
        if (node == null) return;
        sb.append(node.data).append(",");
        preorder(node.left, sb);
        preorder(node.right, sb);
    }

    public static String serialize(TreeNode node) {
        StringBuilder sb = new StringBuilder();
        preorder(node, sb);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public static TreeNode deserialize(String s) {
        if (s.length() == 0) return null;
        String[] arr = s.split(",");
        Queue<Integer> queue = new LinkedList<>();
        for (String a : arr) {
            if (!a.isEmpty()) queue.add(Integer.parseInt(a));
        }
        return buildBst(queue, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static TreeNode buildBst(Queue<Integer> queue, long min, long max) {
        if (queue.isEmpty()) return null;
        int val = queue.peek();
        if (val < min || val > max) return null;
        queue.poll();
        TreeNode root = new TreeNode(val);
        root.left = buildBst(queue, min, val);
        root.right = buildBst(queue, val, max);
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeNode t1 = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            t1 = t1.insert(val, t1);
        }
        String s = serialize(t1);
        System.out.println(s);

        TreeNode t2 = deserialize(s);
        System.out.print("[");
        System.out.print(serialize(t1));
        System.out.print("]");
    }
}
