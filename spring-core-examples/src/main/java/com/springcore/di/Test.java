package com.springcore.di;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        boolean bPreExistWebexAudio =true;
        boolean bPreExistTSPAudio = false;
        boolean bPreVoIPOnly = false;
        byte biPre = (byte) ((bPreExistWebexAudio ? 4 : 0) + (bPreExistTSPAudio ? 2 : 0) + (bPreVoIPOnly ? 1 : 0));
        byte biCur = (byte) ((bPreExistWebexAudio ? 4 : 0) + (bPreExistTSPAudio ? 2 : 0) + (bPreVoIPOnly ? 1 : 0));
        System.out.println(biPre);
        System.out.println(2 ^ 2);
        byte bXor = (byte) (biCur ^ biPre);
        System.out.println("-->"+bXor);
        for (int i = 0; i < 3; i++) {
            System.out.println(((bXor >> i) & 1));
            System.out.println(((biPre >> i) & 1));
           
        }
    }

}
