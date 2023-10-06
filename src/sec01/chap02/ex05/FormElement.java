package sec01.chap02.ex05;

    public abstract class FormElement {
        protected int space;

        public FormElement(int space) {
            this.space = space;
        }

        abstract void func ();
    }
