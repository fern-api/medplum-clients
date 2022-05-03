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
    as = ImmutableImplementationGuide_Parameter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImplementationGuide_Parameter {
  Optional<String> value();

  Optional<List<Extension>> modifierExtension();

  Optional<Implementationguide_parameterCode> code();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableImplementationGuide_Parameter.Builder builder() {
    return ImmutableImplementationGuide_Parameter.builder();
  }
}
