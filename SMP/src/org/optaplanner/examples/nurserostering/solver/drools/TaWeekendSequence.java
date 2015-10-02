/*
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.examples.nurserostering.solver.drools;

import java.io.Serializable;
import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.optaplanner.examples.nurserostering.domain.Ta;

public class TaWeekendSequence implements Comparable<TaWeekendSequence>, Serializable {

    private Ta ta;
    private int firstSundayIndex;
    private int lastSundayIndex;

    public TaWeekendSequence(Ta ta, int firstSundayIndex, int lastSundayIndex) {
        this.ta = ta;
        this.firstSundayIndex = firstSundayIndex;
        this.lastSundayIndex = lastSundayIndex;
    }

    public Ta getTa() {
        return ta;
    }

    public void setTa(Ta ta) {
        this.ta = ta;
    }

    public int getFirstSundayIndex() {
        return firstSundayIndex;
    }

    public void setFirstSundayIndex(int firstSundayIndex) {
        this.firstSundayIndex = firstSundayIndex;
    }

    public int getLastSundayIndex() {
        return lastSundayIndex;
    }

    public void setLastSundayIndex(int lastSundayIndex) {
        this.lastSundayIndex = lastSundayIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o instanceof TaWeekendSequence) {
            TaWeekendSequence other = (TaWeekendSequence) o;
            return new EqualsBuilder()
                    .append(ta, other.ta)
                    .append(firstSundayIndex, other.firstSundayIndex)
                    .append(lastSundayIndex, other.lastSundayIndex)
                    .isEquals();
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(ta)
                .append(firstSundayIndex)
                .append(lastSundayIndex)
                .toHashCode();
    }

    @Override
    public int compareTo(TaWeekendSequence other) {
        return new CompareToBuilder()
                .append(ta, other.ta)
                .append(firstSundayIndex, other.firstSundayIndex)
                .append(lastSundayIndex, other.lastSundayIndex)
                .toComparison();
    }

    @Override
    public String toString() {
        return ta + " is working the weekend of " + firstSundayIndex + " - " + lastSundayIndex;
    }

    public int getWeekendLength() {
        return ((lastSundayIndex - firstSundayIndex) / 7) + 1;
    }

}
