//
// TransactionHolder.java (holder)
//
// File generated: Tue Dec 05 02:36:53 WEST 2023
//   by TIDorb idl2java 1.3.12
//

package Bank;

final public class TransactionHolder
   implements org.omg.CORBA.portable.Streamable {

  public Transaction value; 
  public TransactionHolder() {
  }

  public TransactionHolder(Transaction initial) {
    value = initial;
  }

  public void _read(org.omg.CORBA.portable.InputStream is) {
    value = Bank.TransactionHelper.read(is);
  };

  public void _write(org.omg.CORBA.portable.OutputStream os) {
    Bank.TransactionHelper.write(os, value);
  };

  public org.omg.CORBA.TypeCode _type() {
    return Bank.TransactionHelper.type();
  };

}
