//
// TransactionPOA.java (skeleton)
//
// File generated: Tue Dec 05 02:36:53 WEST 2023
//   by TIDorb idl2java 1.3.12
//

package Bank;

abstract public class TransactionPOA
 extends org.omg.PortableServer.DynamicImplementation
 implements TransactionOperations {

  public Transaction _this() {
    return TransactionHelper.narrow(super._this_object());
  };

  public Transaction _this(org.omg.CORBA.ORB orb) {
    return TransactionHelper.narrow(super._this_object(orb));
  };

  public java.lang.String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] objectID) {
    return __ids;
  };

  private static java.lang.String[] __ids = {
    "IDL:Bank/Transaction:1.0"
  };

  private static java.util.Dictionary _methods = new java.util.Hashtable();
  static {
    _methods.put("updateDetails", new Integer(0));
  }

  public void invoke(org.omg.CORBA.ServerRequest _request) {
    java.lang.Object _method = _methods.get(_request.operation());
    if (_method == null) {
      throw new org.omg.CORBA.BAD_OPERATION(_request.operation());
    }
    int _method_id = ((java.lang.Integer)_method).intValue();
    switch(_method_id) {
    case 0: {
      org.omg.CORBA.NVList _params = _orb().create_list(5);
      org.omg.CORBA.Any $counterId = _orb().create_any();
      $counterId.type(org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.tk_string));
      _params.add_value("counterId", $counterId, org.omg.CORBA.ARG_IN.value);
      org.omg.CORBA.Any $date = _orb().create_any();
      $date.type(org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.tk_string));
      _params.add_value("date", $date, org.omg.CORBA.ARG_IN.value);
      org.omg.CORBA.Any $amountDebit = _orb().create_any();
      $amountDebit.type(org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.tk_double));
      _params.add_value("amountDebit", $amountDebit, org.omg.CORBA.ARG_IN.value);
      org.omg.CORBA.Any $amountCredit = _orb().create_any();
      $amountCredit.type(org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.tk_double));
      _params.add_value("amountCredit", $amountCredit, org.omg.CORBA.ARG_IN.value);
      org.omg.CORBA.Any $accountId = _orb().create_any();
      $accountId.type(org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.tk_string));
      _params.add_value("accountId", $accountId, org.omg.CORBA.ARG_IN.value);
      _request.arguments(_params);
      java.lang.String counterId;
      counterId = $counterId.extract_string();
      java.lang.String date;
      date = $date.extract_string();
      double amountDebit;
      amountDebit = $amountDebit.extract_double();
      double amountCredit;
      amountCredit = $amountCredit.extract_double();
      java.lang.String accountId;
      accountId = $accountId.extract_string();
      java.lang.String _result = this.updateDetails(counterId, date, amountDebit, amountCredit, accountId);
      org.omg.CORBA.Any _resultAny = _orb().create_any();
      _resultAny.insert_string(_result);
      _request.set_result(_resultAny);
      return;
    }
    }
  }
}
