package uk.ac.ebi.ddi.api.readers.ftp;

import org.apache.commons.net.ftp.FTPFile;
import uk.ac.ebi.ddi.api.readers.model.IFilter;

/**
 * This code is licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * ==Overview==
 * <p>
 * This class
 * <p>
 * Created by ypriverol (ypriverol@gmail.com) on 24/01/2017.
 */
public class AbstractFilter implements IFilter<FTPFile> {

    @Override
    public boolean valid(final FTPFile file) {
        return false;
    }
}
