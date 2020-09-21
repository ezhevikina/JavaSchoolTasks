package com.ezhevikina.basics.homework7;

public class Main {

  public static void main(String[] args) {

    AccountManager accountManager = new AccountManager();
    accountManager.initialize();

    ATM atm = new ATM(accountManager);
    atm.start();
  }
}
