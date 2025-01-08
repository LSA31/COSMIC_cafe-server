package com.example.demo;

public class Greeting {
    private final long id;  //데이터를 고유하게 식별하는 숫자
    private final String content;  //데이터의 내용을 저장
    //final: 변수의 값을 한 번 설정하면 변경할 수 없도록 (불변 객체를 위해 사용)

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
