/*
 * Copyright (c) 2002, 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
/* Generated By:JJTree: Do not edit this line. JDMNetMask.java */

package com.sun.jmx.snmp.IPAcl;

import java.net.UnknownHostException;

class JDMNetMask extends Host {

  private static final long serialVersionUID = -1979318280250821787L;

  protected StringBuffer address = new StringBuffer();
  protected String mask = null;

  public JDMNetMask(int id) {
    super(id);
  }

  public JDMNetMask(Parser p, int id) {
    super(p, id);
  }

  public static Node jjtCreate(int id) {
    return new JDMNetMask(id);
  }

  public static Node jjtCreate(Parser p, int id) {
    return new JDMNetMask(p, id);
  }

  protected String getHname() {
    return address.toString();
  }

  protected PrincipalImpl createAssociatedPrincipal()
      throws UnknownHostException {
    return new NetMaskImpl(address.toString(), Integer.parseInt(mask));
  }
}