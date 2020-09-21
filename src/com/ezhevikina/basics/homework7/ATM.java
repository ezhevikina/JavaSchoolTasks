package com.ezhevikina.basics.homework7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATM {
  private final AccountManager accountManager;

  public ATM(AccountManager accountManager) {
    this.accountManager = accountManager;
  }

  public void start() {
    System.out.println("Available operations:\n"
        + "* balance [id]\n"
        + "* withdraw [id] [amount]\n"
        + "* deposit [id] [amount]\n"
        + "* transfer [from] [to] [amount]\n"
        + "E to exit");

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      try {
        String[] command = (reader.readLine()).split(" ");

        switch (command[0].toLowerCase()) {
          case "balance": {
            int accountId = Integer.parseInt(command[1]);
            accountManager.balance(accountId);
            break;
          }
          case "withdraw": {
            int accountId = Integer.parseInt(command[1]);
            int amount = Integer.parseInt(command[2]);
            accountManager.withdraw(accountId, amount);
            break;
          }
          case "deposit": {
            int accountId = Integer.parseInt(command[1]);
            int amount = Integer.parseInt(command[2]);
            accountManager.deposit(accountId, amount);
            break;
          }
          case "transfer": {
            int accountFrom = Integer.parseInt(command[1]);
            int accountTo = Integer.parseInt(command[2]);
            int amount = Integer.parseInt(command[3]);
            accountManager.transfer(accountFrom, accountTo, amount);
            break;
          }
          case "e": {
            reader.close();
            System.exit(0);
          }
          default: {
            System.out.println("Invalid command");
          }
        }
      } catch (IOException e) {
        e.printStackTrace();

      } catch (UnknownAccountException | NotEnoughMoneyException e) {
        System.out.println(e.getMessage());

      } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
        System.out.println("Invalid command");
      }
    }
  }
}
