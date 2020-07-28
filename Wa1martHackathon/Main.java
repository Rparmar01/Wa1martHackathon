/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nittanychain;
//package com.company;
public class Main {

    /**

     Hash = digital signature

     Each block will have:

     List of transactions
     Previous Hash

     Hash
     * @param args
     */

    public static void main(String[] args) {

        String[] genesisTransactions = {"V. Madhav sent Nimesh Silva 999900 NittanyCoins","N. Ghosh  sent 10 bitcoins to Nimesh Silva"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2Transactions = {"Nimesh Silva sent 10 NittanyCoins to Madhav", "Madhav donated proceeds of 10 NittanyCoins to THON for the kids."};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        String[] block3Transactions = {"Nimesh Silva sent 999 bitcoin to Nittany Lion"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);

        System.out.println("Hash of genesis block:");
        System.out.println(genesisBlock.getBlockHash());

        System.out.println("Hash of block 2:");
        System.out.println(block2.getBlockHash());

        System.out.println("Hash of block 3:");
        System.out.println(block3.getBlockHash());

    }


}

