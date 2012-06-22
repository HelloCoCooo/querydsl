/*
 * Copyright 2011, Mysema Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mysema.query.collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.Iterator;

public abstract class AbstractIteratorTest {

    protected void assertIteratorEquals(Iterator<Object[]> a, Iterator<Object[]> b) {
        while (a.hasNext()) {
            assertEquals(Arrays.asList(a.next()), Arrays.asList(b.next()));
        }
        assertFalse(b.hasNext());
    }

    protected Object[] row(Object... row) {
        return row;
    }

}
