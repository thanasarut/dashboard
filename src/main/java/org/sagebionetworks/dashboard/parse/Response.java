package org.sagebionetworks.dashboard.parse;

public class Response {

    public Response(int questionIndex, boolean isCorrect) {
        this.questionIndex = questionIndex;
        this.isCorrect = isCorrect;
    }

    public int questionIndex(){
        return questionIndex;
    }
    public boolean isCorrect(){
        return isCorrect;
    }

    private final int questionIndex;
    private final boolean isCorrect;
}
