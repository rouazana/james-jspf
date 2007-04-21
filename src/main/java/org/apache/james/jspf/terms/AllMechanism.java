/****************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 ****************************************************************/


package org.apache.james.jspf.terms;

import org.apache.james.jspf.core.Configurable;
import org.apache.james.jspf.core.Configuration;
import org.apache.james.jspf.core.DNSResponse;
import org.apache.james.jspf.core.Mechanism;
import org.apache.james.jspf.core.SPFSession;
import org.apache.james.jspf.exceptions.NoneException;
import org.apache.james.jspf.exceptions.PermErrorException;
import org.apache.james.jspf.exceptions.TempErrorException;

/**
 * This class represent the all mechanism
 * 
 */
public class AllMechanism implements Mechanism, Configurable {

    public static final String REGEX = "[aA][lL][lL]";

    /**
     * @see org.apache.james.jspf.core.Mechanism#run(SPFSession)
     */
    public boolean run(SPFSession spfData) throws PermErrorException {
        return true;
    }

    /**
     * @see org.apache.james.jspf.core.Configurable#config(Configuration)
     */
    public void config(Configuration params) throws PermErrorException {
        // no checks needed
        // the regex only passes with no parameters
    }
    
    /**
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return "all";
    }

    /**
     * @see org.apache.james.jspf.core.Mechanism#onDNSResponse(org.apache.james.jspf.core.SPFSession)
     */
    public boolean onDNSResponse(DNSResponse response, SPFSession spfSession)
            throws PermErrorException, TempErrorException, NoneException {
        // never called
        return false;
    }

}
