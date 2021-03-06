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

package corba.poatest;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;

import HelloA.hello ;
import HelloA.helloHelper;

public class helloClient
{
    static hello helloRef;

    public static void main(String args[])
    {
        try{
            // create and initialize the ORB
            ORB orb = ORB.init(args, System.getProperties());

            // get the root naming context
        org.omg.CORBA.Object objRef = 
                orb.resolve_initial_references("NameService");
        NamingContext ncRef = NamingContextHelper.narrow(objRef);
 
        // resolve the Object Reference in Naming
        NameComponent nc = new NameComponent("Hello", "");
        NameComponent path[] = {nc};
        helloRef = helloHelper.narrow(ncRef.resolve(path));

        System.out.println("Obtained a handle on server object: " + helloRef);
        helloRef.sayHello();
        System.out.println("OK! Returned from oneway call !!");

        // call shutdown
        System.out.println("Invoking shutdown...");
        helloRef.shutdown();
        System.out.println("OK! Returned from shutdown!!");


        } catch (Exception e) {
            System.out.println("ERROR : " + e) ;
            e.printStackTrace(System.out);
            System.exit(1);
        }
    }

}

