class BST {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    };

    private TreeNode root;

    public void createBST(int[] arr) {
        this.root = createBST(arr, 0, arr.length - 1);
    }

    public TreeNode createBST(int[] arr, int si, int ei) {

        if (si > ei) {
            return null;
        }
        int mid = (si + ei) / 2;
        TreeNode nn = new TreeNode(arr[mid]);

        nn.left = createBST(arr, si, mid - 1);
        nn.right = createBST(arr, mid + 1, ei);

        return nn;

    }

    public int max() {
        return max(root);
    }

    private int max(TreeNode root) {

        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int right = max(root.right);
        return Math.max(right, root.val);

    }

    public boolean find(int val) {
        return find(root, val);
    }

    private boolean find(TreeNode root, int val) {

        if (root == null) {
            return false;
        }
        if (root.val == val) {
            return true;
        }
        if (root.val < val) {
            return find(root.right, val);
        } else {
            return find(root.left, val);
        }
    }

    public void pre() {
        preorder(root);
    }

    private void preorder(TreeNode root) {

        if (root == null) {
            return;
        }
        System.out.print(root.val + "->");
        preorder(root.left);
        preorder(root.right);

    }

    public TreeNode delete(int item) {

        return del(root, item);
    }

    public TreeNode del(TreeNode root, int key) {

        if (root == null) {
            return null;
        }

        if (root.val > key) {
            root.left = del(root.left, key);
        } else if (root.val < key) {
            root.right = del(root.right, key);
        } else {

            if (root.left != null && root.right != null) {
                int lmax = max(root.left);
                root.val = lmax;
                root.left = del(root.left, lmax);

            } else if (root.left != null) {
                return root.left;
            } else if (root.right != null) {
                return root.right;
            } else {
                return null;
            }
        }
        return root;
    }
}