public class Bank{
    private String accountNumber;
    private Double checkingBallance;
    private Double savingBallance;
    public static int numberOfPeople = 0;
    public static Double numberOfMoney = 0.00;

    public Bank(){
        ranNum();
        numberOfPeople++;
    }



    private int ranNum(){
    String[] nums= {"1","2","3","4","5","6","7","8","9","0"};
    String rando = "";
    for(int i=0; i < 5; i++){
        int position= randomly.nextInt(10);
        String newChar= nums[position];
        rando += newChar;
    }
    this.accountNumber = rando;   
    }

    public void deposit(String bank, double ammount){
        if (bank == "savings" || bank == "Savings"){
            setSavingBallance(getSavingBallance() + amount);
            numberOfMoney += amount;
        }else{
            setCheckingBallance(getCheckingBallance()+amount);
            numberOfMoney += amount;
        }
    }

    public void withdraw(String bank, double amount){
        if (bank == "savings" || bank == "Savings"){
            if(getSavingBallance()>amount){
            setSavingBallance(getSavingBallance() - amount);
            numberOfMoney -= amount;
            }
            else{
                System.out.println("Insuficent Funds");
            }
        }else{
            if(getCheckingBallance()>amount){
            setCheckingBallance(getCheckingBallance()+amount);
            numberOfMoney += amount;
            }else{
                System.out.println("Insuficent Funds");
            }
        }
    }

    public void total(){
        Double total = getCheckingBallance() + getSavingBallance();
        System.out.println("Combined Checking and Savings: $" + total);
    }


	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}



	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



	/**
	 * @return the checkingBallance
	 */
	public Double getCheckingBallance() {
		return checkingBallance;
	}



	/**
	 * @param checkingBallance the checkingBallance to set
	 */
	public void setCheckingBallance(Double checkingBallance) {
		this.checkingBallance = checkingBallance;
	}



	/**
	 * @return the savingBallance
	 */
	public Double getSavingBallance() {
		return savingBallance;
	}



	/**
	 * @param savingBallance the savingBallance to set
	 */
	public void setSavingBallance(Double savingBallance) {
		this.savingBallance = savingBallance;
	}

    
}