/**
 *  Copyright 2012-2015 Gunnar Morling (http://www.gunnarmorling.de/)
 *  and/or other contributors as indicated by the @authors tag. See the
 *  copyright.txt file in the distribution for a full listing of all
 *  contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.mapstruct.ap.internal.conversion;

import static org.mapstruct.ap.internal.util.Collections.asSet;

import java.util.Date;
import java.util.Set;

import org.mapstruct.ap.internal.model.common.ConversionContext;
import org.mapstruct.ap.internal.model.common.Type;

/**
 * Conversion between the following Joda types and {@link Date}:
 * <ul>
 * <li>org.joda.time.DateTime</li>
 * <li>org.joda.time.LocalDateTime</li>
 * <li>org.joda.time.LocalDate</li>
 * </ul>
 *
 * @author Timo Eckhardt
 */
public class JodaTimeToDateConversion extends SimpleConversion {

    @Override
    protected String getToExpression(ConversionContext conversionContext) {
        return "<SOURCE>.toDate()";
    }

    @Override
    protected String getFromExpression(ConversionContext conversionContext) {
        return "new " + conversionContext.getTargetType().getName() + "( <SOURCE> )";
    }

    @Override
    protected Set<Type> getFromConversionImportTypes(ConversionContext conversionContext) {
        return asSet( conversionContext.getTargetType() );
    }
}
