package org.mapstruct.control;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
@MappingControls({@MappingControl(MappingControl.Use.DIRECT), @MappingControl(MappingControl.Use.BUILT_IN_CONVERSION)})
public @interface NoMappingMethod {
}