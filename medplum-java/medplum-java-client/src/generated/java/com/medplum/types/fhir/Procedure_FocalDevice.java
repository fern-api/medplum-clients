package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableProcedure_FocalDevice.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Procedure_FocalDevice {
  Reference manipulated();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> action();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableProcedure_FocalDevice.ManipulatedBuildStage builder() {
    return ImmutableProcedure_FocalDevice.builder();
  }
}
