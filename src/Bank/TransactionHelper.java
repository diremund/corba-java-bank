//
// TransactionHelper.java (helper)
//
// File generated: Tue Dec 05 02:36:53 WEST 2023
//   by TIDorb idl2java 1.3.12
//

package Bank;

abstract public class TransactionHelper {

  private static org.omg.CORBA.ORB _orb() {
    return org.omg.CORBA.ORB.init();
  }

  private static org.omg.CORBA.TypeCode _type = null;
  public static org.omg.CORBA.TypeCode type() {
    if (_type == null) {
      _type = _orb().create_interface_tc(id(), "Transaction");
    }
    return _type;
  }

  public static String id() {
    return "IDL:Bank/Transaction:1.0";
  };

  public static void insert(org.omg.CORBA.Any any, Transaction value) {
    any.insert_Object((org.omg.CORBA.Object)value, type());
  };

  public static Transaction extract(org.omg.CORBA.Any any) {
    org.omg.CORBA.Object obj = any.extract_Object();
    Transaction value = narrow(obj);
    return value;
  };

  public static Transaction read(org.omg.CORBA.portable.InputStream is) {
    return narrow(is.read_Object(), true); 
  }

  public static void write(org.omg.CORBA.portable.OutputStream os, Transaction val) {
    if (!(os instanceof org.omg.CORBA_2_3.portable.OutputStream)) {;
      throw new org.omg.CORBA.BAD_PARAM();
    };
    if (val != null && !(val instanceof org.omg.CORBA.portable.ObjectImpl)) {;
      throw new org.omg.CORBA.BAD_PARAM();
    };
    os.write_Object((org.omg.CORBA.Object)val);
  }

  public static Transaction narrow(org.omg.CORBA.Object obj) {
    return narrow(obj, false);
  }

  public static Transaction unchecked_narrow(org.omg.CORBA.Object obj) {
    return narrow(obj, true);
  }

  private static Transaction narrow(org.omg.CORBA.Object obj, boolean is_a) {
	 
    if (obj == null) {
      return null;
    }
    if (obj instanceof Transaction) {
      return (Transaction)obj;
    }
    if (is_a || obj._is_a(id())) {
      _TransactionStub result = (_TransactionStub)new _TransactionStub();
      ((org.omg.CORBA.portable.ObjectImpl) result)._set_delegate
        (((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate());
      return (Transaction)result;
    }
    throw new org.omg.CORBA.BAD_PARAM();
  }

}
