package Session13;

class CodeleanA {
    public void methodPublic() {
        methodPrivate();
    }
    protected void methodProtected (){
        methodPrivate();
    }
    void methodDefault(){
        methodPrivate();
    }
    private void methodPrivate(){}
}
