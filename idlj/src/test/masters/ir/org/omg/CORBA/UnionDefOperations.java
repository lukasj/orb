package org.omg.CORBA;


/**
* org/omg/CORBA/UnionDefOperations.java .
* IGNORE Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlj/src/main/java/com/sun/tools/corba/ee/idl/ir.idl
* IGNORE Sunday, January 21, 2018 1:54:23 PM EST
*/

public interface UnionDefOperations  extends org.omg.CORBA.TypedefDefOperations, org.omg.CORBA.ContainerOperations
{
  org.omg.CORBA.TypeCode discriminator_type ();
  org.omg.CORBA.IDLType discriminator_type_def ();
  void discriminator_type_def (org.omg.CORBA.IDLType newDiscriminator_type_def);
  org.omg.CORBA.UnionMember[] members ();
  void members (org.omg.CORBA.UnionMember[] newMembers);
} // interface UnionDefOperations
