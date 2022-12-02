class Brick {

    public Brick() {
    }

    public boolean makeBricks(int small, int big, int goal) {
        if (goal <= 0) {
            return goal == 0 && small >= 0 && big >= 0;
        } else {
            return makeBricks(small - 1, big, goal - 1) || makeBricks(small, big - 1, goal - 5);
        }
    }

    public static void main(String[] args) {
        Brick brick = new Brick();
        if (brick.makeBricks(3, 1, 8)) {
            System.out.println("makeBricks(3, 1, 8) → true (We can make 8 inches long bricks with 3 small and 1 large bricks)");
        } else {
            System.out.println("makeBricks(3, 1, 8) → false (We can't make 8 inches long bricks with 3 small and 1 large bricks)");
        }

        if (brick.makeBricks(3, 1, 9)) {
            System.out.println("makeBricks(3, 1, 9) → true (We can make 9 inches long bricks with 3 small and 1 large bricks)");
        } else {
            System.out.println("makeBricks(3, 1, 9) → false (We can't make 9 inches long bricks with 3 small and 1 large bricks)");
        }

        if (brick.makeBricks(3, 2, 10)) {
            System.out.println("makeBricks(3, 2, 10) → true (We can make 10 inches long bricks with 3 small and 2 large bricks)");
        } else {
            System.out.println("makeBricks(3, 2, 10) → false (We can't make 10 inches long bricks with 3 small and 2 large bricks)");
        }

        if (brick.makeBricks(3, 2, 8)) {
            System.out.println("makeBricks(3, 2, 8) → true (We can make 8 inches long bricks with 3 small and 2 large bricks)");
        } else {
            System.out.println("makeBricks(3, 2, 8) → false (We can't make 8 inches long bricks with 3 small and 2 large bricks)");
        }

        if (brick.makeBricks(3, 2, 9)) {
            System.out.println("makeBricks(3, 2, 9) → true (We can make 9 inches long bricks with 3 small and 2 large bricks)");
        } else {
            System.out.println("makeBricks(3, 2, 9) → false (We can't make 9 inches long bricks with 3 small and 2 large bricks)");
        }
    }
}
