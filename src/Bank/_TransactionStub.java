//
// _TransactionStub.java (stub)
//
// File generated: Tue Dec 05 02:36:53 WEST 2023
//   by TIDorb idl2java 1.3.12
//

package Bank;

public class _TransactionStub
 extends org.omg.CORBA.portable.ObjectImpl
 implements Transaction {

  public java.lang.String[] _ids() {
    return __ids;
  }

  private static java.lang.String[] __ids = {
    "IDL:Bank/Transaction:1.0"  };

  public java.lang.String updateDetails(java.lang.String counterId, java.lang.String date, double amountDebit, double amountCredit, java.lang.String accountId) {
    org.omg.CORBA.Request _request = this._request("updateDetails");
    _request.set_return_type(org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.tk_string));
    org.omg.CORBA.Any $counterId = _request.add_named_in_arg("counterId");
    $counterId.insert_string(counterId);
    org.omg.CORBA.Any $date = _request.add_named_in_arg("date");
    $date.insert_string(date);
    org.omg.CORBA.Any $amountDebit = _request.add_named_in_arg("amountDebit");
    $amountDebit.insert_double(amountDebit);
    org.omg.CORBA.Any $amountCredit = _request.add_named_in_arg("amountCredit");
    $amountCredit.insert_double(amountCredit);
    org.omg.CORBA.Any $accountId = _request.add_named_in_arg("accountId");
    $accountId.insert_string(accountId);
    _request.invoke();
    java.lang.Exception _exception = _request.env().exception();
    if (_exception != null) {
      if (_exception instanceof org.omg.CORBA.UnknownUserException) {
        org.omg.CORBA.UnknownUserException _userException = 
          (org.omg.CORBA.UnknownUserException) _exception;
      }
      throw (org.omg.CORBA.SystemException) _exception;
    };
    java.lang.String _result;
    _result = _request.return_value().extract_string();
    return _result;
  }


}
