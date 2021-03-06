/*
 * Copyright (c) 1997, 2020 Oracle and/or its affiliates.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Eclipse Distribution License
 * v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied: GNU General Public License v2.0
 * w/Classpath exception which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause OR GPL-2.0 WITH
 * Classpath-exception-2.0
 */

package com.sun.org.omg.CORBA;


/**
* com/sun/org/omg/CORBA/ParameterMode.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from ir.idl
* Thursday, May 6, 1999 1:51:50 AM PDT
*/

public class ParameterMode implements org.omg.CORBA.portable.IDLEntity
{
    private        int __value;
    private static int __size = 3;
    private static com.sun.org.omg.CORBA.ParameterMode[] __array = new com.sun.org.omg.CORBA.ParameterMode [__size];

    public static final int _PARAM_IN = 0;
    public static final com.sun.org.omg.CORBA.ParameterMode PARAM_IN = new com.sun.org.omg.CORBA.ParameterMode(_PARAM_IN);
    public static final int _PARAM_OUT = 1;
    public static final com.sun.org.omg.CORBA.ParameterMode PARAM_OUT = new com.sun.org.omg.CORBA.ParameterMode(_PARAM_OUT);
    public static final int _PARAM_INOUT = 2;
    public static final com.sun.org.omg.CORBA.ParameterMode PARAM_INOUT = new com.sun.org.omg.CORBA.ParameterMode(_PARAM_INOUT);

    public int value ()
    {
        return __value;
    }

    public static com.sun.org.omg.CORBA.ParameterMode from_int (int value)
    {
        if (value >= 0 && value < __size)
            return __array[value];
        else
            throw new org.omg.CORBA.BAD_PARAM ();
    }

    protected ParameterMode (int value)
    {
        __value = value;
        __array[__value] = this;
    }
} // class ParameterMode
