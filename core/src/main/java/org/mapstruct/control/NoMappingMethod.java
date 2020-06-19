package org.mapstruct.control;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * The interface No mapping method.
 * Created on Jun, 19, 2020 09:29:16 AM CST
 * @author Vayne Chung
 */
@Retention(RetentionPolicy.CLASS)
@MappingControls({@MappingControl(MappingControl.Use.DIRECT), @MappingControl(MappingControl.Use.BUILT_IN_CONVERSION)})
public @interface NoMappingMethod {
}
