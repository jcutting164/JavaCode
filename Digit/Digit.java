import java.util.*;
public class Digit{
  public static void main(String[] args){
    Let object = new Let();
    ArrayList<String> A = object.A();
    ArrayList<String> B = object.B();
    ArrayList<String> C = object.C();
    ArrayList<String> D = object.D();
    ArrayList<String> E = object.E();
    ArrayList<String> F = object.F();
    ArrayList<String> G = object.G();
    ArrayList<String> H = object.H();
    ArrayList<String> I = object.I();
    ArrayList<String> J = object.J();
    ArrayList<String> K = object.K();
    ArrayList<String> L = object.L();
    ArrayList<String> M = object.M();
    ArrayList<String> N = object.N();
    ArrayList<String> O = object.O();
    ArrayList<String> P = object.P();
    ArrayList<String> Q = object.Q();
    ArrayList<String> R = object.R();
    ArrayList<String> S = object.S();
    ArrayList<String> T = object.T();
    ArrayList<String> U = object.U();
    ArrayList<String> V = object.V();
    ArrayList<String> W = object.W();
    ArrayList<String> X = object.X();
    ArrayList<String> Y = object.Y();
    ArrayList<String> Z = object.Z();
    HashMap<String, Integer> NumTrans = object.letNumTrans();
    ArrayList<String> tempList = object.Response();

    HashMap<Integer, ArrayList<String>> letMap = object.getLetMap(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z);
    object.Output(tempList, letMap, NumTrans);
  }
}
