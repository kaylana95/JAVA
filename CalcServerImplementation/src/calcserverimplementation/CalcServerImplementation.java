/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calcserverimplementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import mathserverinterface.MathServerInterface;

/**
 *
 * @author HP
 */
public class CalcServerImplementation extends UnicastRemoteObject implements MathServerInterface {

    
    public CalcServerImplementation() throws RemoteException{
        
    }
    @Override
    public int add(int a, int b) throws RemoteException {
         return a+b;
    }

    @Override
    public int subtract(int a, int b) throws RemoteException {
      return a-b;
    }

    @Override
    public int multiply(int a, int b) throws RemoteException {
       return a*b;
    }
    @Override
    public int divide(int a, int b) throws RemoteException {
          if(b==0) {
            return -1;
        } else {
            return a/b;
        }
    }
    

}
