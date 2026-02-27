package java_study;

public class MyArrayList {
    // 1. 자바가 제공하는 진짜 원시 배열 (우리의 밑바탕이 될 녀석)
    int[] data;

    // 2. 현재 배열에 '실제로' 들어간 데이터 개수를 추적할 변수
    int size;

    // 3. 생성자 (처음 이 클래스를 객체로 만들 때 세팅해 주는 곳)
    public MyArrayList() {
        this.data = new int[10]; // 일단 10칸짜리 뻣뻣한 고정 배열로 시작!
        this.size = 0; // 처음엔 빈 배열이니까 들어있는 개수는 0
    }

    private void validCheck (int index) {
        // 조회/수정/삭제용 인덱스 유효성 검사
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private void validCheckForAdd (int index) {
        // 삽입용 인덱스 유효성 검사 (index == size 허용)
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private void grow(){

        // 사이즈 키워야할때 2배로 키워주는 알고리즘
        int[] data = this.data;
        this.data = new int[this.data.length * 2];
        for(int i = 0; i < this.size; i++){
            this.data[i] = data[i];
        }
    }

    public void add(int value) {
        if(this.size == this.data.length){
            grow();
        }
        this.data[this.size] = value;
        this.size++;
    }

    public void add(int index, int value) {
       
        validCheckForAdd(index);

        if(this.size == this.data.length){
            grow();
        }
        // 이러면 기존에 있던 애는 터져버리기때문에 이러면 안됨
        // 뒤에 있는 애들 하나씩 밀어주는게 맞음
        for (int i = this.size; i > index; i--) {
            this.data[i] = this.data[i - 1];
        }

        this.data[index] = value;
        this.size++;
    }

    public void set(int index, int value) {
        
        validCheck(index);

        int data[] = this.data;
        data[index] = value;
    }

    public boolean contains (int value){
        int data[] = this.data;
        for (int i = 0; i < this.size; i++){
            if(data[i] == value) return true;
        }
        return false;
    }

    public int indexOf (int value){
        int data[] = this.data;
        for (int i = 0; i < this.size; i++){
            if(data[i] == value) return i;
        }
        return -1;
    }

    public void clear (){
        this.data = new int[10];
        this.size = 0;
    }

    @Override
    public String toString(){
        if (this.size == 0) return "[]";
        int data[] = this.data;

        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < this.size - 1; i++){
            sb.append(data[i]);
            sb.append(", ");
        }
        sb.append(data[this.size-1]);
        sb.append("]");

        String result = sb.toString();

        return result;
    }

    public int remove(int index) {

        validCheck(index);

        int removedVal = this.data[index];
        // 삭제시
        // add랑 반대로 뒤에있는 애들을 하나씩 끌어와줘야함

        for (int i = index; i < this.size - 1; i++) {
            this.data[i] = this.data[i + 1];
        }

        this.size--;
        
        return removedVal;
    }

    public int get(int index) {

        validCheck(index);
        return this.data[index];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        // if (this.size == 0) {
        //     return true;
        // } else {
        //     return false;
        // }
        return this.size == 0;
    }

}
