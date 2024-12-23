//
// TransactionPOATie.java (tie)
//
// File generated: Tue Dec 05 02:36:53 WEST 2023
//   by TIDorb idl2java 1.3.12
//

package Bank;

public class TransactionPOATie
 extends TransactionPOA
 implements TransactionOperations {

  private TransactionOperations _delegate;
  public TransactionPOATie(TransactionOperations delegate) {
    this._delegate = delegate;
  };

  public TransactionOperations _delegate() {
    return this._delegate;
  };

  public java.lang.String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] objectID) {
    return __ids;
  };

  private static java.lang.String[] __ids = {
    "IDL:Bank/Transaction:1.0"  };

  public java.lang.String updateDetails(java.lang.String counterId, java.lang.String date, double amountDebit, double amountCredit, java.lang.String accountId) {
    return this._delegate.updateDetails(
    counterId, 
    date, 
    amountDebit, 
    amountCredit, 
    accountId
    );
  };


}
