package never.doTest.enumTest;

public enum Girl implements IntefaceTest {
    Red{
        @Override
        public String show() {
            return "小红袄";
        }
    },
    White{
        @Override
        public String show() {
            return "白色羽绒服";
        }
    },
    Purple{
        @Override
        public String show() {
            return "不知什么颜色的衣服";
        }
    };

}
