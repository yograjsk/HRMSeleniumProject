package vanHackChallenge1;

public class UnservableCuisineRequestException extends Throwable {

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

}
