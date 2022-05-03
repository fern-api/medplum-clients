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
    as = ImmutableCodeSystem_Designation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CodeSystem_Designation {
  Optional<String> value();

  Optional<List<Extension>> modifierExtension();

  Optional<Coding> use();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableCodeSystem_Designation.Builder builder() {
    return ImmutableCodeSystem_Designation.builder();
  }
}
